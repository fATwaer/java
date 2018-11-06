package c2;
import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class FileReading {

	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(Paths.get("/home/moonlight/java/javastudy/src/c2/myfile.txt"), "UTF-8");
		PrintWriter out = new PrintWriter("/home/moonlight/java/javastudy/src/c2/outfile", "UTF-8");
		
		String str = in.nextLine();
		System.out.println("read from file:");
		System.out.println(str);
		
		
		System.out.println("write to file 'outfile'");
		out.println(str);
		out.flush();
	}

}
