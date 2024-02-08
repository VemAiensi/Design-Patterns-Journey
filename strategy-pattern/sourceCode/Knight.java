package sourceCode;
public class Knight implements AttackStrat, DefenseStrat{

    @Override
    public String attack(){
        return "Knight attacks with a sword!";
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