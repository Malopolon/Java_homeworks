package ppa1;
import java.util.*;

/**
 * @author Vlasenko Artem
 * 
 */
public class Ppa1u06 {
	
	public static Scanner sc;

    /** Metoda pro oddeleni vstupu od zbytku programu, ktera bude z
     * predaneho scanneru sc nacitat cela cisla 
     * 
     *  return jePrvocislo;
     * @param sc
     * @return
     */
    public static int nactiPrirozeneCislo(Scanner sc) {
        System.out.print(  "Zadej prirozene cislo: ");
        
        int cislo = 0;
        
        while ((cislo = sc.nextInt()) <= 0) { System.out.print( "Zadej prirozene cislo: ");}
        
    return cislo;
    }
	
	/**Metoda, ktera pro dane cislo zjisti,
	 * zda se jedna o prvocislo ci nikoliv
	 * 
	 * @param cislo
	 * @return
	 */
    public static boolean jePrvocislo(int cislo) {
        
    	
        boolean jePrvocislo = false;
        int kolikDel = 0;
        
        for (int var = 1; var <= cislo; var++) { 
        	
        	if (cislo % var == 0) { kolikDel++;}
        }
        
        if (kolikDel == 2) {jePrvocislo = true;}
        
    return jePrvocislo;
    }
    
    /*while (cislo <= n) {
        flag = true;
        for (i = 2; i < cislo; i++) {
            if ((cislo % i) == 0) {
                flag = false;
                break;
            }
    */

    /**Metoda, ktera spocita, zda je mozne cislo predane v parametru
     * vyjadrit jako součet dvou prvocise
     * 
     * @param cislo
     * @return
     */
    public static int jeSoucetPrvocisel(int cislo) {
    	
        for (int x = 0; x <= cislo; x++) {
        	
            for (int z = 0; z <= cislo; z++) {
            	
                if (x + z ==cislo) {
                	//Obe cisla musi byt prvocislami
                    if ((jePrvocislo( x )) && (jePrvocislo( z ))) {return x;}
                }
            }
        }
    return 0;
    }

    
    
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        
        int  priroz = nactiPrirozeneCislo(sc);
        int reseni =jeSoucetPrvocisel (priroz );
        
        if (reseni == 0) {System.out.print("Nelze rozlozit.");}
        
        else { System.out.print("Lze rozlozit: " + reseni + "+" + (priroz -reseni));}
    }
}
