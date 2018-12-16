
package canteenmanagement;


public abstract class Stuff {
    private String id;
    private String name;
    
    Stuff(String i,String n)
    {
        id=i;
        name=n;
    }
    
   abstract void info();
   
   String getId()
   {
       return id;
   }
   String name()
   {
       return name;
   }
            
    
}
