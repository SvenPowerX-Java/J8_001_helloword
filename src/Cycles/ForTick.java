package Cycles;

/**
 * For cycle
 */
public class ForTick {
	public static void main(String[] args) {
		int n;
		System.out.println("Цикл с n");
		for (n = 10; n > 0; n--) {
			if (n>1)
			System.out.print("Такт:" + n+", ");
			else System.out.println("Такт:" + n+". ");
		}
		System.out.println("Цикл с i");
		for (int i = 10; i > 0; i--) {
			if (i>1)System.out.print("Такт:" + i + ", ");
			else System.out.println("Такт:" + i+".");
		}
	}
}
