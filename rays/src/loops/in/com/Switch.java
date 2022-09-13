
package loops.in.com;

public class Switch {
	public static void main(String[] args) {
		int a = 3;
		int b = 20;
		/* int c = a * b; */
		char result = '%';
		switch (result) {
		case '+':
			System.out.println(a + b);
			break;

		case '-':
			System.out.println(a - b);
			break;

		case '*':
			System.out.println(a * b);
			break;

		case '/':
			System.out.println(a / b);
			break;

		case '%':
			System.out.println(b % a);
			break;

		case '>':
			System.out.println(a > b);
			break;

		default:
			System.out.println("a<b");
			break;

		}

	}
}