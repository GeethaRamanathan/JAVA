import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String company = "infomat.com";
	private int mailBoxCapacity = 500;
	private String alternatemailid;
	private String password;
	private int defaultlength = 10;
	private String email;
	
	//Constructor to get firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		//System.out.println("Your Department : " + department);
		
		this.password = newPassword(defaultlength);
		//System.out.println("Your default password : " + password);
		
		this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.company;
		//System.out.println("Your email id : "+ email);
	}
	
	//Set the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1. Automation\n2. Testing\n3. Development\n0. None\nEnter the department code of your choice:");
		Scanner sc = new Scanner(System.in);
		int deptcode = sc.nextInt();
		if (deptcode == 3) return "development";
		else if (deptcode == 1) return "automation";
		else if (deptcode == 2) return "testing";
		else return "";
		}
	
	//Generate random password
	private String newPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%^";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int index = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(index);
		}
		return new String(password);
	}
	
	//Generate alternate mailid
	public void setAlternateMailid(String altemail) {
		this.alternatemailid = altemail;
	}
	
	//Change password
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	//Change mailbox capacity
	public void setmailboxcapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	
	public String getAlternateMailid() { return alternatemailid; }
	
	public String getPassword() { return password;}
	
	public int getmailboxcapacity() {return mailBoxCapacity;}
	
	public String display() {
		return "Name : " + firstName + " " + lastName + "\n" + "Email id : " + email + "\n" + "MailBox Capacity : " + mailBoxCapacity + "mb";
	}

}

	


