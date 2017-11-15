package num;

/**
 * double Type and float Type.
 * float  - 32 bit  ot 1.4e-045 do 3.4e+038
 * double - 64 bit  ot4.9e-324 do 1.8e+308
 * Вычислить площадь круга.
 */
public class Area {
	public static void main(String[] args) {
		double pi, r, a;
		
		r = 10.8; ////количество дней
		pi = 3.1416; //приблизительне значение числа Пи.
		
		a = pi * r * r; //Площадь круга
		
		System.out.println("Площадь круга равна " + a);
	}
}
