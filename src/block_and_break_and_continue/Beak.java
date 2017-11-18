package block_and_break_and_continue;

/**
 * Применение оператора break в качестве оператора goto
 */
public class Beak {
	public static void main(String[] args) {
		boolean t = true;
		first: {
			second:{
				third:{
					System.out.println("Предшествует оператору break.");
					if (t) break second;
					System.out.println("Этот оператор небудет выполнятся");
				}
				System.out.println("Этот оператор небудет выполнятся");
			}
			System.out.println("Этот оператор следует за болоком second");
		}
	}
}
