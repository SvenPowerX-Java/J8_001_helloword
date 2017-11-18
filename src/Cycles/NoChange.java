package Cycles;

/**
 * Переменная цикла в стиле for each доступна только для чтения
 */
public class NoChange {
	public static void main(String[] args) {
		int arrNums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int x :
				arrNums) {
			System.out.print(x + " ");
			x *= 10;
		}
		System.out.println();
		
		for (int x : arrNums)
			System.out.print(x + " ");
		System.out.println();
	}
}
