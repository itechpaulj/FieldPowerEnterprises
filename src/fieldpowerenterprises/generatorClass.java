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
public class generatorClass {
    private int generator_id;
    private String phasing;
    private String kva;
    private String vac;
    private String supplier_price;
    private String seller_price;
    private String quantity;
    private String product_brandname;
    private String engine_model;
    private String engine_sn;
    private String alternator_sn;
    private String unit_type;
    private String starting_system;
    private String body_type;
    private String dimension;
    private String fuel_tank_cap;
    private String weight;
    private String frame;
    private String date;
    
    
    public generatorClass(int generator_id, String phasing, String kva, String vac, String supplier_price, String seller_price, String quantity, String product_brandname, String engine_model, String engine_sn, String alternator_sn, String unit_type, String starting_system, String body_type, String dimension, String fuel_tank_cap, String weight, String frame, String date){
    this.generator_id = generator_id;
    this.phasing = phasing;
    this.kva = kva;
    this.vac = vac;
    this.supplier_price = supplier_price;
    this.seller_price = seller_price;
    this.quantity = quantity;
    this.product_brandname = product_brandname;
    this.engine_model = engine_model;
    this.engine_sn = engine_sn;
    this.alternator_sn = alternator_sn;
    this.unit_type = unit_type;
    this.starting_system = starting_system;
    this.body_type = body_type;
    this.dimension = dimension;
    this.fuel_tank_cap = fuel_tank_cap;
    this.weight = weight;
    this.frame = frame;
    this.date = date;
    }
    
    public int getGenerator_id(){
        return generator_id;
    }
    
    
    public String getPhasing(){
        return phasing;
    }
    
    public String getKva(){
        return kva;
    }
    
    public String getVac(){
        return vac;
    }
    
    public String getSupplier_price(){
        return supplier_price;
    }
    
    public String getSeller_price(){
        return seller_price;
    }
    
    public String getQuantity(){
        return quantity;
    }
    
    public String getProduct_brandname(){
        return product_brandname;
    }
    
    public String getEngine_model(){
        return engine_model;
    }
    
    public String getEngine_sn(){
        return engine_sn;
    }
    
    public String getAlternator_sn(){
        return alternator_sn;
    }
    
    public String getUnit_type(){
        return unit_type;
    }
    
    public String getStarting_system(){
        return starting_system;
    }
    
    public String getBody_type(){
        return body_type;
    }
    
    public String getDimension(){
        return dimension;
    }
    
    public String getFuel_tank_cap(){
        return fuel_tank_cap;
    }
    
    public String getWeight(){
        return weight;
    }
    
    public String getFrame(){
        return frame;
    }
    
    public String getDate(){
        return date;   
    }
}
