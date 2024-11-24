package databaseconnection;

/*
Encapsulation:
--------------
Encapsulation in Java is a fundamental principle of object-oriented programming (OOP) that involves:
Bundling data and methods:
Combining data (variables) and the methods that operate on that data into a single unit, which is a class.

Data hiding:
------------
Restricting access to the internal state of an object by making the data members private.
This prevents direct access from outside the class.

Controlled access:
------------------
Providing public methods (getters and setters) to interact with the data members in a controlled manner.

Benefits of encapsulation:
--------------------------
1. Improves security: Protects data from unauthorized access and modification.
2. Increases modularity: Makes code easier to understand and maintain by hiding implementation details.
3. Enhances flexibility: Allows you to change the internal implementation of a class without impacting the code that uses it.

The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
To achieve this, you must:
--------------------------
1. declare class variables/attributes as private
2. provide public get and set methods to access and update the value of a private variable
Note:
-----
private variables can only be accessed within the same class (an outside class has no access to it).
However, it is possible to access them if we provide public get and set methods
*/
public class Movies {

    private int id;
    private String title;
    private int releaseYear;
    private String genre;
    private String mpaaRating;


    public Movies(int id, String title, int releaseYear, String genre, String mpaaRating) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.mpaaRating = mpaaRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }
}
