package basics1;

public class CheckMarks {

	public static void main(String[] args) {
		gradeStudent(69);

	}

	// TODO Auto-generated method stub
	static void gradeStudent(int score) {
		if (score >= 50 && score <= 60) {
			System.out.println("Grade D");
		}
//if studentScore is 60-70 print grade C
		else if (score > 60 && score <= 70) {
			System.out.println("Grade C");
		} else if (score > 70 && score < 80) {
			System.out.println("Grade B");
		} else if (score > 80 && score < 100) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("Fail");
		}
	}
}
