import java.util.ArrayList;
import java.util.List;

public class Company {
	
	 private int id;
	 private String name;
	 private String address;
	 private String phoneNumber;
	 private String INN;
	 private String founded;
	
	 private List<Security> securities = new ArrayList<Security>();
	
	 public int getId() {
		 	return id;
		 }

		 public String getName() {
			 return name;
		 }

		 public String getAddress() {
			 return address;
		 }

		 public String getPhoneNumber() {
			 return phoneNumber;
		 }

		 public String getINN() {
			 return INN;
		 }

		 public String getFounded() {
			 return founded;
		 }
		 public List<Security> getSecurities() { 
			 return securities; }

		 
		 
		 public void setId(int id) {
			 this.id = id;
		 }

		 public void setName(String name) {
			 this.name = name;
		 }

		 public void setAddress(String address) {
			 this.address = address;
		 }

		 public void setPhoneNumber(String phoneNumber) {
			 this.phoneNumber = phoneNumber;
		 }

		 public void setINN(String INN) {
			 this.INN = INN;
		 }

		 public void setFounded(String founded) {
			 this.founded = founded;
		 }
		 public void setSecurities(List<Security> securities) { 
			 this.securities = securities; }
}
