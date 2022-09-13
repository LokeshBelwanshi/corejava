package Inherit.in.com;

public class TestShape {
	public static void main(String[] args) {
		Shape c=new Shape();
		c.setColour("green");
		c.setBorderwidth(98);
		
		System.out.println(c.getColour());
		System.out.println(c.getBorderwidth());
	}
		
	

}
