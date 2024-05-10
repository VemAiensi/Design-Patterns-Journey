public class NeuLibrary {
    public static void main(String[] args) {
        Student stud1 = new Student("Vem Aiensi", "21-11295-310");

        Book book1 = new Book("physical", "How to Gain More Power");
        Book book2 = new Book("audio-book", "Vergil's SMR Podcast");
        Book book3 = new Book("journal", "The Trauma of Losing and Finding Motivation");

        BookProcessor processPB = new BookProcessor(new PBHandler());
        BookProcessor processAB = new BookProcessor(new ABHandler());
        BookProcessor processJB = new BookProcessor(new JHandler());

        //using handlers to borrow different types of books
        System.out.println(stud1.getName() + processPB.borrow(book1));
        System.out.println(stud1.getName() + processAB.borrow(book2));
        System.out.println(stud1.getName() + processJB.borrow(book3));
        //for mismatch category
        System.out.println(stud1.getName() + processJB.borrow(book2));
    }
}
