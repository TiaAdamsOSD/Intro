package basics1;

public class CalculateAverage {

	public static void main(String[] args) {
		int[] numberList = {1, 2, 3, 4,};
		
		int sum = 0;
				for (int number : numberList) {
					sum = sum + number;
					
				}
				
				int average = sum / numberList.length;
		System.out.println("The average of all elements is " + average);
		
	}

}
