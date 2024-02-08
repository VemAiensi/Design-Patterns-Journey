package sourceCode;
public class Wizard implements AttackStrat, DefenseStrat{

    @Override
    public String attack(){
        return "Wizard casts a spell!";
    }
    @Override
    public String defend(){
        return new Magic().defend();
    }
}