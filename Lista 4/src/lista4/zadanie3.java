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
		
		System.out.print("Enter the first date in the format dd.MM.yyyy: ");
		//String date = sc.nextLine();
		
		
		
		Date date1=simpleDateFormat.parse(sc.nextLine());
		
		System.out.print(simpleDateFormat.format(date1));
		sc.close();
	}

}
