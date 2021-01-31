/**
 * Komentar vztahujici se k cele tride - vypocitani povrchu "s" a  soucetu delek vsech hran "d"
 * @author Vlasenko Atem
 * @version 219-10-09
*/
public class Ppa1u01a {
	/**	
	 * Dokumentacni komentar metody - vypocet povrcu a souctu delek hran kvadru
	 * @param args parametry prikazove radky (nevyuzito)
	 */
	public static void main (String[] args) { 
		//strany kvadru a,b,c 
		int a = 23;
		int b = 34;
		int c = 18;
		
		int s = 2*(a*b+b*c+a*c);  //tady je pocitan povrch kvadru
		int d = 4*(a + b + c);    // tady je pocitan soucet delek vsech hran kvadru

		/*vypis delek jednotlivych stran, 
		povrchu a souctu delek vsech hran kvadru
		*/
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("-------");
		System.out.println("s = "+s);
		System.out.println("d = "+d);
	}
}