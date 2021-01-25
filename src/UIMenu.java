
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
	
	public static final String[]  MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }; 
	public static Doctor doctorLogged;
	public static Patient patientLogged;
	
	static void showMenu() {
		System.out.println("Welcome to my Appointments");
        System.out.println("Please type the number according to your user category");

        int response = 0;

        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Exit");

            Scanner typed = new Scanner(System.in);
            try{
                response = Integer.valueOf(typed.nextLine());
            }catch (NumberFormatException e){
                response = 9;
            }

            System.out.println(response);
            switch (response){

                case 1:
                    System.out.println("Welcome Doctor!!");
                    response = 0;
                    authUser(1);
                    break;

                case 2:
                	response = 0;
                    System.out.println("Welcome Patient!!");
                    authUser(2);
                    break;

                case 9:
                    System.out.println("Hola \n The value received is not admitted, please try again.");
                    break;

                case 0:
                    System.out.println("It was nice to assist you. See you soon!");
                    break;


                default:
                    System.out.println("Hola! \n You typed an incorrect number, please type the number according" +
                            "to your user category");

            }

        }while(response != 0);
    }
	
	private static void authUser(int userType) {
		//UserType == 1 Doctor
		//UserType == 2 Patient
		
		ArrayList<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("Alejandro Martinez", "ale@mail.com"));
		doctors.add(new Doctor("Karen Sosa", "kare@mail.com"));
		doctors.add(new Doctor("Rocio Gomez", "rocio@mail.com"));
		
		ArrayList<Patient> patients = new ArrayList<>();
		patients.add(new Patient("Anahi Salgado", "ana@mail.com"));
		patients.add(new Patient("Sofia Listorti", "sofia@mail.com"));
		patients.add(new Patient("Carlos Sanchez", "carlos@mail.com"));
		
		boolean emailCorrect = false;
		do {
			System.out.println("Insert your email: [a@a.com]");
			Scanner sc = new Scanner(System.in);
			String email = sc.nextLine();
			if (userType == 1) {
				for(Doctor d: doctors) {
					if (d.getEmail().equals(email)) {
						emailCorrect = true;
						//Obtener usuario logueado
						doctorLogged = d;
						UIDoctorMenu.showDoctorMenu();
					}
				}
			}
			if (userType == 2) {
				for(Patient p: patients) {
					if (p.getEmail().equals(email)) {
						emailCorrect = true;
						patientLogged = p;
						//Show pattient menu
						UIPatientMenu.showPatientMenu();
					}
				}
			}
			
		}while(!emailCorrect);
	}
	
    static void showPatientMenu(){
        int response = 0;

        do{
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return to the main menu");

            Scanner typed = new Scanner(System.in);
            try{
                response = Integer.valueOf(typed.nextLine());
            }catch (NumberFormatException e){
                response = 9;
            }

            switch (response){
                case 1:
                    System.out.println(":: Welcome to the booking appointment screen");
                    for (int i=1; i<4; i++) {
                    	System.out.println(i + "." + MONTHS[i]);
                    }
                    break;

                case 2:
                    System.out.println(":: Welcome to your appointments dashboard");
                    break;

                    case 9:
                    System.out.println("Hola \n The value received is not admitted, please try again.");
                    break;

                case 0:
                    showMenu();
                    break;

                default:
                    System.out.println("Hola! \n You typed an incorrect number, please type the number according" +
                            "to the available options from the menu");
            }

        }while (response != 0);
    }
	
}
