
package canteenmanagement;

//import java.io.File;
//import java.io.FileWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Admin {
    Scanner scan= new Scanner(System.in);
    int n;
    FileWriter fw;
    String[] product;
    private String id;
    private String name;
    private String address;
    private  final String pin1="A11";
    private String pin2;
    
    Admin(String i,String n,String a)
    {
        id=i;
        name=n;
        address=a;
    }
  
    void Admin_Option(Indoor_Stuff x,Outdoor_Stuff y,Assistan_GM A,Manager M)
    {
        System.out.println("1.LogIn");
        System.out.println("2.Cancel");
        
        n=scan.nextInt();
        switch(n)
        {
            case 1:
                System.out.println("Enter your pin::");
                pin2=scan.next();
                
                if(pin2.equals(pin1))
                {
                    System.out.println("Log in success");
                }
                else
                {
                    System.out.println("your pin is incorrect");
                    break;
                }
                
                System.out.println("1.See Food");
                System.out.println("2.Sell Info");
                System.out.println("3.Stuff Info");
                System.out.println("4.Cancel");
                System.out.println("Enter your choise");
                int n2=scan.nextInt();
                
                switch(n2)
                {
                    case 1:
                        
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
                         
                    case 2:
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
                         
                    case 3:
                        
                        M.Manager_Info();
                        System.out.println();
                        A.Manager_Info();
                        System.out.println();
                        
                        
                        
                         x.info();
                         System.out.println();
                         y.info();
                         
                         break;
                         
                    case 4:
                        System.out.println("Thanks");
                        break;
                        
                    default:
                        System.out.println("Please enter the right number");
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
    
    
    
   
    

    
    
}
