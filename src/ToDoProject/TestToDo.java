package ToDoProject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class TestToDo {

	public static Scanner unos = new Scanner(System.in);
	static ArrayList<Racun> racuni;
	static ArrayList<Zadatak> zadaci = new ArrayList<>();

	public static void main(String[] args) throws ParseException {
		
		menu();

	}

	public static void menu(){
		System.out.println("--- TODO APP ---");
		System.out.println("Odaberite akciju: ");
		System.out.println("1. Kreiranje racuna. ");
		System.out.println("2. Logovanje u aplikaciju. ");
		
		int unosKorisnika = unos.nextInt();
		
		switch (unosKorisnika) {
		case 1:
			kreiranjeRacuna();
			break;

		case 2:
			racunLogin();
			break;
		}

	}

	public static void loginMenu() {
		System.out.println("--- LOGIN MENU ---");
		System.out.println("Odaberite akciju: ");
		System.out.println("1. Dodavanje novog zadatka. ");
		System.out.println("2. Editovanje vec postojeceg zadatka. ");
		System.out.println("3. Brisanje vec postojeceg zadatka. ");
		System.out.println("4. Izlistavanje zadataka. ");
		
		int unosKorisnika = unos.nextInt();
		
		switch (unosKorisnika) {
		case 1:
			dodavanjeNovogZadatka(null);
			break;

		case 2: 
			editovanjeZadataka();
			break;
		
		case 3: 
			brisanjeZadatka();
			break;
			
		case 4: 
			izlistavanjeZadataka();
			break;
		}

	}

	public static void kreiranjeRacuna(){
		System.out.println("Unesite svoje ime: ");
		String imeVlasnika = unos.next();

		System.out.println("Unesite vas password (mora sadrzavati vise od 7 slova, i 2 broja): ");
		String password = unos.next();

		if (password.length() < 7) {
			System.out.println("Password mora sadrzavati vise od 7 slova! Unesite vas password ponovo. ");
			password = unos.next();
		}

		new Racun(imeVlasnika, password);
		
		System.out.println("Uspjesno ste kreirali svoj racun!");
		System.out.println();
		
		menu();
		
	}
	
	public static void racunLogin(){
		System.out.println("Unesite vase ime: ");
		String imeVlasnika = unos.next();
		
		System.out.println("Unesite vas password: ");
		String password = unos.next();
		
		System.out.println("Uspjesno ste se logovali.");
		System.out.println();
		
		loginMenu();
		
	}

	public static void dodavanjeNovogZadatka(Date datumKreiranjaZadatka) {
		System.out.println("Unesite vase ime: ");
		String imeVlasnika = unos.next();
		
		System.out.println("Unesite opis zadatka: ");
		String opisZadatka = unos.next();
		
		System.out.println("Unesite vrijeme kreiranja zadatka (dd-MM-yyyy)");
		DateFormat noviDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String datumKreiranja = noviDateFormat.format(datumKreiranjaZadatka);

		boolean statusZadatka = false;
		
		Zadatak noviZadatak = new Zadatak (opisZadatka, statusZadatka, imeVlasnika, datumKreiranjaZadatka);
		
		zadaci.add(noviZadatak);
		
		loginMenu();
		
	}
	
	public static void editovanjeZadataka(){
		System.out.println("Unesite broj zadatka: ");
		int brojZadatka = unos.nextInt();
		
		System.out.println("Unesite novu deskripiciju zadatka: ");
		String editovaniTekst = unos.next();
		
		UpravljanjeZadatkom upravljanje = new UpravljanjeZadatkom();
		
		upravljanje.editovanjeZadatka(brojZadatka, editovaniTekst, zadaci);
		
		System.out.println("Zadatak je uspjesno editovan!");
		
		loginMenu();
	}
	
	public static void brisanjeZadatka(){
		System.out.println("Unesite broj zadatka: ");
		int brojZadatka = unos.nextInt();
		
		UpravljanjeZadatkom upravljanje = new UpravljanjeZadatkom();
		upravljanje.brisanjeZadatka(brojZadatka, zadaci);
		
		System.out.println("Zadatak je uspjesno izbrisan!");
		
		loginMenu();
	}
	
	public static void izlistavanjeZadataka(){
		if(zadaci.size() != 0){
			UpravljanjeZadatkom upravljanje = new UpravljanjeZadatkom();
			upravljanje.izlistavanjeZadataka(zadaci);
			
			loginMenu();
		}
	}
	
}
