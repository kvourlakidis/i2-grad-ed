// Question: what is the output of this program?

public class Question20 {
	public static void main(String[] args) {
		final char a = 'A', d = 'D';
		char grade = 'B';
		switch(grade) {
			case a:
			case 'B': System.out.print("great");
			case 'C': System.out.print("good"); break;
			case d:
			case 'F': System.out.print("not good");
		}
	}
}

// Answers: []
