/**
 * Операнды типы
 */

public class Promote {
	public static void main(String[] args) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50_000; //нижнее подчеркивание _ разрешено использовать вчисловых литералах
						//Для удобного визуального определениия
						//Например номера телефона 234_23_45 определяетя как 2342345
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c)+" - " + (d * s));
		System.out.println("result = " + result);
		
	}
}
