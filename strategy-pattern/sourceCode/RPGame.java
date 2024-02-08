package sourceCode;
public class RPGame{
    public static void main(String args[]){
        System.out.println("Welcome to the RPG Game!");

        System.out.println("\nGem is a Wizard");
        Character gem = new Character("Wizard");
        gem.attack();
        gem.defend();

        System.out.println("\nVem is a Knight");
        Character vem = new Character("Knight");
        vem.attack();
        vem.defend();

        System.out.println("\nAien is an Archer");
        Character aien = new Character("Archer");
        aien.attack();
        aien.defend();

        System.out.println("\n-------[ Strategy Pattern ]-------\n" +
                        "by Marasigan, Vem Aiensi : 3BSCS-1");
    }
}