package block_and_break;

/**
 * Эта программа содержит ошибку
 */
public class BreakErr {
	public static void main(String[] args) {
		one:
		for (int i = 0; i < 3; i++) {
			System.out.println("Проход " + i + ":");
		}
		for (int j = 0; j < 10; j++) {
//			if (j ==10) break one;//Ошибка
			System.out.print(j + " ");
		}
	}
}
