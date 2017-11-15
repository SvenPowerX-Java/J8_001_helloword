package num;

/**
 * Type Byte.
 * Диапазон допустимых значений от -128 до 127
 */
public class ByteTypeTest {
	public static void main(String[] args) {
		
		//byte b = 129, c; //Ошибка
			byte b = 0;
			
		for (int c = 0; c < 256; b++, c++) {
			if (b >125 || b < -125) {
				System.out.println("b = " + b);
			}
		}
		
	}
}
