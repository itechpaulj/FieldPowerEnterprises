/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

/**
 *
 * @author Javinez
 */
public class Class_Refresh {
    public boolean Refresh(){
        Class_tables ct = new Class_tables();
        ct.Cart();
        ct.Cart_Generator();
        ct.Cart_Parts();
        ct.Customer();
        ct.Generator();
        ct.Office();
        ct.Parts();
        ct.Sales_Generator();
        ct.Sales_OW();
        ct.Sales_Office();
        ct.Sales_Parts();
        ct.Sales_Stocks();
        ct.Sales_WareHouse();
        ct.Stocks();
        ct.Supplier();
        ct.WareHouse();
        ct.addcartOW();
        ct.addcartWareHouse();
        return true;
    }
}
