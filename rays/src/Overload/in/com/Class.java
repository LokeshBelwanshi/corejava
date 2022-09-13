package Overload.in.com;

public class Class {
	
   public void display (int a,int b)
      {
	     System.out.println(a+b);
      }
   public void display() 
      {
	     System.out.println("lokesh");
      }

public static void main(String [] args)
{
  Class c = new Class()	;
  c.display(7,8);
  c.display();
  


}
}

