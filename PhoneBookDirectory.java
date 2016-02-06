import java.util.Scanner;
public class PhoneBookDirectory {

	private PhoneBookEntry[] PhoneBook = new PhoneBookEntry[5];

	public PhoneBookEntry[] getPhoneBook() {
		return PhoneBook;
	}

	public void setPhoneBook(PhoneBookEntry[] phoneBook) {
		PhoneBook = phoneBook;
	}
	
	public void createPhoneBookEntry() {
		//getting user info
		Scanner input = new Scanner(System.in);
		int count = 0;
		do {
		System.out.println("Enter your first name");
		String fname = input.nextLine();
		
		System.out.println("Enter your last name");
		String lname = input.nextLine();
		
		System.out.println("Enter your email");
		String email = input.nextLine();
		
		System.out.println("Enter your phone number");
		String phone = input.nextLine();
		
		System.out.println("Enter your zip");
		String zip = input.nextLine();
		
		String space = input.nextLine();
		PhoneBook[count] = new PhoneBookEntry(fname, lname, email, phone, zip);
		count++;
		System.out.println("Would you like to add another entry? Y or N");
		String decision = input.nextLine();
		if (decision == "N") {
			break;
		}
	//10 people in the directory
	} while(count <= 10);
		input.close();
}
	//printing the phone book
	public void print() {
		System.out.println("My contacts:");
		for (int i = 0; i < PhoneBook.length; i++) {
			PhoneBook[i].printBookEntry();
		}
	}
	//searching by last name
	public PhoneBookEntry Search(String lname, int count) {
		PhoneBookEntry temp = new PhoneBookEntry();
		
		for (int i = 0; i < count; i++) {
			if (lname.equals(PhoneBook[i].getLname())) {
				temp.setFname(PhoneBook[i].getFname());
				temp.setLname(PhoneBook[i].getLname());
				temp.setEmail(PhoneBook[i].getEmail());
				temp.setZip(PhoneBook[i].getZip());
				temp.setPhone(PhoneBook[i].getPhone());
				break;
			}
		}
		return temp;
	}
	//searching by phone number
	public PhoneBookEntry SearchPhone(String phone, int count) {
		PhoneBookEntry temp = new PhoneBookEntry();
		
		for (int i = 0; i < count; i++) {
			if (phone.equals(PhoneBook[i].getPhone())) {
				temp.setFname(PhoneBook[i].getFname());
				temp.setLname(PhoneBook[i].getLname());
				temp.setEmail(PhoneBook[i].getEmail());
				temp.setZip(PhoneBook[i].getZip());
				temp.setPhone(PhoneBook[i].getPhone());
				break;
			}
		}
		return temp;
	}
	//deleting an object
	public void delete() {
		Scanner input = new Scanner(System.in);
		String userF; 
		boolean found = false; 
		System.out.println("Enter the first name of the entry which you would like to delete: ");
		userF = input.next(); 
		
		for (int i = 0; i < PhoneBook.length; i++) {
			if (userF.equals(PhoneBook[i].getFname())) {
				PhoneBook[i].setFname(null);
				PhoneBook[i].setLname(null);
				PhoneBook[i].setEmail(null);
				PhoneBook[i].setZip(null);
				PhoneBook[i].setPhone(null);
				System.out.println("Contact deleted.");
				found = true; 
			}
		} 
		if (found == false) {
			//if no match found
			System.out.println("Contact with first name of, " + userF + ", not found");
		}
	}
	//editing an object
	public void edit() {
		Scanner input = new Scanner(System.in);
		String userF; 
		String attribute;  
		String change;
		System.out.println("Whose information do you want to edit? Enter his/her first name: ");
		userF = input.next(); 
		for (int i = 0; i < PhoneBook.length; i++) {
			if (userF.equals(PhoneBook[i].getFname())) {
				System.out.println("What information of " + userF + " would you like to change?");
				System.out.println("f. First Name");
				System.out.println("l. Last Name");
				System.out.println("e. Email");
				System.out.println("z. Zip Code");
				System.out.println("p. Phone Number");
				attribute = input.next(); 
				
				switch (attribute) {
				case ("f"):
					System.out.println("What is " + userF + "'s new first name?");
					change = input.next(); 
					PhoneBook[i].setFname(change);
					break; 
				case ("l"):
					System.out.println("What is " + userF + "'s new last name?");
					change = input.next(); 
					PhoneBook[i].setLname(change);
					break; 
				case ("e"):
					System.out.println("What is " + userF + "'s new email?");
					change = input.next(); 
					PhoneBook[i].setEmail(change);
					break; 
				case ("z"):
					System.out.println("What is " + userF + "'s new zip code?");
					change = input.next(); 
					PhoneBook[i].setZip(change);
					break; 
				case ("p"):						
					System.out.println("What is " + userF + "'s new phone number?");
					change = input.next();  
					PhoneBook[i].setPhone(change);
					break; 
				default: 
					System.out.println("Incorrect value");
					break;
				}
					
			}
		}
	}
	public void quit() {
		System.out.println("Goodbye");
	}

}
