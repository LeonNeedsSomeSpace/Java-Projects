import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private String name; //Library name
    private List<Book> books; //All books in the library
    private Map<Integer, Reader> readers; //Map the id of the reader (readerdata) to the Reader object

    public Library(String name) {
        this.name = name; //Assign a value to the 'name' parameter to the instance parameter 'name'
        this.books = new ArrayList<>(); //Initialize book list
        this.readers = new HashMap<>(); //Initialize readermap

    }

    //Add books to the library
    public void newBook(Book book) {
        books.add(book);
    }

    //Add method of implementation for showing the desired books
    public void displayBooks() {
        if (books.isEmpty()){
            System.out.println("No books in the library.");
            return;
        }
        //This is needed in order to print the details of the books
        for (Book book: books){
            System.out.println(book);
        }
    }

    //Register the data of the readers
    public void registerReader(Reader reader) { //Define a method that returns void
    //The reason that this exists despite returning nothing is because the whole function adds 'reader' into a map called 'readers'
        readers.put(reader.getreaderprofile(), reader);
    }
    //Retrieve the reader by the provided data
    public boolean borrow(int readerprofile, String ISBN) {
        Reader reader = readers.get(readerprofile);
        if (reader == null) {
            System.out.println("Reader not found");
            return false;
        }
        //Look for books by ISBN
        //It iterates through and tries to find the desired book by its assigned ISBN code
        for (Book book: books) {
            if (book.getISBN().equals(ISBN)){//If the book is found, it calls the 'borrow()' method on the reader object
                return reader.borrow(book);
            }
        }
        System.out.println("Book not found"); //If book is not found, it returns an error
        return false;
    }

    //Retrieve readers by their data
    //This boolean will make sure that the reader who returns the book as well as the borrowed book will get shown
    public boolean returnBook(int readerprofile, String ISBN) {
        Reader reader = readers.get(readerprofile);
        if (reader == null) {
            System.out.println("Reader not found!");
            return false;
        }
        //Iterate through the books and search for a desired book by ISBN
        //'wantedBook' starts with null, and the value gets assigned to it once the desired book gets found
        Book wantedBook = null;
        for (Book book: reader.getBorrowed()){
            if (book.getISBN().equals(ISBN)) {
                wantedBook = book; //Value stored in 'wantedBook' gets assigned to 'book'
                break;
            }
        }
        if (wantedBook != null){
            return reader.returnBook(wantedBook);
        }
        System.out.println("Book not borrowed by this reader");
        return false;
    }

    //Iterate through all readers
    //The goal of this void function is to show information about each reader
    public void showReaders() {
        for (Reader reader: readers.values()) {
            System.out.println(reader);
            System.out.println("Borrowed Books: "); // The reader that has borrowed a book will have the borrowed book printed besides them
            for (Book book: reader.getBorrowed()) {
                System.out.println("  -  " + book.getTitle());
            }
            System.out.println();
        }
    }
}
