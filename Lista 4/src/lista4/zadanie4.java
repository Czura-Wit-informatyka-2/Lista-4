package lista4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class zadanie4 {

	public static void main(String[] args) throws ParseException
	{
		
		Scanner sc=new Scanner(System.in);
		
		String pattern ="dd.MM.yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String input ="08.04.2021";
		Date date = simpleDateFormat.parse(input);

		
		
		TimeZone timeZone1 = TimeZone.getTimeZone("America/Los_Angeles");
		TimeZone timeZone2 = TimeZone.getTimeZone("Europe/Warsaw");
		
		long d1=timeZone1.getRawOffset()/(1000*60*60);
		long d2=timeZone2.getRawOffset()/(1000*60*60);

		System.out.println(d1);
		
		 
		System.out.println(d2);
		
		
		
		if(timeZone1.inDaylightTime(date))
		{
			d1+=timeZone1.getDSTSavings()/(1000*60*60);
		}
		
		if(timeZone2.inDaylightTime(date))
		{
			d2+=timeZone2.getDSTSavings()/(1000*60*60);
		}
		
		System.out.println("Los Angeles UTC : " + d1);
		System.out.println("Warsaw UTC : " + d2);
		System.out.println("R�znica : " + (Math.abs(d1)+Math.abs(d2)));
		
		sc.close();
	}
}