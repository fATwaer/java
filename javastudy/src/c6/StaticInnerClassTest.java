package c6;

public class StaticInnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d[] = {10, 23, 231.1, 123.6, 0, -1.1};
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		System.out.println("min= "+p.getFirst());
		System.out.println("max= "+p.getSecond());
	}

}




class ArrayAlg {
	
	public static Pair minmax(double[] values) {
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		for (double v : values) {
			if (min > v) min = v;
			if (max < v) max = v; 
		}
		return new Pair(min, max);
	}
	
	public static class Pair {
		private double first;
		private double second;
		
		public Pair(double f, double s) {
			first = f;
			second = s;
		}
		
		public double getFirst() { return first; }
		public double getSecond() { return second; }
	}
}



