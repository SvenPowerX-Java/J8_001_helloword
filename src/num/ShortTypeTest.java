package num;

/**
 * Type Short.
 * 16 bit
 * диапазон от -32768 до 32767
 */
public class ShortTypeTest {
	public static void main(String[] args) {
		short s = 0;
		//short t = 65535 ;   //Ошибка!
		int t = 65537 ;
		for (int i = 0; i < t; i++, s++) {
			if (s > 32765 || s < -32766) {
				System.out.println("s = " + s);
			}
		}
		
	}
}
