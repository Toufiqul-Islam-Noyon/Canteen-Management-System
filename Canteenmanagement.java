
package canteenmanagement;
import java.util.*;

import java.io.IOException;


public class Canteenmanagement {

   
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
      
        Admin obj1=new Admin("A11","Noyon","Samoly");
        CO_Admin obj2=new CO_Admin("CA11","Toyon","Adabor");
        Manager obj3=new Manager("M1","Tareq","Senior GM");
        Assistan_GM obj4=new Assistan_GM("AGM1","Aminul","Assistant GM");
        Deputed_GM obj5=new Deputed_GM("DGM1","Rocky","Deputed GM");
        Regular_Customer obj6=new Regular_Customer();
        Indoor_Stuff obj10=new Indoor_Stuff("IN11","Rahim","Indoor");
        Outdoor_Stuff obj11=new Outdoor_Stuff("Ot11","Karim","Outdoor");
        
       
        
        

        
       System.out.println("WELCOME TO THE CANTEEN");
        System.out.println("1.Admin");
        System.out.println("2.Manager");         
        System.out.println("3.Deputed_GM");
        System.out.println("4.CO_Admin");
        System.out.println();
        System.out.println("Enter your choise");
        int n=scan.nextInt();
        
        switch(n)
        {
            case 1:
                obj1.Admin_Option(obj10, obj11,obj4,obj3);
                break;
                
            case 2:
                obj4.Manager_Option(obj10, obj11);
                
                break;
   
            case 3:
                
                obj5.readProduct();
                obj5.order(obj6);
                obj5.WriteInfo(obj6);
                
                
                break;
                
            case 4:
                System.out.println();
                obj2.Deputed_GM(obj5);
                break;
                
            
                
                
                
        }
     
       
      
       
        
    }
    
}
