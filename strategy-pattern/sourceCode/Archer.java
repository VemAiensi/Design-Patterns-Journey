package sourceCode;
public class Archer implements AttackStrat, DefenseStrat{

    @Override
    public String attack(){
        return "Archer shoots an arrow!";
    }

    @Override
    public String defend(){
        return new Shield().defend();
    }
}