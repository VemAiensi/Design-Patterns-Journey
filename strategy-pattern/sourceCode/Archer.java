package sourceCode;
public class Archer implements AttackStrat, DefenseStrat{

    @Override
    public String attack(){
        return "Archer shoots an arrow!";
    }

    public String defend(){
        return "Using a shield to defend!";
    }
}