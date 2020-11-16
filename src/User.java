
public class User {
	private int id;
	private String lastName;
	private String firstName;
	private String phoneNum;
	private String email;
	private String DEFAULT = "Unknown";
	
	
	public User(int id, String firstName, String lastName, String phoneNum, String email) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNum(phoneNum);
		setEmail(email);
	}
	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getPhoneNumber() {
		return phoneNum;
	}


	public String getEmail() {
		return email;
	}
	
	public void setId(int id) {
		if(id >= 1000 && id <= 10000) {
			this.id = id;
			} else {
				System.err.println("Id number is incorrect");
			}
		}

	public void setLastName(String lastName) {
		if(!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
			} else {
				this.lastName = DEFAULT;
			}
	}


	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
			} else {
				this.firstName = DEFAULT;
			}
		}


	public void setPhoneNum(String phoneNum) {
		if(!phoneNum.isEmpty() && !phoneNum.equalsIgnoreCase(null)) {
			this.phoneNum = phoneNum;
			} else {
				this.phoneNum = DEFAULT;
			}
	}


	public void setEmail(String email) {
		if(!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
			} else {
				this.email = DEFAULT;
			}
	}
	public String toString() {
		return "ID : " + id + ". Name : " + firstName + " " + lastName + ".\nPhone number :  " + phoneNum + ". Email : " + email;
	}
}