package AddressBook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	List<AddressEntry> book = new ArrayList<>();
	boolean entryExists = false;
	boolean notFound = false;
	//Choice #1 Add Entry:
	public void addEntry(AddressEntry newEntry) {
		
//		if (book.size()==0) {
			book.add(newEntry);
			entryExists=true;
			System.out.println("\nNew entry confirmed.\n");

			//TRYING TO MAKE EMAIL ADDRESS UNIQUE...
			
//			for (int i = 0; i<book.size(); i++) {
//			AddressEntry lookUp = book.get(i);
//				if(lookUp.getEmailAddress().equals(newEntry.getEmailAddress())) {
//					book.remove(i);
//					System.out.println("\nAn entry exists with this email address. Duplicate emails are not allowed.\n"
//							+ "Please re-enter with a unique email.");
//				}
//			}
//		}
		
	}
	
	//Choice #2 Remove Entry:
	public void removeEntry(String email) {
		
		if (book.size()==0) {
			System.out.println("\nYou must add an entry before modifying the address book.\n");
		} else {
			for (int i = 0; i<book.size(); i++) {
				AddressEntry lookUp = book.get(i);
				if(lookUp.getEmailAddress().equals(email)) {
					book.remove(i);
					System.out.println("\nEntry deleted.\n");
				} else {
					System.out.println("\nEntry not found. Please verify email address.\n");
				}
			}
			if (book.size()==0) {
				entryExists = false;
			}
		}
	}
	
	//Choice #3 Search For (requires if chain or 4 entries in Main):
	public AddressEntry searchByFirstName(String firstName) {
		if (!entryExists) {
			System.out.println("\nYou must add an entry before modifying the address book.\n");
		} else {
			for (int i = 0; i<book.size(); i++) {
				AddressEntry searchFirst = book.get(i);
				if (searchFirst.getFirstName().equals(firstName)) {
					System.out.println(searchFirst);
				} else {
					notFound = true;
					System.out.println("\nEntry not found. Please verify first name.\n");

				}
			}

		}

		return null;
	}
	
	public AddressEntry searchByLastName(String lastName) {
		if (!entryExists) {
			System.out.println("\nYou must add an entry before modifying the address book.\n");
		} else {	
			for (int i = 0; i<book.size(); i++) {
				AddressEntry searchLast = book.get(i);
				if (searchLast.getLastName().equals(lastName)) {
					System.out.println(searchLast);
				} else {
					notFound = true;
				}
			}
			
			if (notFound) System.out.println("Entry not found. Please verify last name.");

		}
		return null;
	}
	
	public AddressEntry searchByPhoneNumber(String phoneNumber) {
		if (!entryExists) {
			System.out.println("\nYou must add an entry before modifying the address book.\n");
		} else {
			for (int i = 0; i<book.size(); i++) {
				AddressEntry searchPhone = book.get(i);
				if (searchPhone.getPhoneNumber().equals(phoneNumber)) {
					System.out.println(searchPhone);
				} else {
					notFound = true;
				}
			}
			
			if (notFound) System.out.println("\nEntry not found. Please verify phone number.");
		}
		return null;
	}
	
	public AddressEntry searchByEmail(String emailAddress) {
		if (!entryExists) {
			System.out.println("\nYou must add an entry before modifying the address book.\n");
		} else {
			for (int i = 0; i<book.size(); i++) {
				AddressEntry searchEmail = book.get(i);
				if (searchEmail.getEmailAddress().equals(emailAddress)) {
					System.out.println(searchEmail);
				} else {
					notFound=true;
				}
			}

			if (notFound) System.out.println("\nEntry not found. Please verify email address.");
		}
		return null;
	}
	
	public void printBook() {
		for (AddressEntry i: book) {
			System.out.println(i);
		}
	}
	
	public void removeBook() {
		while(book.size() !=0) {
			book.remove(0);
		}
		entryExists = false;
		System.out.println("\nAddress book deleted.\n");
	}
}
