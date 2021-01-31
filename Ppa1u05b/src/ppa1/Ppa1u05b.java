package ppa1;
import java.util.*;


/**
 * @author Vlasenko Artem
 *
 */
public class Ppa1u05b {
	
	public static  Scanner sc ;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int c;
		System.out.print("c: ");		
		c = sc.nextInt();
		
		int stepenC = c * c; 
		int stepenA;
		int stepenB;
		String reseni = "";
		int cisloReseni = 0;

		
		for (int b = 1; b < c ; b++ ) {
			for(int a = 1; a < b+1; a++) {
				
				stepenA = a * a;
				stepenB = b * b;
				
				if (stepenA + stepenB == stepenC) {
					
					for(double k = c; k >= 1; k--) {
						
						if((c % k == 0) && (b % k == 0) && (a % k==0)) { 
							
							/**Zkontrolujeme, ze jsou cisla nesoudelna, tj.
							 * existuje cislo, kterym by se vsechna tri cisla mela delit bez zbytku
							 */
							if(k == 1) {
								cisloReseni++;
								reseni = a +"^2+"+ b +"^2="+ c +"^2";
							}
							else {
								break;
							}
						}
					}
				}
			}
		}
		if(cisloReseni!=0) {
			System.out.println(reseni);
		}
		else {
			System.out.println("Reseni neexistuje.");
		}
	}
}

