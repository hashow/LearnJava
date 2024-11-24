package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MovieDatabaseConnection {

    public static void main(String[] args) throws SQLException {

        //JDBC connection details
        String url = "jdbc:mysql://localhost:3306/testDB?serverTimezone=UTC&useSSL=false";
        String username = "root";
        String password = "RaH423!N";

        Connection connection = null;
        Statement statement = null;

        Movies titanic = new Movies(2,"Titanic",1997, "Romance", "PG-13");
        Movies grudge = new Movies(3,"Grudge",2003, "Horror", "PG-13");
        Movies inception = new Movies(4,"Inception",2010, "Thriller", "PG-13");

        ArrayList<Movies> mvs = new ArrayList<>();
        mvs.add(titanic);
        mvs.add(grudge);
        mvs.add(inception);

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();

            for (Movies mv : mvs) {
                String query = "insert into movies(id, title, releaseYear, genre, mpaaRating)" +
                        "values(" + mv.getId() + ",'" + mv.getTitle() + ",'" + mv.getReleaseYear() + ",'" + mv.getGenre()
                        + ",'" + mv.getMpaaRating() + "')";
                statement.executeQuery(query);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            statement.close();
            connection.close();
        }
    }
}
