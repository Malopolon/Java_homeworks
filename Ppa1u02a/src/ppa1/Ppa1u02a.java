package ppa1;
/** Nacteni z klavesnice hodnot a vypocet zlevneneho jizdne 
 * @author Vlasenko Artem
 * @version 19.10.2019
 */
import java.util.*;

public class Ppa1u02a {
	
	public static Scanner sc;
	 /** Vypocet  zlevneneho jizdne 
	   * @param args parametry prikazove radky (nevyuzite)
	   */
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		sc.useLocale(Locale.US); //Nastaveni americkeho lokalniho nastaveni
		
		System.out.print("Zadej plne jizdne [Kc]: ");
		double plneJizdne = sc.nextDouble();
		System.out.print("Zadej slevu [%]: ");
		double sleva = sc.nextDouble();
		System.out.println("Zadej cenu slevove karty [Kc]: ");
		double cenaSlevKarty = sc.nextDouble();

		double zlevneneJizdne = plneJizdne * ((double)(1)-(sleva / 100));
		
		double prvniJizda = cenaSlevKarty + zlevneneJizdne;
		double druhaJizda = (prvniJizda + zlevneneJizdne)/ 2;
		double tretiJizda = (prvniJizda + zlevneneJizdne * 2)/ 3;
		
		System.out.format(Locale.US,"bezne jizdne:  %8.1f%n", plneJizdne ); //  zaokrouhleny na jedne desetinne misto
		
		System.out.format(Locale.US,"zlevnene jizdne: %8.1f%n", zlevneneJizdne );
		
		System.out.format(Locale.US,"1 jizda: %8.1f%n", prvniJizda );
		
		System.out.format(Locale.US,"2 jizdy: %8.1f%n", druhaJizda );

		System.out.format(Locale.US,"3 jizdy: %8.1f%n", tretiJizda );

	}

}
