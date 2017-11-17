package arrays;

public class ArrayMyExample {
	public static void main(String[] args) {
		int[] month_days = new int[12];
		for (int i = 0; i < month_days.length; i++) {
			
			System.out.println("month_days[" + i + "] = " + month_days[i]);
		}
		month_days[1] = 1;
		for (int i = 0; i < month_days.length; i++) {
			if (i <= 6) {
				if (i % 2 == 0) month_days[i] = 31;
				else month_days[i] = 30;
				if (i == 1) month_days[i] = 28;
			}else {
				if (i % 2 == 0) month_days[i] = 30;
				else month_days[i] = 31;
			}
			System.out.println("month_days[" + i + "] = " + month_days[i]);
		}
		System.out.println("в Апреле ");
	}
}
