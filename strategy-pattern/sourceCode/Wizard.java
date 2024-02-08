package sourceCode;
public class Wizard implements AttackStrat, DefenseStrat{

    @Override
    public String attack(){
        return "Wizard casts a spell!";
    }
    @Override
    public String defend(){
        return "Creating a magic barrier for defense!";
    }
}