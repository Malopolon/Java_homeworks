package ppa1;
/**  Komentar vztahujici se k cele tride - vypocet hustoty obrazovych bodu monitoru
 * @author Vlasenko Artem
 * @version 12.10.2019
 */

public class Ppa1u01b {
	/**	
	 * Dokumentacni komentar metody - na zaklade hlavnich parametru obrazovky, vypocet parametru:
	 *  PPI na vysku a na sirku a vypocet horizontalni roztec bodu "pitch"
	 * @param args parametry prikazove radky (nevyuzito)
	 */
	public static void main(String[] args) {
		
		//zakladni parametry obrazovky
		int hSize = 332;
		int vSize = 186;
		int hResolution = 1920;
		int vResolution = 1080;

		//vypocet PPI na vysku a na sirku
		double hPPI = hResolution/(hSize/25.4); 
		double vPPI = vResolution/(vSize/25.4); 
		double rPPI = hPPI/vPPI; 
		
		//vypocet horizontalni roztec bodu (pitch) a velikost obrazku v milimetrech
		double pitch = ((double)(1) / hResolution)*hSize;
		double width = (200 / hPPI)* 25.4; 
		double height = (100/vPPI)*25.4;
		
		/*vypis vsech parametru 
		 */
		System.out.println("hSize [mm] = "+hSize);
		System.out.println("vSize [mm] = "+vSize);
		System.out.println("hResolution [pixels] = "+hResolution);
		System.out.println("vResolution [pixels] = "+vResolution);
		System.out.println("----------------------------");
		System.out.println("hPPI = "+hPPI);
		System.out.println("vPPI = "+vPPI);
		System.out.println("rPPI = "+rPPI);
		System.out.println("pitch [mm] = "+pitch);
		System.out.println("width [mm] = "+width);
		System.out.println("height [mm] = "+height);

	}

}
