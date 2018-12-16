
package canteenmanagement;

import java.util.*;
import java.io.*;
public class Manager {
    Scanner scan=new Scanner(System.in);
    FileWriter fw;
    String [] product;
    private String id;
    private String name;
    private String type;
    private String pin1;
    private final String pin2="p22";
    

    Manager(String i,String n,String t)
    {
        
        id=i;
        name=n;
        type=t;
    }
    
   
    
    void Manager_Option(Indoor_Stuff x,Outdoor_Stuff y)
    {
        int n;
    
        System.out.println("1.Log In");
        System.out.println("2.Cancel");
        
        System.out.println("Enter your choise");
        n=scan.nextInt();
        
        switch(n)
        {
            case 1:
               
        System.out.println("First enter the pin::");
        pin1=scan.next();
        if(pin1.equals(pin2))
        {
            System.out.println("You can Access Feature");
            
        }
        else {
            System.out.println("Your pin is wrong");
            break;
             }
        
                System.out.println("1.Add Product");
                System.out.println("2.Show Product");
                System.out.println("3.Stuff details");
                System.out.println("4.Sell Info");
                System.out.println("5.Cancel");
                System.out.println("Enter your choise");
           int n2=scan.nextInt();
           System.out.println("\n");
           switch(n2)
           {
               case 1:
                     try
                       {
                     fw=new FileWriter(new File("G:\\product2.txt"),true);
                     System.out.println("How many product you want to add please enter::");
                     int n3=scan.nextInt();
                     product=new String[n3];
                     
                     System.out.println("Now enter your product");
                    for(int i=0;i<n3;i++)
                    {
                    product[i]=scan.next();
                    
                    fw.write(" ");
                    fw.write(product[i]+"\r\n");
                    }
            
                    fw.close();
            
            
                      }
                    catch(Exception e)
                    {
                    System.out.println("something is wrong");   
                    }
                     break;
                     
               case 2:
                    try
                     {
                     scan=new Scanner(new File("G:\\product2.txt"));
                     while(scan.hasNextLine())
                     {
                      String a=scan.nextLine();
                      System.out.println(a);
               
                     }

                     }
                     catch(Exception e)
                     {
                     System.out.println("something is wrong");
                     }
                    
                    break;
                    
              
                   
               case 3:
                   x.info();
                   y.info();
                   
                   break;
                   
               case 4:
                   try
                   {
                      scan=new Scanner(new File("G:\\sellInfo.txt")) ;
                       System.out.println("Info::");
                      while(scan.hasNextLine())
                      {
                          System.out.println(scan.nextLine());
                      }
                      fw.close();
                   }
                   catch(Exception e)
                   {
                       System.out.println("something is wrong");
                   }
                   
                   break;
                    
               case 5:
                   System.out.println("No.Thanks");
                   break;
               default:
                   System.out.println("please enter the right number");
                   break;
        
           }
            
        break;
        
            case 2:
                System.out.println("Thanks");
                break;
                
            default:
                System.out.println("please enter the right number");
                break;
        
            
                
    
        }
        
    }
    
 void Manager_Info()
   {
       System.out.println("Manager ID::"+this.id);
       System.out.println();
       System.out.println("Manager Name::"+this.name);
       System.out.println();
       System.out.println("Designation::"+this.type);
       
   }
 
 String getId()
 {
     return id;
 }
 
 String getName()
 {
     return name;
 }
 
 String getType()
 {
     return type;
 }
 
    
    
    
    
    
}
