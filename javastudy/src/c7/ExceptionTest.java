package c7;

import java.io.*;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = null;
		PrintWriter out = null;
		
		try {
			out = new PrintWriter("out.txt");
			in = new Scanner(new FileInputStream("NotExistFile"), "UTF-8");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("finally block arrived");

			out.println("file not exsist");
			in.close();
			out.close();
		}
	}

}
