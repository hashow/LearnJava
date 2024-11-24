package databaseconnection;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*
Database Connection:
-----------------------
For database connection, we need the following things:
1. create a property file:
------------------------- In secret.property file, we will keep all secret informations like- username, password etc
2. jdbc driver
3. jdbc url
4. configure jdbc
5. MySQL queries
 */
public class ConnectDB {

    public static Connection connect = null;
    public static Statement statement = null;
    public static PreparedStatement ps = null;
    public static ResultSet resultSet = null;

    //creating loadProperties() method using Properties class to load the secret.properties file
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        InputStream ism = new FileInputStream("C:/Users/akhte/IdeaProjects/LearnJava/src/databaseconnection/secret.properties");
        prop.load(ism);
        ism.close();
        return prop;
    }

    public static Connection connectToSqlDatabase() throws IOException, ClassNotFoundException, SQLException {
        Properties prop = loadProperties();
        String driverClass = prop.getProperty("MYSQLJDBC.driver");
        String url = prop.getProperty("MYSQLJDBC.url");
        String userName = prop.getProperty("MYSQLJDBC.userName");
        String password = prop.getProperty("MYSQLJDBC.password");

        Class.forName(driverClass);
        connect = DriverManager.getConnection(url, userName, password);
        System.out.println("Database connection created");
        return connect;
    }

    public List<String> readDatabase(String tableName, String columnName) throws Exception {
        List<String> data = new ArrayList<String>();
        try {
            connectToSqlDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM " + tableName);
            data = getResultSetData(resultSet, columnName);
            System.out.println(data);
        }catch (ClassNotFoundException e){
            throw e;
        }finally {
            close();
        }
        return data;
    }

    public List<String> directDatabaseQueryExecute(String passQuery, String dataColumn) throws Exception{
        List<String> data = new ArrayList<String>();
        try {
            connectToSqlDatabase();
            statement = connect.createStatement();
            resultSet = statement.executeQuery(passQuery);
            data = getResultSetData(resultSet, dataColumn);
            System.out.println(data);
        }catch (ClassNotFoundException e){
            throw e;
        }finally {
            close();
        }
        return data;
    }

    public static void close(){
        try {
            if (resultSet !=null){
                resultSet.close();
            }
            if (statement !=null){
                statement.close();
            }
            if (connect !=null){
                connect.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<String> getResultSetData(ResultSet resultSet, String columnName) throws SQLException{
        List<String> dataList = new ArrayList<String>();
        while (resultSet.next()){
            String itemName = resultSet.getString(columnName);
            dataList.add(itemName);
        }
        return dataList;
    }

    public void insertDataFromArrayToSqlTable(int[] ArrayData, String tableName, String columnName){
        try {
            connectToSqlDatabase();
            ps = connect.prepareStatement("DROP TABLE IF EXIST '" + tableName + "';");
            ps.executeUpdate();
            ps = connect.prepareStatement("CREATE TABLE '" + tableName + "' ('ID' int(10) NOT NULL AUTO INCREMENT, 'SortingNumbers' bigint(20) DEFAULT NULL PRIMARY KEY ('ID))");
            ps.executeUpdate();

            for (int n = 0; n <ArrayData.length; n ++){
                ps = connect.prepareStatement("INSERT INTO '" + tableName + "( " + columnName + ") VALUES(?)");
                ps.setInt(1, ArrayData[n]);
                ps.executeUpdate();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void insertDataFromStringToSqlTable(String ArrayData, String tableName, String columnName) throws IOException, ClassNotFoundException {
        try {
            ps = connect.prepareStatement("INSERT INTO " + tableName + " ( " + columnName + ") VALUES(?)");
            ps.setString(1, ArrayData);
            ps.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
        //connectToSqlDatabase();
        ConnectDB cdb = new ConnectDB();
        cdb.readDatabase("movies", "genre");


    }
}
