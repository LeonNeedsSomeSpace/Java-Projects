import java.util.ArrayList;
import java.util.List;

public class Reader {
    //Declare variables
    private int readerprofile; //Data of the reader and their unique identity
    private String name; //Name of the reader
    private List <Book> borrowed; //Stores data about what book the reader has borrowed
    private String contact; //Contact info of the reader (provided mail)

    //Make them public and assign their values
    public Reader(int readerprofile, String name, String contact) {
        this.readerprofile = readerprofile;
        this.name = name;
        this.contact = contact;
        this.borrowed = new ArrayList<>();

    }

    //Define multiple functions that will return the desired value

    public int getreaderprofile() {
        return readerprofile;
    }

    public String getname(){
        return name;
    }

    public String getcontact(){
        return contact;
    }

    public List<Book> getBorrowed() {
        return borrowed;
    }

    public boolean returnBook(Book book){
        if (borrowed.remove(book)){ //The book will be removed if it is borrowed
            book.setBorrowed(false); //Once the book is removed, it will be set false
            return true;
        }
        return false;
    }


    //Method that tries to check on whether the book has been borrowed or not
    public boolean borrow(Book book){
        if (!book.getBorrowed()){ //It adds the book to the borrowed collection if the book has not been borrowed
            borrowed.add(book);
            book.setBorrowed(true); //The status gets set to true for whether the book has been borrowed if borrowed successfully
            return true;
        }
        return false;
    }
    @Override

    //Return data of the reader (including name and contact info)
    public String toString() {
        return "Reader Data: " + readerprofile + " Name: " + name + " Contact: " + contact;
    }
}
