package Overload.in.com;

public class Class1 {
	
	static void show(String name)
	{
		System.out.println(name);
	}
    static void show(int b)
    {
    	System.out.println(b);
    }
    
    public static void main(String[] args) {
		show("sonu");
		show(100);
	}
}

