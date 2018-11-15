package c6;

public class RepeatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		repeat(10, i->System.out.println("Countdown: "+(9-i)));
	}
	public static void repeat(int n, IntConsumer action) {
		for (int i = 0; i < n; i++)
			action.accept(i);
	}
//	@Override
//	public void accept(int value) {
//		// TODO Auto-generated method stub
//		
//	}
}
