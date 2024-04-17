public class SavingsAccount implements Account{
    private String bankName;
    private double balance;

    public String getBankName() {
        return bankName;
    }

    public SavingsAccount(String bankName, double balance){
        this.bankName = bankName;
        this.balance = balance;
    }

    @Override
    public double accept(InterestCalculator calculator, double money) {
        this.balance = money;
        return calculator.computeInterest(bankName, balance);
    }
    @Override
    public double accept(Insurance insurance, double money) {
        this.balance = money;
        return insurance.computeInsurance(bankName, balance);
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }
}