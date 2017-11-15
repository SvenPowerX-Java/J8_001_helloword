package bool_type;

/**
 * Boolean Type - boolean.
 */
public class BoolTest {
	public static void main(String[] args) {
		boolean b;
		b = false;
		System.out.println("b = " + b);
		b = true;
		System.out.println("b = " + b);
		
		//Значение типа boolean может управлять оператором if
		if (b) {
			System.out.println("Этот код выполнется b = " + b);
		}
		b = false;
		if(!b) System.out.println("Этот код невыполнется b = " + b);
		
		//результат сравнения - значения типа boolean
		System.out.println("10 > 9 равно " + (10>9));
		
	}
}
