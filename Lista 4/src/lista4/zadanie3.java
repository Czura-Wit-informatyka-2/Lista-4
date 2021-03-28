package lista4;

import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class zadanie3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date1, date2;
		Date firstDate, secondDate;
		long numberOfDays=0; //iloúÊ dni
		try
		{
			System.out.print("Enter the first date in the format dd.MM.yyyy: ");
			date1=simpleDateFormat.parse(sc.nextLine());
			
			System.out.print("Enter the second date in the format dd.MM.yyyy: ");
			date2=simpleDateFormat.parse(sc.nextLine());
			
			if (date1.before(date2) )
			{
				firstDate=date1;
				secondDate=date2;
			}
			else
			{
				firstDate=date2;
				secondDate=date1;
			}
			
			numberOfDays = (secondDate.getTime() - firstDate.getTime())/(24*1000*60*60);
			System.out.println("Number of days: " + numberOfDays);
			
			System.out.println("First date: " + simpleDateFormat.format(firstDate));
			System.out.println("Second day: " + simpleDateFormat.format(secondDate));
		}
		catch (ParseException e) {
			System.out.println("èle");
		}
		
		
		
		
		sc.close();
	}

}
