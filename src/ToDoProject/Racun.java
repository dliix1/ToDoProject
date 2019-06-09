package ToDoProject;

public class Racun {
	
	private String imeVlasnika;
	private String password; 
	
	Racun(){
		
	}
	
	Racun (String imeVlasnika, String password){
		this.imeVlasnika = imeVlasnika;
		this.password = password;
	}

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Racun [ime vlasnika racuna: " + imeVlasnika + ", password racuna: "
				+ password + "]";
	}
	

}
