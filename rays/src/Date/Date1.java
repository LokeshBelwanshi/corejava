package Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Date1 {
	public static void main(String[] args) throws ParseException{
		Date d= new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
        String str=sdf.format(d);
        System.out.println(str);


        String a= "08/08/2000";
        System.out.println(a);
        Date d1=sdf.parse(a);
        System.out.println(d1);



}
}
