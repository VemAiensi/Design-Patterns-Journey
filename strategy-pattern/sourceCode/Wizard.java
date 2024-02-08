package sourceCode;
import sourceCode.attackMoves.CastMagic;
import sourceCode.defenseMoves.Magic;

public class Wizard implements Role{

    @Override
    public String attack(){
        return new CastMagic().attack();
    }
    @Override
    public String defend(){
        return new Magic().defend();
    }
}