package StringEx.in.com;

public class string {
	public static void main(String[] args) {
		String s1= "Ram";
		String s2="Ram";
		String s3=new String ("Ram");
		String s4=new String ("Ram");
		
		boolean result1 = s2==s1;
		System.out.println(result1 );
		boolean result2=(s3.equals(s4));
		System.out.println(result2);
		System.out.println(s1.charAt(0));
		StringBuffer s=new StringBuffer("ram");
		s.append("chandra");
		System.out.println(s);
	
	
	}

}
