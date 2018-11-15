package c6;

import java.util.Arrays;
import java.util.Date;

public class DateInnerClassTest {
	public static void main(String[] args) {
		int[] counter = new int[1];
		counter[0] = 0;
		Date[] dates = new Date[100];
		for (int i = 0; i < dates.length; i++)
			dates[i] = new Date() 
				{
					public int compareTo(Date other) {
						counter[0]++;
						return super.compareTo(other);
					}
				};
		Arrays.sort(dates);
		System.out.println(counter[0]+" comparisons");
	}
}
