import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonParser {

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException, ParseException {
		
		Gson gson = new Gson();
	
		Companies companies = gson.fromJson(new FileReader("companies.json"), Companies.class);

		
		System.out.println("Company names and founding dates: ");
		
		
		for (Company com : companies.getCompanies()) {
			SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
			Date date = formatter.parse(com.getFounded());
			formatter = new SimpleDateFormat("dd/MM/yy", Locale.ENGLISH);
			System.out.println("Name of company: " + com.getName() + "; " + "Founded: " + formatter.format(date));	
			}
		
		System.out.println();
		
		System.out.println("Overdue securities: ");
		int count = 0;
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		for (Company com : companies.getCompanies()) {	
			for (Security sec : com.getSecurities()) {
				String secTime = sec.getDate();
				Date date = formatter.parse(secTime);
				if (date.getTime()<currentTime.getTime()) {
					System.out.println("Security name: " + sec.getName() + "; Code: " + sec.getCode() + "; Overdue date: " + sec.getDate());
					count++;
				}
			}
		}
		System.out.println("Number of overdue securities: " + count);
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Chose type of data (Print number): 1. dd/MM/yy; 2. dd/MM/yyyy; 3. dd.MM.yy; 4. dd.MM.yyyy");
	    int number = sc.nextInt();
	    String userRequestDateType = "dd/MM/yy"; 
	    switch (number) {
        case  (1):
        	userRequestDateType = "dd/MM/yy";
            break;
        case (2):
        	userRequestDateType = "dd/MM/yyyy";
            break;
        case (3):
        	userRequestDateType = "dd.MM.yy";
            break;
        case (4):
        	userRequestDateType = "dd.MM.yyyy";
            break;
	    }
	    Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter the date according " + userRequestDateType);
	    String dat = sc1.nextLine();
	    String userRequestDate = dat; 
		System.out.println("Companies created after " + userRequestDate + ":");
		for (Company com : companies.getCompanies()) {	
			
			SimpleDateFormat form = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
			Date date = form.parse(com.getFounded());
			form = new SimpleDateFormat(userRequestDateType, Locale.ENGLISH);	
			if (date.getTime() > form.parse(userRequestDate).getTime()) {
				System.out.println("Name of company: " + com.getName() + "; " + "Founded: " + form.format(date));	
					
			}
		}
		
		System.out.println();
		
		Scanner sc2 = new Scanner(System.in);
	    System.out.println("Enter the currency from the list: EU, RUB, USD ");
	    String userRequestCurrency = sc2.nextLine();
		System.out.println("User request currency - " + userRequestCurrency);
		for (Company comp : companies.getCompanies()) {		
			for (Security s : comp.getSecurities()) {
				if (s.getCurrency().contains(userRequestCurrency)) {
					System.out.println("Id company: " + comp.getId() + "; Security code: " + s.getCode());
				}	
			}
		}

	}
}
