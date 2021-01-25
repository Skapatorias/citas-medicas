
public class Nurse extends User {
	
		private String speciality;
		
		public Nurse(String name, String email) {
			super(name, email);
		}
		
		@Override
		public void showDataUser() {
			System.out.println("Empleado Hospital: Fernandez");
			System.out.println("Departamento: Cardiología");
		}
	
}
