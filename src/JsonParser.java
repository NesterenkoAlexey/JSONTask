import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
		int count;
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
		for (Company com : companies.getCompanies()) {	
			for (Security sec : com.getSecurities()) {
				String secTime = sec.getDate();
				Date date = formatter.parse(secTime);
				if (date.getTime()<currentTime.getTime()) {
					System.out.println("Security name: " + sec.getName() + "; Code: " + sec.getCode() + "; Overdue date: " + sec.getDate());
				}
			}
		}
		
		System.out.println();
		
		
		String userRequestDate = "20/08/96" ;
		String userRequestDateType = "dd/MM/yy"; // "dd/MM/yy" "dd.MM.yyyy" "dd.MM.yy"
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
		
		String userRequestCurrency = "RUB";
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
