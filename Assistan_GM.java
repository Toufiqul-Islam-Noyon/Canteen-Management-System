
package canteenmanagement;

import java.io.File;
import java.util.*;


public class Assistan_GM extends Manager{
    //private double totalPrice;
   
    
    
    Assistan_GM(String i,String n,String t)
    {
        
        super(i,n,t);
       
    }

    @Override
    void Manager_Info()
    {
        System.out.println("Assistant_GM Id::"+this.getId());
        System.out.println();
        System.out.println("Assistant_GM Name::"+this.getName());
        System.out.println();
        System.out.println("Designation::"+this.getType());
    }
    
    
}
