import java.util.ArrayList;
import java.util.List;

public class Security {
	
	 private String name;
	 private List<String> currency = new ArrayList<String>();
	 private String code;
	 private String date;

	 public String getName() {
		 return name;
	 }
	 
	 public List<String> getCurrency() {
		 return currency;
	 }

	 public String getCode() { 
		 return code; 
	 }
	 
	 public String getDate() { 
		 return date; 
	 }
	 
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public void setCurrency(List<String> currency) {
		 this.currency = currency;
	 }
	 
	 public void setCode(String code) { 
		 this.code = code; 
	 }
	 
	 public void setDate(String date) { 
		 this.date = date; 
	 }
}
