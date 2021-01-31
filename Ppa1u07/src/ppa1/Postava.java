package ppa1;
//import java.util.*;


import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Vlasenko Artem
 *
 */
public class Postava {
	
	//Zakladni vlastnosti postavy
	public String jmeno;
	public int sila;
	public int vitalita;
	public int hbitost;
	public  Zbran prava;
	public Zbran leva;
	
	private List<Ruka> uziva = new ArrayList<Ruka>(); // Ruky postavy
	
	public int zdravi;
	private int utok;
	private int obrana;
	
	
	/**Konstruktor vytvori instanci postavy se jmenem, zakladni silou,
	 * hbitosti a vitalitou.
	 * @param jmeno
	 * @param sila
	 * @param hbitost
	 * @param vitalita
	 */
	public Postava ( String jmeno, int sila, int hbitost, int vitalita) {
		
		this.jmeno = jmeno;
		this.sila = sila;
		this.vitalita = vitalita;    //} param postavy
		this.hbitost = hbitost;
		
		
		utok = sila;
		zdravi = vitalita;
		obrana = hbitost;
	}
	
	/**Pokud postava nema v ruce ruka zbran, vezme ji a vrati
	 * hodnotu true
	 * @param ruka
	 * @param zbran
	 * @return
	 */
	public boolean vezmiZbran( Ruka ruka, Zbran zbran) {
		
		if (!(uziva.contains(ruka))) {
			uziva. add(ruka);
			
			obrana = obrana + zbran. getObrana();	// obrana postavy
			utok = utok + zbran.getUtok();			// utok zbrane

			
			zbran. jakaRuka(ruka);

			return true;

		}
		else {return false; }
	}
	
	/**Snizi zdravi postavy v zavislosti na sile utoku a aktualni obranne
	 * sile
	 * @param utok
	 * @return
	 */
	public int branSe (int utok) {
		
		if(obrana < utok) {
			zdravi = zdravi - (utok - obrana); // postava dostaje poskozeni
				
			return (utok -obrana);
		}
		else {return 0;}
	}
	
	
	/**
	 * Vrati celkovou obrannu silu
	 * @return
	 */
	/*public int celpovaObtana () {
		
        if ((prava == null) && (leva == null)) { return hbitost;}
		
		else if (prava == null) { return hbitost + leva.getObrana();}
		
		else if (leva == null) { return hbitost + prava.getObrana();}
		
		else { return hbitost + prava.getUtok() + leva.getObrana();}
	}
	*/
	/**
	 * Vrati celkovou utocnou silu
	 * @return
	 */
	public int zautoc() { return utok;}
	
	
	/**
	 * Vrati informace o postave 
	 */
	public String toString() {
		
	   //String text =  jmeno + " [" + zdravi + "/" + vitalita + "] (" + utoc + "/" + obrana ")";
		 String text = String.format("%s [%d/%d] (%d/%d)", jmeno, zdravi, vitalita, utok, obrana);
	   return text;
	}
	
	
	
	/**
	 * Pokud je aktualni zdravi vetsi nez 0, postava je ziva
	 * @return vraci estli postava ziva
	 */
	public boolean jeZiva() {
		
			if (zdravi < 1) {return false;} // postava mrtva
			else {return true;} // postava ziva
	}

}
