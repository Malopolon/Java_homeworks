package ppa1;
/**
 * Zbran je ve hre urcena svym nazvem a utocnou a obrannou silou. 
 * @author Vlasenko Artem
 *
 */
public class Zbran {
	
	public String nazev;
	public int obrana;    // }vlasntoti zbrane
	public int utok;
	
	private Ruka ruka = null;
	
	/**
	 *Konstruktor vytvori zbran s nazvem a silami.
	 * @param nazev
	 * @param utok
	 * @param obrana
	 */
	public Zbran ( String nazev, int utok, int obrana) {
		
		this.nazev = nazev;
		this.obrana = obrana;
		this.utok = utok;
	}
	
	/**
	 * Getter vrati obrannou silu zbrane. 
	 * @return
	 */
	public int getObrana()   { return obrana;}
	
	
	/**
	 * Getter vrati utocnou  silu zbrane
	 * @return
	 */
	public int getUtok()  { return utok;	}
	
	/**
	 * Vrati informace o zbrani
	 */
	public String toString() { 
		//return nazev +  " (" + utok + "/" +obrana + ")";
		String text =String.format("%s (%d/%d)", nazev,  utok,obrana);	
		
		return text;
		}
	
	/**
	 * V jaky ruce postava ma zbrane
	 * @param ruka
	 */
	public void jakaRuka(Ruka ruka) {
		if (ruka == Ruka.PRAVA) {this.ruka = Ruka.PRAVA;}
		
		else if (ruka == Ruka.LEVA) {this.ruka = Ruka.LEVA;}
	}
}
