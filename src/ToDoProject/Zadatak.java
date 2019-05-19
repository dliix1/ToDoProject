package ToDoProject;

public class Zadatak {
	
	public String opisZadatka;
	public boolean statusZadatka;
	
	Zadatak(){
		
	}
	
	Zadatak(String opisZadatka, boolean statusZadatka){
		
		this.opisZadatka = opisZadatka;
		this.statusZadatka = statusZadatka;
		
	}

	public String getOpisZadatka() {

		return opisZadatka;
	}

	public void setOpisZadatka(String opisZadatka) {
		this.opisZadatka = opisZadatka;
	}

	public boolean isStatusZadatka() {
		return statusZadatka;
	}

	public void setStatusZadatka(boolean statusZadatka) {
		this.statusZadatka = statusZadatka;
	}
	
	@Override
	public String toString(){
		return "Zadatak [opis: " +opisZadatka + ", status zadatka: " +statusZadatka + "]";
	}
}

