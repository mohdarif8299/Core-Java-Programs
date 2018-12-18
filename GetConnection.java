import java.sql.*;
import java.io.*;
public class GetConnection {
  static Connection connection;
  public static Connection getDBConnection() {
    try {
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/PHONE","root","Ma9891228493");
    }
    catch (Exception e) {
      System.out.println(e);
    }
     return connection;
  }
}
