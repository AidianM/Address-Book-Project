package AddressBook;
import java.util.Scanner;

public class AddressEntry {

//	private int entryID;
	//---probably need to scrap this, and all below---
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String emailAddress;
	
//	public int getEntryID() {
//		return entryID;
//	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	//constructor:
	public AddressEntry(String firstName, String lastName, 
			String phoneNumber, String emailAddress) {
		super();
//		this.entryID = entryID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	//unsure of this method implementation:
//	@Override
//	public String toString() {
//		return "AddressMain [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
//				+ ", getPhoneNumber()=" + getPhoneNumber() + ", getEmailAddress()=" + getEmailAddress()
//				+ ", getEntryID()=" + getEntryID() + "]";
//	}

	public static AddressEntry addressFromInput(Scanner input) {
		System.out.println("\nEnter first name: ");
		String firstName = input.nextLine();
		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = input.nextLine();
		System.out.println("Enter email address: ");
		String emailAddress = input.nextLine();

		//issue constructing??
		AddressEntry returnValue = new AddressEntry(firstName, lastName, 
				phoneNumber, emailAddress);
		return returnValue;
		}
	
	@Override
	public String toString() {
		return "\n+++++++++++++++++++++++++\n\nFirst Name: " + firstName +"\nLast Name: "+lastName
				+"\nPhone#: "+phoneNumber+"\nEmail Address: "+emailAddress+"\n\n+++++++++++++++++++++++++\n";
	}
}
