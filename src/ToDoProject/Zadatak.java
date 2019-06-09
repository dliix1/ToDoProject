package ToDoProject;

import java.util.Date;

public class Zadatak {

	public String opisZadatka;
	public boolean statusZadatka;
	public String imeVlasnika;
	public Date datumIVrijemeKreranja;

	Zadatak() {

	}

	Zadatak(String opisZadatka, boolean statusZadatka, String imeVlasnika, Date datumIVrijemeKreiranja) {

		this.opisZadatka = opisZadatka;
		this.statusZadatka = statusZadatka;
		this.imeVlasnika = imeVlasnika;
		this.datumIVrijemeKreranja = datumIVrijemeKreiranja;

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

	public String getImeVlasnika() {
		return imeVlasnika;
	}

	public void setImeVlasnika(String imeVlasnika) {
		this.imeVlasnika = imeVlasnika;
	}

	public Date getDatumIVrijemeKreranja() {
		return datumIVrijemeKreranja;
	}

	public void setDatumIVrijemeKreranja(Date datumIVrijemeKreranja) {
		this.datumIVrijemeKreranja = datumIVrijemeKreranja;
	}

	@Override
	public String toString() {
		return "Zadatak [opis: " + opisZadatka + ", status zadatka: "
				+ statusZadatka + "]";
	}
}
