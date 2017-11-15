
/**
	Продемонстрировать применение блока кода.
 */
public class BlockTest {
	public static void main(String[] args) {
		int x, y;
		y = 20;
		
		for (x = 0; x < 10; x++) {
			System.out.print("x = " + x);
			System.out.println(" | y = " + y);
			y -=2;
		}
	}
}
