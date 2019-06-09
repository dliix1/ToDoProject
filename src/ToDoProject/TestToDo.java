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

	public static void main(String[] args) {

	}

	public static void menu() {
		System.out.println("--- TODO APP ---");
		System.out.println("Odaberite akciju: ");
		System.out.println("1. Kreiranje racuna. ");
		System.out.println("2. Logovanje u aplikaciju. ");

	}

	public static void loginMenu() {
		System.out.println("--- LOGIN MENU ---");
		System.out.println("Odaberite akciju: ");
		System.out.println("1. Dodavanje novog zadatka. ");
		System.out.println("2. Editovanje vec postojeceg zadatka. ");
		System.out.println("3. Brisanje vec postojeceg zadatka. ");
		System.out.println("4. Izlistavanje zadataka. ");

	}

	public static void kreiranjeRacuna() {
		System.out.println("Unesite svoje ime: ");
		String imeVlasnika = unos.next();

		System.out.println("Unesite vas password (mora sadrzavati vise od 7 slova, i 2 broja): ");
		String password = unos.next();

		if (password.length() < 7) {
			System.out.println("Password mora sadrzavati vise od 7 slova! Unesite vas password ponovo. ");
			password = unos.next();
		}

		new Racun(imeVlasnika, password);
	}
	
	public static void racunLogin(){
		System.out.println("Unesite vase ime: ");
		String imeVlasnika = unos.next();
		
		System.out.println("Unesite vas password: ");
		String password = unos.next();
		
		Validacija validacija = new Validacija();
		
		if (validacija.loginValidacija(imeVlasnika, password, racuni)){
			System.out.println("Uspjesno ste se logovali na vas account.");
		}
	}

	public static void dodavanjeNovogZadatka() throws ParseException {
		System.out.println("Unesite vase ime: ");
		String imeVlasnika = unos.next();
		
		System.out.println("Unesite opis zadatka: ");
		String opisZadatka = unos.next();
		
		System.out.println("Unesite vrijeme kreiranja zadatka (dd-MM-yyyy)");
		DateFormat datum = new SimpleDateFormat("dd-MM-yyyy");
		String datumKreiranjaString = unos.nextLine();
		Date datumKreiranjaZadatka = datum.parse(datumKreiranjaString);
		
		boolean statusZadatka = false; 
		
		Zadatak noviZadatak = new Zadatak (opisZadatka, statusZadatka, imeVlasnika, datumKreiranjaZadatka);
		
		zadaci.add(noviZadatak);
	}
	
	public static void editovanjeZadataka(){
		
	}
	
}