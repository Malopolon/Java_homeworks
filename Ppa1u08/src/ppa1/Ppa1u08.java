package ppa1;
import java.util.*;

	/**
	 * 
	 * @author Vlasenko Artem	
	 * @version 18.12.2019
	 */

public class Ppa1u08 {
	
	public static Scanner sc;
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
			sc = new Scanner(System.in);
			
			Svet svet=new Svet(7,5,new char[]  
					
					                                            {
																 '#','#','#','#','#','#','#',
																 '#',' ','#',' ',' ',' ','#',
																 '#',' ','#',' ',' ',' ','#',
																 '#',' ',' ',' ','#',' ','#',
																 '#','#','#','#','#','#','#',
                             	                                                             });
      
			GUI gui = new GUI (7,5,sc);
			Postava postava = new Postava ( svet,2,3,3,2);
			
			boolean scan = Ppa1u08.spust (gui,svet,postava);
			if (scan == true) {
				 System.out.println("Konecne doma...");
				 
			}
			else if (scan == false) {
				System.out.println("Asi jsem se ztratil...");
			}
	}
	
	/**
	 * Metoda spustui nekonecnou smycku, ve ktere smaze platno GUI,
	 * vykresli sveta postavu, a nasledne zobrazit GUI na System.out.
	 * @param gui
	 * @param svet
	 * @param postava
	 * @return
	 */
	public static boolean spust(GUI gui, Svet svet, Postava postava) {
		
		boolean otazka = false;
		boolean prvni = false;
		boolean cesta;
		
		while (prvni != true) {
			
			gui.vykresli();
			svet.vykresli  (gui);
			gui.smaz();
			postava.vykresli(gui);
			
			Smer smer = gui.nactiAkci();
			cesta = postava.jdi(smer);
			
			if (postava.jeDoma () == true) {
				 
				prvni = true;
				otazka = true;
				break;
			}
			else if (cesta == false) {
				
				prvni = true;
				otazka = false;
			}
			else {
				
				prvni = false;
				System.out.println("Kam dal?");
			}
			
		}
			return otazka;
	}
}
