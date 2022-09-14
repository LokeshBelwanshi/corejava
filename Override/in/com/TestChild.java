package Override.in.com;

public class TestChild {
	public static void main(String[] args) {
		parent p= new parent();
		p.show();
		parent p1= new Child();
		p1.show();
	}

}
