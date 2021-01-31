package ppa1;
import java.util.*;
  /**
   * 
   * @author Vlasenko Artem
   *
   */

public class Ppa1u07 {
		
	
	public static Scanner sc;
	
	/**Z predaneho Scanneru nacte postupne jmeno, silu, hbitost
	 * zdravi a vytvori novou postavu. 
	 * @param sc
	 * @return
	 */
	public static Postava nactiPostavu (Scanner sc) {
		
		System.out.println("Jmeno postavy: ");
		String jmeno = sc.nextLine();
		
		System.out.println("Sila: ");
		int sila = Integer.parseInt (sc.nextLine());
		
		System.out.println("Hbitost: ");
		int hbitost = Integer.parseInt(sc.nextLine());
		
		System.out.println("Zdravi: ");
		int vitalita = Integer.parseInt(sc.nextLine());
		// zakladni informace o postave
		Postava postava  =new Postava(jmeno,sila, hbitost, vitalita); 
		
		return  postava;
	}
	
	/**Z predaneho Scanneru nacte postupne nazev, utocnou a
	 * obrannou silu a vytvori novou zbran
	 * @param sc
	 * @return
	 */
	public static Zbran nactiZbran (Scanner sc) {
		
		System.out.println("Nazev zbrane: ");
		String nazev =sc.nextLine();
		
		if (nazev.isEmpty()) {return null;} // u zbrane musi byt nazev
		
		else {
			
			int utok =  Integer.parseInt(sc.nextLine()); // DMG zbrane
	        int obrana =Integer.parseInt(sc.nextLine()); // DEF zbrane
	        
	        Zbran zbran = new Zbran(nazev, utok, obrana); // informace o zbrane
			System.out.println();
	        //return new Zbran(nazev, utok, obrana);
			return zbran;
		}
	}
	
	
	
	/**
	 * Vyzbroji postavu dodanymi zbranemi
	 * @param postava
	 * @param leva
	 * @param prava
	 */
	public static void vyzbrojPostavu (Postava postava, Zbran leva, Zbran prava) {
		// zbran jenom v jedne ruce
		if (prava == null && leva != null)      {postava.vezmiZbran(Ruka.LEVA, leva);}
		else if (leva == null && prava != null) {postava.vezmiZbran(Ruka.PRAVA, prava);}
		// zbran v obou rukah
		else if (prava != null && leva != null)
		{
			postava.vezmiZbran(Ruka.LEVA, leva);
			postava.vezmiZbran(Ruka.PRAVA, prava);
		}	
	}
	/*if (prava != null) {postava.vezmiZbran(Ruka.PRAVA, prava);}
	if (leva != null) {postava.vezmiZbran(Ruka.LEVA, prava);}*/
	
	
	/**
	 * Spusti souboj mezi postavami.
	 * @param postava1
	 * @param postava2
	 * @return
	 */
	
	public static Postava souboj(Postava postava1, Postava postava2) {
		
		/*int celyUtok1 = postava1.zautoc() - postava2.vseObrana();
		System.out.println("Utoci " + postava1.toString() + " a dava " + celyUtok1 + " zraneni");*/
		
		
		System.out.println ("Souboj: " + postava1.toString()  +" vs " +postava2.toString());
		System.out.println();
		
		do {
			System.out.println("utoci " + postava1.toString() + " a dava " +  postava2.branSe(postava1.zautoc())+ "zraneni");
			if (postava2.jeZiva()) {
				
				
			System.out.println("utoci " +postava2.toString() +  " a dava " +postava1.branSe(postava2.zautoc())+ "zraneni");
			}
		} 
		
		while(postava1.jeZiva()&& postava2.jeZiva());
		System.out.println();
		
		if (postava1.jeZiva()) {return postava1;}
		else                   {return postava2;} // }Ktera z postav ziva
	}
	
	/**
	 * Vstupni bod programu
	 * @param args
	 */

	/*	sc = new Scanner(System.in);
		// informace o postave 1
		System.out.println("Prvni Postava: ");
		Postava postava1 = nactiPostavu(sc);
		
		Zbran weapon1Left = nactiZbran(sc);
		Zbran weapon1Right = nactiZbran(sc);
		vyzbrojPostavu(postava1, weapon1Left, weapon1Right);
		
		System.out.println();
		
		
		// informace o postave 2
		System.out.println("Druha Postava: ");
		Postava postava2 = nactiPostavu(sc);
		
		Zbran weapon2Left = nactiZbran(sc);
		Zbran weapon2Right = nactiZbran(sc);
		vyzbrojPostavu(postava1, weapon2Left, weapon2Right);
		
		
		//Fight
		 System.out.println("Souboj: " + postava1.toString() + " vs " + postava2.toString());
		 System.out.println();
		
	     System.out.println("Vitez: " + souboj(postava1, postava2).toString());
	}
	*/
		public static void main(String[] args) {
			sc = new Scanner(System.in);
			// informace o postave 1
			Postava postava1 = nactiPostavu(sc);
			Zbran weapon11 = nactiZbran(sc);
			Zbran weapon12 = nactiZbran(sc);
			// informace o postave 2
			Postava postava2 = nactiPostavu(sc);
			Zbran weapon21 = nactiZbran(sc);
			Zbran weapon22 = nactiZbran(sc);
		
			vyzbrojPostavu(postava1, weapon11, weapon12);
			vyzbrojPostavu(postava2, weapon21, weapon22);

			System.out.println("Vitez: " + souboj(postava1, postava2).toString());
		}
}
