/*
	оператор if.
 */
public class IfSample {
	public static void main(String[] args) {
		int x, y;
		
		x = 10;
		y = 20;
		
		if (x < y) {
			System.out.println("y меньше y ");
		}
		x*=2;
		if (x == y) {
			System.out.println("Теперь x = y ");
		}
		x += 5;
		if (x>y) {
			System.out.println("Сейчас x > y ");
		}
		
	}
}
