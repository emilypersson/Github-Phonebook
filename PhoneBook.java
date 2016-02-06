import java.util.Scanner;
public class PhoneBook {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//three objects
		PhoneBookEntry person0 = new PhoneBookEntry("John", "Smith", "jsmith@gmail.edu", "20037", "2023334444");
		PhoneBookEntry person1 = new PhoneBookEntry("James", "202344344");
		PhoneBookEntry person2 = new PhoneBookEntry("Sarah", null);
		//first person
		System.out.println("Enter your first name");
		String f = input.nextLine();
		person0.setFname(f);
		System.out.println("Enter your last name");
		String l = input.nextLine();
		person0.setLname(l);
		System.out.println("Enter your email");
		String e = input.nextLine();
		person0.setEmail(e);
		System.out.println("Enter your zip code");
		String z = input.nextLine();
		person0.setZip(z);
		System.out.println("Enter your phone number");
		String p = input.nextLine();
		person0.setPhone(p);
		person0.printBookEntry();
		//second person
		System.out.println("Enter your first name");
		String f1 = input.nextLine();
		person1.setFname(f1);
		System.out.println("Enter your phone number");
		String p1 = input.nextLine();
		person1.setPhone(p1);
		person1.printBookEntry();
		//third person
		System.out.println("Enter your first name");
		String f2 = input.nextLine();
		person2.setFname(f2);
		person2.printBookEntry();
		
		input.close();
	}

}