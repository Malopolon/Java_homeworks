package ppa1;
import java.util.*; 

/**
 * @author Artem Vlasenko
 * @version 3.11.2019
 */

public class Ppa1u04b {
    /**Vstupni bod programu     
   * @param args parametry prikazove radky   
   */ 
  static Scanner sc;
   

  public static void main(String[] args) {
	  
      sc = new Scanner(System.in);
      Locale.setDefault(Locale.US);
      sc.useLocale(Locale.US);
      
      
      
      double n;
      ArrayList<Double> hodnota  = new ArrayList<Double>();
      do
      {
        n = sc.nextDouble();
        if(n!=0)
          hodnota.add(n);
      }
      
      while(n!=0);
      
      for(int a=0;a<hodnota.size();a++)
      {
        if(a<3)
          System.out.format("\n%d;%.2f;",a+1,hodnota.get(a));
        else
        {
          double WMA=((4*hodnota.get(a)+3*hodnota.get(a-1)+2*hodnota.get(a-2)+hodnota.get(a-3))/(10.0)); // aktualni vazeny klouzavy prumer
          System.out.format("\n%d;%.2f;%.2f",a+1,hodnota.get(a),WMA);
        }
        
      }

    }

  }