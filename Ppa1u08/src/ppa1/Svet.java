package ppa1;
/**
 * Trida reprezentuje svet
 * @author Vlasenko Artem
 *
 */

public class Svet {
		
	public int vyska;
	public int sirka;
	public char[][] svet;
	public char [] data;
	
	public char [] mapa = new char [] { 
			
			
								 '#','#','#','#','#','#','#',
								 '#',' ','#',' ',' ',' ','#',
								 '#',' ','#',' ',' ',' ','#',
								 '#',' ',' ',' ','#',' ','#',
								 '#','#','#','#','#','#','#',
	                                      	};
	
	
	
	
	/**
	 * Konstruktor vytvori reprezentaci sveta o dana sirce a vysce. 
	 * @param sirka
	 * @param vyska
	 * @param data
	 */
	public  Svet ( int sirka, int vyska, char [] data) {
		
		this.data = mapa;
		this.sirka = sirka;
		this.vyska = vyska;
		
		svet = new char [sirka][vyska];
		
		int q = 0;
		int w = 0;
		int e = 0;
		
		while  (vyska > q) {
			
				while (sirka > w) {
					
					svet[w][q] = data [e];
					e++;
					w++;
				}
				q++;
				w = 0;
		}
	}

	/**
	 * Pomoci metody gui.zapis(x, y, znak) vykresli na
	 * platno mapu
	 * @param gui
	 */
	public void vykresli (GUI gui) {
		
		for ( int z = 0; z < vyska; z++) {
			for (int e = 0; e < sirka; e++) {
				gui.zapis(e, z, svet[e][z]);
			}
		}
	}
	
	
	
	/**
	 * Metoda vrati typ uzemi (znak), ktery se nachazi na pozici [x; y]. 
	 * @param x
	 * @param y
	 * @return
	 */
    public char uzemi (int x, int y) {
		
		try {
			return svet [x][y]; // vrati hodnotu mapy pri chybe
		}
		
		catch (Exception e) {
			return 0;
		}
		
	}
	
}
