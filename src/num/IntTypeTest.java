package num;

/**
 * Int Type.
 * 32 bit.
 * ot -2147483648 do 2147483647
 */
public class IntTypeTest {
	public static void main(String[] args) {
		int i = 0;
		//int count1 = 2147483648 + 2147483647;
		long count = 2147483648L +5;
		
		for (long j = 0; j < count; i++, j++) {
			if (i > 2147483645 || i < -2147483646) {
				System.out.println("i = " + i);
			}
		}
	}
}
