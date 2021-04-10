/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldpowerenterprises;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Javinez pogi
 */
public class login {
    
    //Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    /* process login */
//    public login() throws ClassNotFoundException, SQLException{
//        String driver = "com.mysql.cj.jdbc.Driver";
//        String server = "jdbc:mysql://localhost:";
//        String port = "3306/";
//        String db = "fieldpowerenterprises";
//        String user = "root";
//        String pass = "";
//        String concat = server+port+db;
//        
//        
//        try{
//            Class.forName(driver);
//            con = (Connection)DriverManager.getConnection(concat,user,pass);   
//        }
//        catch(SQLException | ClassNotFoundException e){
//            e.printStackTrace();
//        }
//    }
    /* process login */
    
    public boolean access_levelLogin(String username, String password) throws SQLException{
        
        try{
            String sqlaccesslevel = "Select `username`, `password`  from `login_tbl` where `username`='"+username+"' AND `password`='"+password+"' ";
            pst= (PreparedStatement)database.getConnection().prepareStatement(sqlaccesslevel);
            rs=pst.executeQuery();

            if(rs.next()==true){
                JOptionPane.showMessageDialog(null,"Login Success!","",JOptionPane.INFORMATION_MESSAGE);
                return true; 
            }
            else{
                JOptionPane.showMessageDialog(null,"Login Failed!","",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
       //jc
        
    }
}
