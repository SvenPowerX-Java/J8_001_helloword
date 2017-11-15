package num;

/**
 * Long Type - 64 bit.
 * Литерал дополняется буквой L.  long lnum = 99999999999L.
 * Программа вычисляет количество миль,
 * проходимых лучом света за указанное число дней.
 */

//  Вычислить растояние, проходимое свеом,
//используя переменные типа long
public class LongTypeTest {
	
	
	public static void main(String[] args) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		// приблизительная скорость света, миль в секунду
		lightspeed = 186000;
		
		//количество дней
		days = 1000;
		
		// преобразовать в секунды
		seconds  = days * 24 * 60 * 60;
		
		distance = lightspeed * seconds; //Вычислить растояние
		
		System.out.print("За " + days);
		System.out.print(" дней свет пройдёт около ");
		System.out.println(distance + " миль.");
	}
}
