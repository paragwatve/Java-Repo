package JAN_Pac;

class Base_Parent
{
    
    public void basemethod()
    {
        System.out.println("this is parent");
    }
    
}


class Derived_Child extends Base_Parent
{
    
    public void derivemethod()
    {
        super.basemethod();
        System.out.println("this is child class");
        
    }
}


 public class TC012_Inheritance
{

     public static void main(String [] args) {
         
         Derived_Child child= new Derived_Child();
         child.derivemethod();
         
         //child.basemethod();
         
         if(child instanceof Base_Parent)
         {
        	 System.out.println("This is a instance");
         } 
         else
         {
        	 System.out.println("This is not a instance");
         }
     }

}