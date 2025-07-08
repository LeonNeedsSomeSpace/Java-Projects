import java.util.ArrayList;
import java.util.List;


public class Users {

    //Create fields to store userdata
    private int userprofile;
    private String name;
    private String contact;

    //Constructor to initialize new users
    public Users(int userprofile, String name, String contact) {
        this.userprofile = userprofile;
        this.name = name;
        this.contact = contact;
    }

    //Retrieve userprofile
    public int getuserprofile() {
        return userprofile;
    }

    //Retrieve user's name
    public String getname(){
        return name;
    }

    //Retrieve user's contact data
    public String getcontact(){
        return contact;
    }

    @Override
    public String toString() {
        return "User Profile ID: " + userprofile + ", Name: " + name + ", Contact data: " + contact;
    }

}
