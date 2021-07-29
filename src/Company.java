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
//{
//    "id": 1,
//    "name": "Sber",
//    "address": "Москва, ул. Вавилова, д. 19",
//    "phoneNumber": "8 800 555-55-50",
//    "INN": "7707083893",
//    "founded": "1.05.1991",
//    "securities": [
//      {
//        "name": "Alfa",
//        "currency": [
//          "RUB",
//          "USD"
//        ],
//        "code": "31875423456789098765432313133131",
//        "date": "18.09.2021"
//      },
//      {
//        "name": "Yandex",
//        "currency": [
//          "RUB",
//          "USD"
//        ],
//        "code" : "54321",
//        "date": "12.12.2020"
//      },
//      {
//        "name" : "Microsoft",
//        "currency": [
//          "EU",
//          "USD"
//        ],
//        "code" : "987654321",
//        "date": "12.01.2025"
//      },
//      {
//        "name": "Sber",
//        "currency": [
//          "RUB",
//          "USD"
//        ],
//        "code": "878656541",
//        "date": "25.12.2030"
//      },
//      {
//        "name": "Mail Group",
//        "currency": [
//          "RUB",
//          "USD"
//        ],
//        "code": "12345",
//        "date": "12.01.2014"
//      }
//    ]
//  }