package AddressBook;
import java.util.Scanner;

public class AddressMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		AddressBook newBook = new AddressBook();
		String option;
		boolean done = false;
		
		do {
			System.out.println("\n------------------------\nPlease select an action: \n------------------------\n1. Add an entry \n2. Remove an entry "
					+ "\n3. Search for an entry \n4. Print address book \n5. Delete address book \n6. Quit program \n");
			option = input.nextLine();
			
			if (option.equals("1")) {
				AddressEntry entry = AddressEntry.addressFromInput(input);
				newBook.addEntry(entry);
			} else if (option.equals("2")) {
				System.out.println("\nWhat is the email address of the entry to remove?\n");
				String remove = input.nextLine();
				newBook.removeEntry(remove);
			} else if (option.equals("3")) {
				System.out.println("\n!Note: all entries are case sensitive!\nPlease choose what to search by: \n1. First name: \n2. Last name: "
						+ "\n3. Phone number: \n4. Email address: \n");
				String choice = input.nextLine();
				
				if (choice.equals("1")) {
					System.out.println("Please enter a first name: ");
					String firstName = input.nextLine();
					newBook.searchByFirstName(firstName);
				} else if (choice.equals("2")) {
					System.out.println("Please enter a last name: ");
					String lastName = input.nextLine();
					newBook.searchByLastName(lastName);
				} else if (choice.equals("3")) {
					System.out.println("Please enter a phone number: ");
					String phoneNumber = input.nextLine();
					newBook.searchByPhoneNumber(phoneNumber);
				} else if (choice.equals("4")) {
					System.out.println("Please enter an email address: ");
					String emailAddress = input.nextLine();
					newBook.searchByEmail(emailAddress);
				} else {
					System.out.println("\nInvalid selection. Please enter a valid option (1-4).\n\n");
				}
			}else if (option.equals("4")){
				newBook.printBook();
			} else if (option.equals("5")) {
		
				newBook.removeBook();

				
			}
			else if (option.equals("6")) {
				done=true;
				System.out.println("\nExiting program. Please restart to continue.\n");
			} else {
				System.out.println("\nInvalid selection. Please choose an option (1-6).\n");
			}
		} while (!done);
	}
	
	
	
}
