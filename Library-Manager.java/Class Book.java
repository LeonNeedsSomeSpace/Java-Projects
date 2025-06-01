public class Book {

    //Declare variables in which data will be stored
    private String Title; //Variable for the title of the book
    private String Authors; //Variable for the name(s) of the author(s)
    private String ISBN; //Variable for the ISBN of the respective book
    private boolean isBorrowed; //Status of the book (whether it is borrowed or not)
//Boolean functions return true or false. Since there is two possibilities here boolean will be used

    //Make them public and assign the values accordingly
    public Book(String Title, String Authors, String ISBN){
        this.Title = Title;
        this.Authors = Authors;
        this.ISBN = ISBN;
        this.isBorrowed = false;
    }


    //Define multiple functions that will return the desired value


    public String getTitle() {

        return Title;
    }

    public String getAuthors() {

        return Authors;
    }

    public String getISBN() {

        return ISBN;
    }

    public boolean getBorrowed(){
        return isBorrowed;
    }

    public void setBorrowed(boolean Borrowed) {

        isBorrowed = Borrowed;
    }

    //Format information about the book, including its status
    //'@Override' helps the compiler understand what your intention is
    //Putting '@Override' over a method means that if there is an error in spelling (or a similar mistake), an error will be returned
    //This way, bugs can be prevented
    @Override
    public String toString() {
        return "Title: " + Title + ", Author: " + Authors + ", ISBN: " + ISBN + ", Status: " + (isBorrowed ? " Borrowed " : "Available");
    }
}
