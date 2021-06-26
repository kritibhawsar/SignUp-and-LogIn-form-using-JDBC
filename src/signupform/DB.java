package signupform;
import java.sql.*;
public class DB {
    static Connection con=null;
    public static Connection DBConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SignUp ?autoReconnect=true&useSSL=false","root","password");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
