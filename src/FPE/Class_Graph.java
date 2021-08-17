/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Class_Graph {

    public static int yandong = 0;
    public static int isuzu = 0;
    public static int perkins = 0;
    public static int cummins = 0;
    public static int weifang = 0;
    public static int yamada = 0;
    
    public static PreparedStatement ps_isuzu ;
    public static PreparedStatement ps_yandong ;
    public static PreparedStatement ps_perkins ;
    public static PreparedStatement ps_cummins ;
    public static PreparedStatement ps_weifang ;
    public static PreparedStatement ps_yamada ;

    public static ResultSet rs_isuzu ;
    public static ResultSet rs_yandong ;
    public static ResultSet rs_perkins ;
    public static ResultSet rs_cummins ;
    public static ResultSet rs_weifang ;
    public static ResultSet rs_yamada ;
    
    public static boolean DefaultGraph(){
       
    boolean status = false;
    int total_sale = 0;
    try{
    ps_isuzu   = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `ISUZU` FROM `history_table` WHERE `BRAND`='ISUZU'");
    ps_yandong = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `YANDONG` FROM `history_table` WHERE `BRAND`='YANDONG'");
    ps_perkins = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `PERKINS` FROM `history_table` WHERE `BRAND`='PERKINS'");
    ps_cummins = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `CUMMINS` FROM `history_table` WHERE `BRAND`='CUMMINS'");
    ps_weifang = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `WEIFANG` FROM `history_table` WHERE `BRAND`='WEIFANG'");
    ps_yamada  = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `YAMADA` FROM `history_table` WHERE `BRAND`='YAMADA'");

    rs_isuzu   = ps_isuzu.executeQuery();
    rs_yandong = ps_yandong.executeQuery();
    rs_perkins = ps_perkins.executeQuery();
    rs_cummins = ps_cummins.executeQuery();
    rs_weifang = ps_weifang.executeQuery();
    rs_yamada  = ps_yamada.executeQuery();

    while(rs_isuzu.next()){
    isuzu = rs_isuzu.getInt("ISUZU");

     }
    while(rs_yandong.next()){
    yandong = rs_yandong.getInt("YANDONG");

     }
    while(rs_perkins.next()){
    perkins = rs_perkins.getInt("PERKINS");

     }
    while(rs_cummins.next()){
    cummins = rs_cummins.getInt("CUMMINS");

     }
    while(rs_weifang.next()){
    weifang = rs_weifang.getInt("WEIFANG");

     }
    while(rs_yamada.next()){
    yamada = rs_yamada.getInt("YAMADA");

     }

    }catch(Exception e){
       e.printStackTrace();
    }    
    return false;
    }
    
    public static boolean MonthGraph(){
       
    boolean status = false;
    int total_sale = 0;
    try{
    ps_isuzu   = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `ISUZU` FROM `history_table` WHERE `BRAND`='ISUZU' AND  ");
    ps_yandong = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `YANDONG` FROM `history_table` WHERE `BRAND`='YANDONG'");
    ps_perkins = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `PERKINS` FROM `history_table` WHERE `BRAND`='PERKINS'");
    ps_cummins = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `CUMMINS` FROM `history_table` WHERE `BRAND`='CUMMINS'");
    ps_weifang = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `WEIFANG` FROM `history_table` WHERE `BRAND`='WEIFANG'");
    ps_yamada  = FPE_DB.getConnection().prepareStatement("SELECT SUM(`QUANTITY`) AS `YAMADA` FROM `history_table` WHERE `BRAND`='YAMADA'");

    rs_isuzu   = ps_isuzu.executeQuery();
    rs_yandong = ps_yandong.executeQuery();
    rs_perkins = ps_perkins.executeQuery();
    rs_cummins = ps_cummins.executeQuery();
    rs_weifang = ps_weifang.executeQuery();
    rs_yamada  = ps_yamada.executeQuery();

    while(rs_isuzu.next()){
    isuzu = rs_isuzu.getInt("ISUZU");

     }
    while(rs_yandong.next()){
    yandong = rs_yandong.getInt("YANDONG");

     }
    while(rs_perkins.next()){
    perkins = rs_perkins.getInt("PERKINS");

     }
    while(rs_cummins.next()){
    cummins = rs_cummins.getInt("CUMMINS");

     }
    while(rs_weifang.next()){
    weifang = rs_weifang.getInt("WEIFANG");

     }
    while(rs_yamada.next()){
    yamada = rs_yamada.getInt("YAMADA");

     }

    }catch(Exception e){
       e.printStackTrace();
    }    
    return false;
    }
}
