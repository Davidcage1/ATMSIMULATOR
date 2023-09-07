package ASimulatorSystem;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/mca","root","Paras@2");
            System.out.println(c.isClosed());
            s =c.createStatement();
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  