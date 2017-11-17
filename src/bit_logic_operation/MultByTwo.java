package bit_logic_operation;

/**
 * Применение сдвига в лево в качестве быстрого способаумножения на 2
 */
public class MultByTwo {
	public static void main(String[] args) {
		int i;
		int num = 0xFFFFFFE;
		for (i=0; i<4;i++) {
			num <<= 1;
			System.out.println("num = " + num);
		}
	}
}
