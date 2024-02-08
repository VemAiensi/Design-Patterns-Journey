package sourceCode;
import sourceCode.attackMoves.UseBow;
import sourceCode.defenseMoves.Shield;

public class Archer implements Role{

    @Override
    public String attack(){
        return new UseBow().attack();
    }

    @Override
    public String defend(){
        return new Shield().defend();
    }
}