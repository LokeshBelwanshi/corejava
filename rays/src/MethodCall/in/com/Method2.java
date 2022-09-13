package MethodCall.in.com;

public class Method2 {
	public static int sub (int a,int b)
	{
		return a-b;
	}
	public static void main(String[]args) {
		int hold = Method2.sub(3,5);
		System.out.println(hold);
	}
}