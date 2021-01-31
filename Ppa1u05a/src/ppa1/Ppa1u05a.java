package ppa1;
import java.util.*;

 /**
 * @author Vlasenko Artem
 *
 */

public class Ppa1u05a {
 
  public static Scanner sc; 
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc= new Scanner(System.in);
    
    System.out.print("x1: ");
    double x1= sc.nextDouble();
    
    System.out.print("x2: ");
    double x2= sc.nextDouble();
    
    System.out.print("Xs: ");
    double Xs= sc.nextDouble();
    
    System.out.print("y1: ");
    double y1= sc.nextDouble();
    
    System.out.print("y2: ");
    double y2= sc.nextDouble();
    
    System.out.print("Ys: ");
    double Ys = sc.nextDouble();
    
    System.out.print("Ts: ");
    double Ts= sc.nextDouble();
    
    
    double funkce;
    double x;
    double y; 
    double X;
    double Y;
    double F = 1 / Ts; //t
    
    
    System.out.println("x, y, z, t");
    
	for(int i= 0; i < Ts; i++){	
		y = y1;
		
		for(int j=0; j < Ys; j++) {	
			x = x1;
			Y = Math.abs(y1 - y2); // Absolutni hodnota Y
			
			for(int b = 0; b < Xs; b++) {
				
				X = Math.abs(x1-x2); // Absolutni hodnota X 
				
				funkce = Math.sin(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)) - (2 * Math.PI * F * i)); // Z do tabuly
				
				System.out.format("%.6f, %.6f, %.6f, %.6f\n", x , y , funkce , F * i);
				
				x = x+(X / (Xs - 1)); // X do tabuly
			}
			
			x = x1;
			y = y + (Y / (Ys - 1)); // Y do tabuly
		}
		y = y1;
	}
}
}

