//  Приведение типов

public class Conversion {
	public static void main(String[] args) {
		byte b;
		int i = 257;
		double d = 323.142;
		
		System.out.println("Преобразование типа int d тип byte.");
		b = (byte) i;
		System.out.println("i = " + i);
		System.out.println("b = " + b);
		System.out.println("-------------");
		System.out.println("\n Преобразование double в int.");
		i = (int) d;
		System.out.println("d = " + d);
		System.out.println("i = " + i);
		System.out.println("-------------");
		
		System.out.println("\n Преобразование типа double в byte.");
		b = (byte) d;
		System.out.println("b = " + b);
		System.out.println("b = " + b);
		System.out.println("-------------");
	}
}
