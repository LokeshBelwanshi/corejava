package MethodCall.in.com;

public class Method1 {
	public int add (int a,int b)
	{
	return a+b;
	
}
public static void main(String[] args) {
	
	Method1 sum= new Method1();
	int hold= sum.add(5,6);
	System.out.println(hold);
}

}


