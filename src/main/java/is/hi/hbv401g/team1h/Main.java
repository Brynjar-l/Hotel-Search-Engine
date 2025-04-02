package is.hi.hbv401g.team1h;



import org.jdbi.v3.core.Jdbi;
import is.hi.hbv401g.team1h.UIclasses.HomeApplication;
import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        // Connect to database
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/hbv401g");

        // Launch JavaFX application
        Application.launch(HomeApplication.class, args);
    }

}