package sourceCode;

import sourceCode.attackMoves.SwordAttack;
import sourceCode.defenseMoves.DefenseStrat;
import sourceCode.defenseMoves.Dodge;
import sourceCode.defenseMoves.Magic;
import sourceCode.defenseMoves.Shield;

public class Knight implements Role{

    @Override
    public String attack(){
        return new SwordAttack().attack();
    }

    @Override
    public String defend(){
        DefenseStrat shield = new Shield();
        DefenseStrat dodge = new Dodge();
        DefenseStrat magic = new Magic();
        
        String defendStrat = "";

        defendStrat += shield.defend() + "\n\t";
        defendStrat += dodge.defend()  + "\n\t";
        defendStrat += magic.defend();

        return defendStrat;
    }

   
}