package Q3.Prog701g;

// admin is a child of the parent class "person"
public class Admin extends Person {
    private String myFavw;
    // Inherited myfirst and mylast from person

    public Admin(String fn, String ln, String fav) {
        super(fn, ln); // call constructor of super/parent class
        myFavw = fav;
    }

    public String getFavw() { return myFavw; }
}
