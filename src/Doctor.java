import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Doctor extends User{
	private String speciality;
	private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
	
	public Doctor(String name, String email){
		super(name,email);
		System.out.println("El nombre del doctor asignado es "+ name);
		this.speciality = speciality;
	}

	
	public void set_speciality(String speciality) {
		this.speciality=speciality;
	}
	
	public String get_speciality() {
		return speciality;
	}
	
	
	
	
	public void addAvailableAppointment(String date, String time) {
		
		availableAppointments.add(new Doctor.AvailableAppointment(date,time));
	}
	
	public ArrayList<AvailableAppointment> getAvailableAppointments(){
		return availableAppointments;
	}
	
	@Override
	public String toString() {
		return super.toString() +"\nSpeciality: "+speciality+"\nAvailable: "+availableAppointments.toString() ;
	}
	
	@Override
	public void showDataUser() {
		System.out.println("Empleado Hospital: Garrahan");
		System.out.println("Departamento: Oncología");
	}
	
	
	
	public static class AvailableAppointment{
		private int id;
		private Date date;
		private String time;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		public AvailableAppointment(String date, String time) {
			try {
				this.date = format.parse(date);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.time = time;
		}
		
		public int get_id() {
			return id;
		}
		
		public void set_id(int id) {
			this.id = id;
		}
		
		public Date get_date(String DATE) {
			return date;
		}
		public String get_date() {
			return format.format(date);
		}
		
		public void set_date(Date date) {
			this.date = date;
		}
		
		public String get_time() {
			return time;
		}
		
		public void set_time(String time) {
			this.time = time;
		}
		
		@Override
		public String toString() {
			return "Available Appointments \nDate: "+date+"\nTime: "+time;
		}
		
	}
}
