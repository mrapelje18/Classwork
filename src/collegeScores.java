import java.util.*;

public class collegeScores {
	public static void main(String[] args) {
		Scanner scores = new Scanner(System.in);
		System.out.print("What is the GPA of student 1? ");
		double GPA1 = scores.nextDouble();
		System.out.print("What is the SAT score of student 1? ");
		int SAT1 = scores.nextInt();
		System.out.print("What is the ACT score of student 1? ");
		int ACT1 = scores.nextInt();
		System.out.print("What is the GPA of student 2? ");
		double GPA2 = scores.nextDouble();
		System.out.print("What is the SAT score of student 2? ");
		int SAT2 = scores.nextInt();
		System.out.print("What is the ACT score of student 2? ");
		int ACT2 = scores.nextInt();
		if ((GPA1 + SAT1 + ACT1) > (GPA2 + SAT2 + ACT2)) {
			System.out.print("Student 1 is a better candidate.");
		} else if ((GPA1 + SAT1 + ACT1) < (GPA2 + SAT2 + ACT2)) {
			System.out.print("Student 2 is a better candidate.");
		} else {
			System.out.print("Both are good candidates.");
		}
		scores.close();
	}
}
