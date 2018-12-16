
package canteenmanagement;

import java.io.*;
import java.util.*;
public class Deputed_GM extends Manager {
    Scanner scan;
    FileWriter fw;
    int price=0;
    int i,n;
    
    
    Deputed_GM(String i,String n,String t)
    {
        super(i,n,t);
    }
    
    void Manager_Info(long ph_number)
    {
        System.out.println("Phone is::"+ph_number);
    }
    
    @Override
    void Manager_Info()
    {
        System.out.println("Deputed_GM Id::"+this.getId());
        System.out.println("Deputed_Gm Name::"+this.getName());
        System.out.println("Type is::"+this.getType());
    }
    
    void readProduct()
    {
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
    }
    
    //@Override
     public void order(Regular_Customer r)
    {
        scan=new Scanner(System.in);
        System.out.println("1.Order");
        System.out.println("2.Cancel");
        System.out.println("Enter choise::");
        int n2=scan.nextInt();
        switch(n2)
        {
            case 1:
         
        System.out.println("Your name");
         r.name=scan.next();
         
         System.out.println("Your address");
         r.address=scan.next();
       
            System.out.println("Enter your order::");
            int n=scan.nextInt();
            System.out.println("how much you want food ");
            int c = scan.nextInt();
            if(n==1){
                price=c*500;
                System.out.println(price);
            }
            else if(n==2)
            {
                price=c*200;
                System.out.println(price);
            }
            else if(n==3)
            {
                price=c*30;
                System.out.println(price);
            }
            else if(n==4)
            {
                price=c*80;
                System.out.println(price);
            }
            else if(n==5)
            {
                price=c*50;
                System.out.println(price);
            }
            else
            {
                System.out.println("No food");
            }
            
            break;
            
            case 2:
                System.out.println("Thanks");
                break;
    }
            
    }
     
     
     
     void WriteInfo(Regular_Customer r)
     {
         
         try{
             fw=new FileWriter(new File("G:\\sellInfo.txt"),true);
             
             fw.write("Name::"+r.name+"\r\n");
             
             fw.write("Address::"+r.address+"\r\n");
             fw.write("price::"+price+"\r\n");
             fw.write("\r\n");
             fw.close();
             
         }
         catch(Exception e)
         {
             System.out.println("Something is wrong");
         }
         
     }
    
}
