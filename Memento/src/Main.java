import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

	        Arvuuttaja arvuuttaja = new Arvuuttaja(30);
	        List<Caretaker> pelaajat = new ArrayList<>();
	        Random arpoja = new Random();
	        
	        for (int i = 0; i < 50; i++) {
	            Caretaker pelaaja = new Caretaker();
	            pelaaja.liityPeliin(arvuuttaja);
	            pelaajat.add(pelaaja);
	        }
	        
	        for (Caretaker pelaaja : pelaajat) {
	            int arvaus = arpoja.nextInt(30);
	            
	            if (pelaaja.arvaa(arvuuttaja, arvaus) == true) {
	                System.out.println("Pelaaja arvasi oikein! Arvaus: " + arvaus);
	            } else {
	                System.out.println("Pelaaja arvasi väärin! Arvaus: " + arvaus);
	            }
	        }   
	}

}
