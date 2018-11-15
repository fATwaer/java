package c6;

public class StringCompareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String first = "first string";
		String second = "second string";
		String[] arr = new String[3];
		
		Comparator<String> comp = new LengthCompare();
		System.out.println(comp.compare(first, second));
		System.out.println(comp.compare(first.toCharArray()[1], second.toCharArray()[1]));
		
		
		arr[0] = "123";
		arr[1] = "abc444";
		arr[2] = "00";
	}

}

class LengthCompare implements Comparator<String>
{
	public int compare(String first, String second) {
		return first.length() - second.length();
	}

	public int compare(char c, char d) {
		return c > d ? 1 : 0;
	}
}

