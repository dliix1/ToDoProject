package ToDoProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UpravljanjeZadatkom {
	
	ArrayList<UpravljanjeZadatkom> zadaci = new ArrayList<UpravljanjeZadatkom>();
	Scanner unos = new Scanner(System.in);
	
	public void kreiranjeNovogZadatka (ArrayList<UpravljanjeZadatkom> zadaci){
		System.out.println("Unesite opis zadatka; ");
		String opisZadatka = unos.nextLine();
		
		System.out.println("Unesite status zadatka; ");
		boolean statusZadatka = unos.nextBoolean();
		
		new Zadatak (opisZadatka, statusZadatka);
		
	}
	
	public void markiranjeZadatkaKaoZavrsen (ArrayList<Zadatak> zadaci){
		
		System.out.println("\nUnesite redni broj zadatka koji zelite oznaciti uradjenim:  ");
		int index = unos.nextInt();

		for (int i = 0; i < zadaci.size(); i++) {
			if (index - 1 == i) {
				if (zadaci.get(i).statusZadatka) {
					zadaci.get(i).setStatusZadatka(false);
					System.out.println("Stanje zadatka je uspjesno promijenjeno u neizvrseni zadatak.");
				} else {
					zadaci.get(i).setStatusZadatka(true);
					System.out.println("Stanje zadatka je uspjesno promijenjeno u izvrseni zadatak.");
				}
			}
		}
	}

}
