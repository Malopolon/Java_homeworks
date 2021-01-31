package ppa1;
import java.util.*;

/**
 * Program nalezne vsechny lokalni extremy funkce Math.cos(x) + a * Math.cos(b * x + c)
 * @author Vlasenko Artem
 * @version 3.11.2019
 */
public class Ppa1u04a {
	
  public static Scanner sc; 
 /**
  * Vstupni bod programu - scitani vstupnich parametru
  * @param args parametry prikazove radky (nevyuzite)
  *  
  */
  public static void main(String[] args ) {
  sc = new Scanner(System.in);
  sc.useLocale(Locale.US); 
  
   System.out.print("a = " );
   double a = sc.nextDouble();
   System.out.print("b = "); 
   double b = sc.nextDouble();
   System.out.print("c = "); 
   double c = sc.nextDouble();
   System.out.print("x1 = "); 
   double x1 = sc.nextDouble();
   System.out.print("x2 = "); 
   double x2 = sc.nextDouble();
      
     double delta = 1.0 / 1024;
     int min = 0;
     int max = 0;
     
     
     for (  ;x1 <= x2; x1 += delta) {
	       double  funkce = Math.cos(x1) + a * Math.cos(b * x1 + c);
	       double  fMinusDelta = Math.cos(x1 - delta) + a * Math.cos(b * (x1 - delta) + c) ;
	       double  fPlusDleta = Math.cos(x1 + delta) + a * Math.cos(b * (x1 + delta) + c) ;
	       
		      if (( fMinusDelta > funkce) && (funkce < fPlusDleta)) { 
		         min += 1; 
		       }
			  else if (( fMinusDelta < funkce) && (funkce > fPlusDleta)) {  
			     max += 1;  
			  }
     }
     
     System.out.println("min: "+ min );
     System.out.println("max: "+ max );
     
 }
}