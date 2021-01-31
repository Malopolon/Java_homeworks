package ppa1;
import java.util.*;

	/**
	 * Trida se stara o spravne vykresleni sveta a hrace a o nacitani ovladani. 
	 * @author Vlasenko Artem	
	 * @version 18.12.2019
	 */

public class GUI {
	
	    public Scanner sc;
	
		public int sirka;
		public int vyska;
		public int x;
		public int y;
		public char znak;
		public char[][] pole;
		
	    /**Konstruktor pripravi platno o rozmerech sirka x vyska a uchova
	     * si referenci na Scanner.
	     * @param vyska
	     * @param sirka
	     * @param sc
	     * 
	     */
		public GUI (int vyska, int sirka, Scanner sc) {
			
			pole = new char [vyska][sirka];
			
			this.vyska = vyska;
			this.sirka = sirka;
			this.sc = sc;
			
		}
		
		
		
		/** Metoda zapise na platno na pozici [x; y] dany znak. 
		 * @param x
		 * @param y
		 * @param znak
		 */
		public void zapis (int x, int y, char znak) {
			
			pole [x][y] = znak;
		}
		
		
		
		
		/**Metoda vycisti platno, tj. vsechny prvky platna budou mit
		 * hodnotu znak ' ' (mezera)
		 * 
		 */
		public void smaz() {
			
			for (int z = 0; z < vyska; z++) {
				for (int c = 0; c < sirka; c++) {
					pole[z][c] = ' ';
				}
			}
		}
		
		
		
		
		/**Metoda vypise jednotlive znaky platna na System.out. 
		 */
		public void vykresli () {
			
			for ( int z = 0; z < sirka; z++) {
				for (int c = 0; c < vyska; c++) {
					System.out.print( pole[c][z]);
				}
				System.out.println();
			}
		}
		
		
		/**Metoda nacte pomoci Scanneru (parametr konstruktoru)
		 * cele cislo a podle jeho hodnoty vrati odpovidajici smer 
		 * @return
		 */
		public Smer nactiAkci () {
			
			int z = 0; z = sc.nextInt();
			switch(z) {
				
			case 2: return Smer.JIH;
			case 4: return Smer.ZAPAD;
			case 6: return Smer.VYCHOD;
			case 8: return Smer.SEVER;
			
			default:return null;
			}
		}
		
}
