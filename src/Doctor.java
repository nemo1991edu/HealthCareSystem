import java.util.ArrayList;

public class Doctor extends User {
	
	private String specialty;
	private ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	public Doctor(int id, String firstName, String lastName, String phoneNum, String email, String specialty, ArrayList<Appointment> appointments) {
		super(id, firstName, lastName, phoneNum, email);
		setSpecialty(specialty);
		setAppointment(appointments);
	}
	
	
	public String getSpecialty() {
		
		if(specialty.isEmpty() && specialty.equalsIgnoreCase(null)) {
			return "Unknown";
		} else {
			return this.specialty;
		}
	}
	/**
	 * 
	 * @return appointments
	 */
	public ArrayList<Appointment> getAppointment() {
		return appointments;
	}
	
	
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
		
	}
	/**
	 * 
	 * @param appointments
	 */
	public void setAppointment(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
		
	}
	@Override
	public String toString() {
		return super.toString()	+ appointments.toString() ;
	}
		
}