// Question: what is the output of this program?

public class Question18 {
	public static void main(String[] args) {
		int count = 8;
		ROW_LOOP: for (int row = 1; row <= 3; row++)
			for (int col = 1; col <= 2; col++) {
				if (row * col % 2 == 0) continue ROW_LOOP;
				count++;
			}
		System.out.println(count);
	}
}

// Hint: it is customary to go insane at this point.