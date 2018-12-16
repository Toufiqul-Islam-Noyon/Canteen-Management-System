
package canteenmanagement;


public class Outdoor_Stuff extends Stuff{
    private String type;
    
    Outdoor_Stuff(String i,String n,String t)
    {
        super(i,n);
        type=t;
    }
    
    @Override
    void info()
    {
        System.out.println("Id is::"+this.getId());
        System.out.println("Name is::"+this.name());
        System.out.println("Stuff type::"+type);
    }
}
