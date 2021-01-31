package ppa1;
import java.util.*;

/**
 * @author Vlasenko Artem
 *
 */

public class Ppa1u03b {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Zadej cas odjezdu z mista A do mista B: ");
		System.out.print("hodina: ");
		int hodinaA = sc.nextInt();
		System.out.print("minuta: "); 
		int minutaA = sc.nextInt();
		
		System.out.println("Zadej dobu prejezda z mista A do mista B: ");
		System.out.print("hodina: "); 
		int hodinaPriezdB = sc.nextInt();
		System.out.print("minuta: "); 
		int minutaPriezdB = sc.nextInt();
		
		System.out.println("Zadej cas odjezdu z mista B do mista C: ");
		System.out.print("hodina: "); 
		int hodinaOdezdB = sc.nextInt();
		System.out.print("minuta: "); 
		int minutaOdezdB = sc.nextInt();
		
		System.out.println("Zadej dobu prejezda z mista B do mista C: ");
		System.out.print("hodina: "); 
		int hodinaPriezdC = sc.nextInt();
		System.out.print("minuta: ");
		int minutaPriezdC = sc.nextInt();
		
		int cestaHodiny = hodinaA + hodinaPriezdB; // cas v ceste
		int cestaMinuty = minutaPriezdB + minutaA; 
		int cekaniHoduny = 0; // cas cekani ve meste B 
		int cekaniMinuty = 0; 
		
		
		if(cestaMinuty>=60) {
			
			cestaHodiny++;

			if(cestaHodiny>=24) {
				
				cestaHodiny = cestaHodiny - 24;
			}
			cestaMinuty = cestaMinuty - 60;
		}
		
		if ((cestaMinuty > minutaOdezdB) && (cestaHodiny >= hodinaOdezdB)){
			
			System.out.println("Cesta: spoje nelze pouzit");
		}
		else {
			if(cestaHodiny > hodinaOdezdB) {
				
				cekaniHoduny = 24 - cestaHodiny + hodinaOdezdB; // Estli cesta probehla pres pulnoci
			}
			
			else if(cestaHodiny < hodinaOdezdB) { 
				
				cekaniHoduny = hodinaOdezdB - cestaHodiny;
			}
	
			if (cestaMinuty > minutaOdezdB) {
				
				cekaniMinuty = 60 - cestaMinuty + minutaOdezdB; 
			}
			
			else if(minutaOdezdB > cestaMinuty) {

				cekaniMinuty = minutaOdezdB - cestaMinuty;
			}
			
			cestaHodiny = hodinaPriezdB + cekaniHoduny;
			minutaPriezdB = minutaPriezdB + cekaniMinuty;
			
			if(cestaMinuty >= 60) {    // estli minut bylo vice nez 60   --- to hodiny + 1
				
				cestaHodiny++;
				cestaMinuty = cestaMinuty - 60;
			}

            // cas cesty pred odjezdem do mesta C
			cestaHodiny = hodinaPriezdC + cestaHodiny;
			
			cestaMinuty = minutaPriezdC + cestaMinuty;
			
			int  hodiny;
			int  minuty;
			
			hodiny = cestaHodiny;
			minuty = cestaMinuty;
			
			if(minuty>=60){
				
				minuty = minuty - 60;
				hodiny++;
			}
			if(hodiny <= 12){
				
				if(minuty < 10){ // estli minut mene nez 10 , aby ne dostavat napriklad 3.4  (3 hodiny 4 minuty)
					System.out.format("Cesta: %d:0%d\n",hodiny,minuty);
	               // System.out.println("Cesta: " + hodiny + ":" + minuty);
				}
				else{
					
					System.out.format("Cesta: %d:%d\n",hodiny,minuty);
				}

			}
			else{
				//Pokud cesta trva dele nez 12 hodin
				System.out.println("Cesta: spoje nelze pouzit");
			}
		}
	}	
}