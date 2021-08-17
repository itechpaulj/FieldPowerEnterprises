/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static FPE.Print_Reciept_Generator.print_genset;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Robles
 */
public class Class_Print {
    public boolean PrintGensetReciept(){
        try{
        PreparedStatement ps = FPE_DB.getConnection().prepareStatement("SELECT   `BRAND`, `MODEL`, `KVA`, `PHASING`, `TYPE`,  `SELLER PRICE` AS `PRICE`, `QUANTITY`, `TOTAL PRICE` FROM `history_table` WHERE `PROJECT NO`= "+Print_Reciept_Generator.p_no+"");
        ResultSet rs = ps.executeQuery();
        print_genset.setModel(DbUtils.resultSetToTableModel(rs));
        print_genset.getColumnModel().getColumn(0).setMaxWidth(100);
        }catch(Exception e){
              //System.out.println(e);
            }
        return false;
    }
}
