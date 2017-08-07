package uebungsblatt6aufgabe16;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Mittelwerthaupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Double> x = new ArrayList<Double>();
		x.add(4.0);
		x.add(8.0);
		x.add(15.0);
		x.add(2.0);
		x.add(22.0);
		x.add(45.0);
		x.add(12.0);
		x.add(1.0);
		x.add(7.0);
		
		System.out.println(Methoden.mittelwert(x));
		
	}

}
