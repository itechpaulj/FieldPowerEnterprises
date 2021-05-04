/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE2;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Class_Process {

    public static boolean Process(String brand3, String model3, String kva3, String phasing3, String unit_type3, String dimen3, String fuel_tank3, String price3, String engines_sn3, String alters_sn3, byte [] images1, String date3, String quotation, String c_name, String c_address, String c_email, String c_contact, String agent_name, String agent_contact){
        PreparedStatement ps = null;

        try{
        ps = FPE_DB.getConnection().prepareStatement("INSERT INTO `bin_genset`(`BRAND`, `MODEL`, `KVA`, `PHASING`, `UNIT_TYPE`, `DIMENSION`, `TANK_CAP`, `PRICE`, `ENGINE_SERIAL_NO`, `ALTERNATOR`, `IMAGE`, `DATE`, `QUOTATION`, `CUSTOMER_NAME`, `CUSTOMER_ADDRESS`, `CUSTOMER_EMAIL`, `CUSTOMER_CONTACT`, `AGENT_NAME`, `AGENT_CONTACT`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, brand3);
        ps.setString(2, model3);
        ps.setString(3, kva3);
        ps.setString(4, phasing3);
        ps.setString(5, unit_type3);
        ps.setString(6, dimen3);
        ps.setString(7, fuel_tank3);
        ps.setString(8, price3);
        ps.setString(9, engines_sn3);
        ps.setString(10, alters_sn3);
        ps.setBytes(11, images1);
        ps.setString(12, date3);
        ps.setString(13, quotation);
        ps.setString(14, c_name);
        ps.setString(15, c_address);
        ps.setString(16, c_email);
        ps.setString(17, c_contact);
        ps.setString(18, agent_name);
        ps.setString(19, agent_contact);
        ps.execute();
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }   
     return false;
    }
}
