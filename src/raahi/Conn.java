package raahi;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c=DriverManager.getConnection("jdbc:mysql:///tms","root","mohit");
           s=c.createStatement();
        }catch(Exception e){
            
        }
    }
}
