package Cycles;

/**
 * Оператор цикла while
 */
public class While {
	public static void main(String[] args) {
		int n = 10;
		int a = 10, b = 20;
		
		while (a>b)
			System.out.println("Эта строка 1 выводится не будет");
		
	/*
	// Вечный цикл
	while (!(a>b))
			System.out.println("Эта строка 2 выводится будет");
		while (a<b)
			System.out.println("Эта строка 3 выводится будет");*/
		
		while (n > 0) {
			System.out.println("такт " + n);
			n--;
		}
	}
}
