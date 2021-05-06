
package FPE;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class FPE_DB {
        public static final Connection getConnection() {
        Connection con = null;
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/fpe","root","");
        
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error!\nNetworked Failure","",JOptionPane.ERROR_MESSAGE);
        }
        
        return con;
        //database
        
    }
}
