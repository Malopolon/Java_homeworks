package ppa1;
import java.util.*;

/**Nalezeni souradnic dvou zbyvajicich vrcholu ctverce pomoci souradnic znamych vrcholu
 * @author Vlasenko Artem
 * @version 20.10.2019
 */

public class Ppa1u02b {
	public static Scanner sc;
	
	/** Vypocet souradnice zbyvajicich dvou bodu B a D 
	 * @param args parametry prikazove radky (nevyuzite)
	 */
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		sc.useLocale(Locale.US); //Nastaveni americkeho lokalniho nastaveni
		
		System.out.print("Zadej Ax: ");
		double Ax = sc.nextDouble();
		System.out.print("Zadej Ay: ");
		double Ay = sc.nextDouble();
		
		System.out.print("Zadej Cx: ");
		double Cx = sc.nextDouble();
		System.out.print("Zadej Cy: ");
		double Cy = sc.nextDouble();
		
		//Nalezeni stredu ctverce a vzdalenosti od stredu ctverce k bodum B a D
		double Oy = Ay - Cy;
		double Ox = Cx - Ax;
		double d = (Ox - Oy) / 2;
		// bod B:
		double Dx = Ax + d;
		double Dy = Cy - d;
		// bod D:
		double Bx = Cx - d;
		double By = Ay + d;
	    
		
		System.out.format(Locale.US,"Bx = %8.3f%n", Bx ); // zaokrouhleny na tri desetinne misto
		
		System.out.format(Locale.US,"By = %8.3f%n", By );
		
		System.out.format(Locale.US,"Dx = %8.3f%n", Dx );
		
		System.out.format(Locale.US,"Dy = %8.3f%n", Dy );


	}

}
