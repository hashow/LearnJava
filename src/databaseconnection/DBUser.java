package databaseconnection;

public class DBUser {
    private String stName;
    private String stID;
    private String stDOB;
    /*
    We are creating constructors for default and all variables as well as getter and setter
    because we are going to use this in our ConnectDB clas
     */
    public DBUser() {
    }

    public DBUser(String stName) {
        this.stName = stName;
    }

    public DBUser(String stName, String stID) {
        this.stName = stName;
        this.stID = stID;
    }

    public DBUser(String stName, String stID, String stDOB) {
        this.stName = stName;
        this.stID = stID;
        this.stDOB = stDOB;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStDOB() {
        return stDOB;
    }

    public void setStDOB(String stDOB) {
        this.stDOB = stDOB;
    }
}
