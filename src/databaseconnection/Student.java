package databaseconnection;

public class Student {

    public String id;
    public String firstName;
    public String lastName;
    public String scores;


    public Student(){
    }
    public Student(String firstName) {
        this.firstName = firstName;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, String scores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
    }

    public Student(String firstName, String lastName, String scores, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = scores;
        this.id = id;
    }
/*
Encapsulation:
--------------
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
To achieve this, you must:
--------------------------
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable
private variables can only be accessed within the same class (an outside class has no access to it).
However, it is possible to access them if we provide public get and set methods
*/
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getScores() {
        return scores;
    }

    public void setScores(String scores) {
        this.scores = scores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores='" + scores + '\'' +
                '}';
    }
}
