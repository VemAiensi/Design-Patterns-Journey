package sourceCode;
public class Character {
    private AttackStrat attackStrat;
    private DefenseStrat defenseStrat;

    public Character(AttackStrat attackStrat, DefenseStrat defenseStrat) {
        this.attackStrat = attackStrat;
        this.defenseStrat = defenseStrat;
    }

    public void attack(){
        System.out.println("\t" + attackStrat.attack());
    }

    public void defend(){
        System.out.println("\t" + defenseStrat.defend());
    }
}
