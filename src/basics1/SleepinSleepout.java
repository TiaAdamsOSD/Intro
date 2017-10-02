package basics1;

public class SleepinSleepout {

	public static void main(String[] args) {
		System.out.println(checkIShouldSleepIn(true,false));
	}
	static boolean checkIShouldSleepIn(boolean weekday, boolean vacation) {
		
		if(!weekday || vacation) {
			return true;
		}
		else
			return false;
	}
}
