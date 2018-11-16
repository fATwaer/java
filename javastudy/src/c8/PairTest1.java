package c8;

public class PairTest1 {

	public static void main(String[] args) {
		String[] words = {"Mary", "had", "a", "little", "lamb"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println("min = "+mm.getFisrt());
		System.out.println("max = "+mm.getSecond());
	}

}

//class ArrayAlg
//{
//	public static Pair<String>  minmax(String[] a) {
//		if (a == null || a.length == 0)
//			return null;
//		String min = a[0];
//		String max = a[0];
//		
//		for (int i = 1; i < a.length; i++)
//		{
//			if (min.compareTo(a[i]) > 0)
//				min = a[i];
//			if (max.compareTo(a[i]) < 0)
//				max = a[i];
//		}
//		return new Pair<String>(min, max);
//	}
//}

class Pair<T>
{
	private T first;
	private T second;
	
	public Pair() { 
		first = null; 
		second = null;
	}
	
	public Pair(T f, T s) {
		first = f;
		second = s;
	}
	
	
	public T getFisrt() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}
	
	public void setFirst(T n) {
		first = n;
	}
	
	public void setSecond(T n) {
		second = n;
	}
}