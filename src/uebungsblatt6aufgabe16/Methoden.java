package uebungsblatt6aufgabe16;

import java.util.Collection;
import java.util.Iterator;

public class Methoden {
	  public static double doubleValue(Object o) {
	    return ((Double) o).doubleValue();
	  }
	  public static double mittelwert (Collection c) {
		  
		  double summe = 0;
	      Iterator<Double> iter = c.iterator();
	      while (iter.hasNext()) {
	            double s = doubleValue(iter.next());
	            summe += s;
	        } 
	  
		  return (summe / c.size());	  
		  
	} 

}
