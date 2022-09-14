package Override.in.com;

public class Child extends parent {
	@Override
	void show() {
		System.out.println("Child");
		super.show();
	}
}
