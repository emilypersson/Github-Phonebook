import java.util.Scanner;
public class PhoneBookApplication {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//menu for the user
		System.out.println("1. Add an entry");
		System.out.println("2. Print the phone book");
		System.out.println("3. Search by last name");
		System.out.println("4. Search by phone number");
		System.out.println("5. Edit an entry");
		System.out.println("6. Delete an entry");
		System.out.println("7. Quit");
		
		int userInput = input.nextInt();

		PhoneBookDirectory myPhoneBook = new PhoneBookDirectory();
		//calling all the methods in main based on user input
		if (userInput == 1) {
		myPhoneBook.createPhoneBookEntry();	
		}
		
		else if (userInput == 2) {
		myPhoneBook.print();
		}
		
		else if (userInput == 3) {
		System.out.println("Enter last name to search for:");
		String name = input.nextLine();
		
		PhoneBookEntry a = new PhoneBookEntry();
		a = myPhoneBook.Search(name, 10);
		a.printBookEntry();
		}
		
		else if (userInput == 4) {
		System.out.println("Enter phone number to search for");
		String number = input.nextLine();
		
		PhoneBookEntry b = new PhoneBookEntry();
		b = myPhoneBook.SearchPhone(number, 10);
		b.printBookEntry();
		}
		
		else if (userInput == 5) {
		myPhoneBook.edit();
		}
		
		else if (userInput == 6) {
		myPhoneBook.delete();
		}
		
		else if (userInput == 7) {
		myPhoneBook.quit();
		}
		
		input.close();
		
	}

}