
public abstract class User {
	
	private int id;
	private String name;
	private String email;
	private String address;
	private String phoneNumber;
	
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "User: " + name + ", Email: "+email+
				"\nAddress: "+address+". Phone: "+phoneNumber;
	}
	
	public abstract void showDataUser(); 
	
}
