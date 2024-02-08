package sourceCode;


public class Character {
    private Role role;
    

    public Character(Role role) {
        this.role = role;
    }

    public void attack(){
        System.out.println("\t" + role.attack());
    }

    public void defend(){
        System.out.println("\t" + role.defend());
    }
}
