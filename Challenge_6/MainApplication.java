package Challenge_6;

public class MainApplication {

    public static void main(String[] args) {

        Admin curAdmin = new Admin(1609, "Mercy", "xa1@LW42%3");

        User curUser = new User(1110, "Victor");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.


    }

}
