package Cycles;

/**
 * do-while
 */
public class DoWhile {
	public static void main(String[] args) {
		int n = 10;
		int n2 = 10;
		do {
			System.out.print("такт " + n + ", ");
			n--;
		} while (n > 0);
		System.out.println(".");
		//Второй вариант
		do {
			System.out.print("takt " + n2 +", ");
		} while (--n2 > 0);
		System.out.println(".");
	}
}
