public class Main {
    public static void main(String[] args) {
        Library library = new Library ("Main Library");

        //Provide data about the books
        library.newBook(new Book("Engineering Mechanics 1: Statics", "Dietmar Gross, Werner Hauger, Jörg Schröder, Wolfgang A.Wall, Nimal Rajapakse", "978-3642303180"));
        library.newBook(new Book("C++ Primer Plus (Developer's Library)", "Stephen Prata", "978-0321776402"));
        library.newBook(new Book("Electrical Engineering", "Viktor Hacker, Christof Sumereder", "978-3110521023"));

        //Provide data about the readers
        library.registerReader(new Reader(1, "Person X", "x@random.com"));
        library.registerReader(new Reader(2, "Person Y", "y@random.com"));

        //Readers borrow books
        library.borrow(1, "978-3642303180");
        library.borrow(2, "978-3110521023");

        //Print out which books are currently available and which are not
        //Also print out who borrowed these books
        System.out.println("Status of the library: \n");
        library.displayBooks();
        System.out.println();
        library.showReaders();

        library.returnBook(2, "978-3110521023");

        //Print out the status after a book as been returned by reader 2
        System.out.println("\nAfter returning the book: \n");
        library.displayBooks();

    }
}
