import java.time.LocalDate;

public class Patient extends User{
	private LocalDate dateBirth;
	private char gender;
	private String DEFAULT = "Unknown"; 
	
	public Patient(int id, String firstName, String lastName, String phoneNum, String email, LocalDate dateBirth,
			char gender) {
		super(id, firstName, lastName, phoneNum, email);
		setDateBirth(dateBirth);
		setGender(gender);
	}
	
	public LocalDate getDateBirth() {
		return dateBirth;
	}
	/**
	 * @return the gender
	 */
	
	public char getGender() {
		return gender;
	}
	
	public void setDateBirth(LocalDate dateBirth) {
		LocalDate d = LocalDate.of(1910, 1, 1);
		if(dateBirth.compareTo(d) > 0) {
			this.dateBirth = dateBirth;
		} else { this.dateBirth = (d);}
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		if(gender == 'M' || gender == 'm') {
			this.gender = 'M';
		} else if(gender == 'W' || gender == 'w') {
			this.gender = 'W';
		} else {
			this.gender = 'U';
		}
	}
	public String toString() {
		return super.toString() + "\nDate of birth: " + dateBirth + ". Gender: " + gender;
				
	}
}