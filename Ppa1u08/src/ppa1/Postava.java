package ppa1;

	/**Vytvori postavu a nastavi jeji vychozi pozici na [startX;startY]
	 * a pozici cile na [domovX; domovY]. 
	 * @author Vlasenko Artem	
	 *	@version 18.12.2019
	 */
public class Postava {
	
	public Svet svet;
	
	public int startX;
	public int startY;
	
	public int domovX;
	public int domovY;
	
	
	/**
	 * 
	 * @param svet
	 * @param starX
	 * @param startY
	 * @param domovX
	 * @param domovY
	 */
	public Postava (Svet svet, int startX, int startY, int domovX, int domovY) {
		
		this.startX = startX;
		this.startY = startY;
		
		this.domovX = domovX;
		this.domovY = domovY;
		
		this.svet = svet;
		
	}
	
	/**
	 * Pokusi se posunout postavu v danem smeru. 
	 * @param smer
	 * @return
	 */
	public boolean jdi(Smer smer) {
		
		    if (Smer.ZAPAD == smer) {
			
			
			    if (svet.uzemi (startX - 1, startY) == ' ') {
				startX -= 1;
				return true;
			    }
			
			    else { return false;}
		    }
			
			
			if (Smer.VYCHOD == smer) {
				 
				if(svet.uzemi (startX + 1, startY) == ' ') { 
				startX +=1; 
			    return true;
			    }
			
			    else { return false;}	
			}
				
				
			if (Smer.SEVER == smer) {
				
				if(svet.uzemi ( startX, startY -1) == ' ') {
					startY -=1;
					return true;
				}
				
				else { return false;}
			}	
				
			if  (Smer.JIH == smer) {
				if (svet.uzemi (startX, startY + 1)== ' ') {
					startY += 1;
					return true;
				}
				
				else {return false;}
			}
			
			else {return false;}
	}
				
	
	
	
	/**
	 * Metoda vrati hodnotu true pokud se postava nachazi na
	 * stejnem miste, jako je jeji cil. 
	 * @return
	 */
	public boolean jeDoma() {
		
		if (startX == domovX && startY == domovY) {
			return true;
		}
		
		else { return false;}
	}
	
	
	/**
	 * Pomoci metody gui.zapis(x, y, znak) vykresli na
	 * platno znak '@' na aktualni pozici postavy v mape a znak '^'
	 * na pozici cile. 
	 * @param gui
	 */
	public void vykresli (GUI gui) {
		
		gui.zapis(domovX, domovY, '^');
		gui.zapis(startX, startY, '@');
	}
	
}
