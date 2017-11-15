/**
 * Скомпилировать эту программу нельзя
 */

public class ScopeError {
	public static void main(String[] args) {
		int bar = 1;
		{
//			int bar = 2;    //Так сделать неполучится(Ошибка компиляции переменная определена)
		}
	}
}
