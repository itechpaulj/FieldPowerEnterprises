/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fieldpowerenterprises;

/**
 *
 * @author Javinez
 */
public class supplierClass {
    private int id;
    private String name;
    private String address;
    private String contact;
    private String email;
    private String date;
    
    
    public supplierClass(int supplier_id, String supplier_name, String supplier_address, String supplier_contact, String supplier_email, String supplier_date){
        
        this.id = supplier_id;
        this.name = supplier_name;
        this.address = supplier_address;
        this.contact = supplier_contact;
        this.email = supplier_email;
        this.date = supplier_date;

    }
    
    
    public int getsupplierId(){
        return id;
    }
    
    public String getsupplierName(){
        return name;
    }
    public String getsupplierAddress(){
        return address;
    }
    
    public String getsupplierContact(){
        return contact;
    }
    public String getsupplierEmail(){
        return email;
    }
    public String getsupplierDate(){
        return date;
    }
        
}
