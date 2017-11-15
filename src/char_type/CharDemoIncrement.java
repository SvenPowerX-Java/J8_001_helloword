package char_type;

/**
 * Символьные переменные ведут себя как целочисленные значения
 */
public class CharDemoIncrement {
	public static void main(String[] args) {
		char ch1 = 'X';
		System.out.println("ch1 = " + ch1);
		
		ch1++;
		System.out.println("ch1 = " + ch1);
	}
}
