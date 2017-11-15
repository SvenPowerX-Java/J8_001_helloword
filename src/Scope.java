/**
 * Область видемости(область действия блока кода)
 */

public class Scope {
	public static void main(String[] args) {
		int x; //доступна по всему методу main
		x = 10;
		if (x == 10) {
			int y = 20;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
		}
//		y = 100; //Переменная y недоступна
		System.out.println("x = " + x);
	}
}
