package StringEx.in.com;

import java.util.Scanner;

public class stringcount {
	public static void main(String[] args) {

		int count = 0;
		String name = "vijay chouhan";

		for (int i = 0; i < name.length(); i++) {

			char xy = name.charAt(i);
			
			if(xy == 'a') {
				count++;
			}
			System.out.println("4th character is " +name.charAt(3));
			
		}System.out.println(count);


	}

}
