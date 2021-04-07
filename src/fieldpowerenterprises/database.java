package fieldpowerenterprises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Javinez
 */
//import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;

public class database {

    
    public static final Connection getConnection() {
        Connection con = null;
        
        
        // constant variable or unique variable
        final String driver = "com.mysql.jdbc.Driver";
        final String host = "jdbc:mysql://localhost:";
        final String port = "3306/";
        final String db = "fieldpowerenterprises";
        final String userRoot = "root";
        final String passwordRoot = "";
        final String concatAddresUrl= host+port+db;
        
        try{
        Class.forName(driver);
        con=(Connection)DriverManager.getConnection(concatAddresUrl,userRoot,passwordRoot);
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return con;
        
    }
    
}
