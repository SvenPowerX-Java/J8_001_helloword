/*
	Демонстрация цикла For.
 */
public class ForTest {
	public static void main(String[] args) {
		int x;
		int y = 1;
		for (x = 0; x < 10; x++,y++) {
			if (x == 5) System.out.print("x(5) = " + x);
			else System.out.print("x = " + x);
			System.out.println(" | y = " + y);
		}
	}
	
}
