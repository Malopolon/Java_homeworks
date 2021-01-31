package ppa1;
import java.util.*; //importuje Scanner

/**
 * @author Vlasenko Artem
 * 
 */ 

public class Ppa1u03a {

  /**Vstupni bod programu     

   * @param args parametry prikazove radky (nevyuzite)   
   */   
	
	
  public static void main(String[] args) {
	  
	final double Epsilon = 0.00001;
    
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    sc.useLocale(Locale.US);
    
    System.out.format("Zadej koeficient a: ");
    double a = sc.nextDouble();
    
    System.out.format("Zadej koeficient b: ");
    double b = sc.nextDouble();
    
    System.out.format("Zadej koeficient c: ");
    double c = sc.nextDouble();
    
    System.out.format("Zadej pocatek intervalu x1: ");
    double x1 = sc.nextDouble();
    
    System.out.format("Zadej konec intervalu x2: ");
    double x2 = sc.nextDouble();
    
	double D = (b * b) - 4*a*c;
	
	System.out.print("reseni: ");
	
	if ( Math.abs(D - 0) < Epsilon ) {
		double x=-b /(2 * a);
		if (x > x1 && x < x2)
		{
			System.out.print("existuje jedno");
		}
		else {
			System.out.print("neexistuje");
		}
	}
	else {
		
		double prvniReseni = ( -b - Math.sqrt(D) ) / (2 * a);
		double druheReseni = ( -b + Math.sqrt(D) ) / (2 * a);
		
		if (prvniReseni> x1 && prvniReseni< x2 && druheReseni >x1 && druheReseni < x2) //Overeni dvou seseni
		{
			System.out.println("existuji dve");
		}
		else if((prvniReseni > x1 && prvniReseni< x2) && (druheReseni < x1 || druheReseni < x2)) { // Kontrola jednoho reseni
		
			System.out.println("existuje jedno");
		}
		else if((x1 > prvniReseni || x2 < prvniReseni ) && ( druheReseni > x1 && druheReseni < x2)) {  // Kontrola jednoho reseni
		
			System.out.println("existuje jedno");
		}
		else {
			System.out.println("neexistuje"); // V tomto intervalu neexistuji zadna reseni
		}
	}
}
}
