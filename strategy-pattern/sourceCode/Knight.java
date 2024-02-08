package sourceCode;
public class Knight implements AttackStrat, DefenseStrat, KnightDefendStrat{

    @Override
    public String attack(){
        return "Knight attacks with a sword!";
    }

    @Override
    public String defend(){
        String defendStrat = "";

        defendStrat += shield();
        defendStrat += dodge();
        defendStrat += magic();

        return defendStrat;
    }

    @Override
    public String shield(){
       return "Using a shield to defend! \n\t";
    }

    @Override
    public String dodge(){
       return "Dodging to avoid attack! \n\t";
    }

    @Override
    public String magic(){
       return "Creating a magic barrier for defense!";
    }
}