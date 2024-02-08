package sourceCode;
public class Character {
    private AttackStrat attackStrat;
    private DefenseStrat defenseStrat;

    public Character(String type) {
        switch(type){
            case "Knight":
                this.attackStrat = new Knight();
                this.defenseStrat = new Knight();
                break;
            case "Wizard": 
                this.attackStrat = new Wizard();
                this.defenseStrat = new Wizard();
                break;
            case "Archer": 
                this.attackStrat = new Archer();
                this.defenseStrat = new Wizard();
                break;
        }
        
    }

    public void attack(){
        System.out.println("\t" + attackStrat.attack());
    }

    public void defend(){
        System.out.println("\t" + defenseStrat.defend());
    }
}
