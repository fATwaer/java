package c6;

import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] plants = new String[] {"Mercury", "Venus", "Earth", "Mars", "Jupiter"};
		
		System.out.println(Arrays.toString(plants));
		System.out.println("Sorted in dictionary order: ");
		Arrays.sort(plants);
		System.out.println(Arrays.toString(plants));
		System.out.println("Sorted by length: ");
		Arrays.sort(plants, (first, second)->first.length() - second.length());
		System.out.println(Arrays.toString(plants));
		
		Timer t = new Timer(1000, event->
			System.out.println("The time is "+ new Date()));
		
		t.start();
		JOptionPane.showMessageDialog(null, "Quit Program?");
		System.exit(0);
	}

}
