package is.hi.hbv401g.team1h;

//testing somehting

import org.jdbi.v3.core.Jdbi;

public class Main {
    public static void main(String[] args) {
        Jdbi jdbi = Jdbi.create("jdbc:mysql://localhost:3306/hbv401g");
    }
}