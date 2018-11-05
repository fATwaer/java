package javastudy;

public class StringTest {

	public static void main(String[] args) {
		String greeting = "Hello";
		int n = greeting.length();
		
		int cpCount = greeting.codePointCount(0, greeting.length());
		
		char first = greeting.charAt(0);
		char last = greeting.charAt(4);
		
		System.out.println(first);
		System.out.println(last);
		System.out.println(cpCount);
		
	}

}
