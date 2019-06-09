package ToDoProject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class UpravljanjeZadatkom {

	ArrayList<UpravljanjeZadatkom> zadaci = new ArrayList<UpravljanjeZadatkom>();
	Scanner unos = new Scanner(System.in);

	public void kreiranjeNovogZadatka(String opisZadatka,
			boolean statusZadatka, String imeVlasnika,
			Date datumKreiranjaZadatka, ArrayList<UpravljanjeZadatkom> zadaci) {
		
		System.out.println("Unesite opis zadatka; ");
		opisZadatka = unos.nextLine();

		System.out.println("Unesite status zadatka; ");
		statusZadatka = unos.nextBoolean();

		System.out.println("Unesite ime vlasnika zadatka; ");
		imeVlasnika = unos.nextLine();

		System.out.println("Unesite datum kreiranja; ");
		DateFormat noviDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String datumKreiranja = noviDateFormat
				.format(datumKreiranjaZadatka);

		new Zadatak(opisZadatka, statusZadatka, imeVlasnika,
				datumKreiranjaZadatka);

	}

	public void brisanjeZadatka(ArrayList<UpravljanjeZadatkom> zadaci) {
		System.out.println("\nUnesite redni broj zadatka: ");
		int index = unos.nextInt();

		int i = index - 1;

		zadaci.remove(i);
		System.out.println("Zadatak broj: " + index + " je obrisan.");
	}

	public void markiranjeZadatkaKaoZavrsen(ArrayList<Zadatak> zadaci) {

		System.out
				.println("\nUnesite redni broj zadatka koji zelite oznaciti uradjenim:  ");
		int index = unos.nextInt();

		for (int i = 0; i < zadaci.size(); i++) {
			if (index - 1 == i) {
				if (zadaci.get(i).statusZadatka) {
					zadaci.get(i).setStatusZadatka(false);
					System.out
							.println("Stanje zadatka je uspjesno promijenjeno u neizvrseni zadatak.");
				} else {
					zadaci.get(i).setStatusZadatka(true);
					System.out
							.println("Stanje zadatka je uspjesno promijenjeno u izvrseni zadatak.");
				}
			}
		}
	}

	public void editovanjeZadatka(int brojZadatka, String editovaniTekst,
			ArrayList<Zadatak> adaci) {
		if (zadaci.size() > 0) {
			zadaci.get(brojZadatka - 1).setOpisZadatka(editovaniTekst);
		}
	}

	public void setOpisZadatka(String editovaniTekst) {
	}

	public void brisanjeZadatka(int brojZadatka, ArrayList<Zadatak> zadaci) {
		if (zadaci.size() != 0) {
			zadaci.remove(brojZadatka - 1);
			System.out.println("Zadatak je izbrisan.");
		}
	}

	public void izlistavanjeZadataka(ArrayList<Zadatak> zadaci) {
		for (int i = 0; i < zadaci.size(); i++) {
			System.out.println((i + 1) + ". Ime vlasnika: "
					+ zadaci.get(i).getImeVlasnika() + ", opis zadatka: "
					+ zadaci.get(i).getOpisZadatka()
					+ ", datum i vrijeme kreiranja zadatka:  "
					+ zadaci.get(i).getDatumIVrijemeKreranja());
		}
	}
}
