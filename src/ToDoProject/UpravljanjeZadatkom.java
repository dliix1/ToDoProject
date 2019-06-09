package ToDoProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UpravljanjeZadatkom {

	ArrayList<UpravljanjeZadatkom> zadaci = new ArrayList<UpravljanjeZadatkom>();
	Scanner unos = new Scanner(System.in);

	public void kreiranjeNovogZadatka(ArrayList<UpravljanjeZadatkom> zadaci) {
		System.out.println("Unesite opis zadatka; ");
		String opisZadatka = unos.nextLine();

		System.out.println("Unesite status zadatka; ");
		boolean statusZadatka = unos.nextBoolean();
		
		System.out.println("Unesite ime vlasnika zadatka; ");
		String imeVlasnika = unos.next();
		
		System.out.println("Unesite datum kreiranja; ");

		new Zadatak(opisZadatka, statusZadatka);

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

	public void ispisSvihZadataka(ArrayList<UpravljanjeZadatkom> zadaci) {

		if (zadaci.size() == 0) {
			System.out.println("Lista je prazna.");
			
		} else {
			for (int i = 0; i < zadaci.size(); i++) {
				System.out.println((i + 1) + " " + zadaci.get(i));
			}
		}
	}

}
