/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FPE;

import java.util.Scanner;

/**
 *
 * @author Robles
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner fpe = new Scanner(System.in);
        
        int progress = 0;
        int verify = 0;
        int status = 0;
        int total = 0;
       do{
                 
            do
            {
            System.out.print("Enter Progress : ");
            progress = fpe.nextInt();
            
            System.out.println("\n");
            
            System.out.print("Verify : (1 or 0)");
            verify = fpe.nextInt();
            
            total = total + 1;
            System.out.print(""+total);
            }while(verify == 0);
            
            System.out.print("STATUS : (1 or 0)");
            status = fpe.nextInt();
            
       }while(status == 0);
        
        
        
        
                
    }
    
}
