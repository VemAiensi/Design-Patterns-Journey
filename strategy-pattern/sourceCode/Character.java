package sourceCode;
public class Character {
    private AttackStrat attackStrat;
    private DefenseStrat defenseStrat;

    public Character(String type) {
        if (type.equals("Knight")){
            this.attackStrat = new Knight();
            this.defenseStrat = new Knight();
        }
        else if(type.equals("Wizard")){
            this.attackStrat = new Wizard();
            this.defenseStrat = new Wizard();
        }
        else if(type.equals("Archer")){
            this.attackStrat = new Archer();
            this.defenseStrat = new Archer();
        }  
    }

    public void attack(){
        System.out.println("\t" + attackStrat.attack());
    }

    public void defend(){
        System.out.println("\t" + defenseStrat.defend());
    }
}
