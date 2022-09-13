package EncapsulationEx;
public class TestEncapShape1 {
	public static void main(String[] args) {
		EncapShape1 en = new EncapShape1();
		en.setColour("red");
		en.setCircle("small");
		
		System.out.println(en.getColour());
		System.out.println(en.getCircle());
	}

}
