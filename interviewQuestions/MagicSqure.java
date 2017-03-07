package interviewQuestions;

import java.util.ArrayList;
import java.util.Scanner;
public class MagicSqure {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		Scanner scan = new Scanner(System.in);

		int row, col;
		boolean doubleCheck = false;
		boolean check = false;
		int top2ButtomDiagonal = 0;
		int buttom2TopDiagonal = 0;
		int matrix[][];

		System.out.println("enter number of row and column");
		row = scan.nextInt();
		col = scan.nextInt();

		// matrix shoud be square and must be greater than 2*2.
		if (row != col && row < 3) {
			System.out.println("matrix shoud be square and must be greater than 2*2.");
		} else {
			matrix = new int[row][col];
			int sum = 0;
			int num = 0;
			System.out.println("enter the data of your matrix");
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					matrix[i][j] = scan.nextInt();
					arr.add(matrix[i][j]);
				}
				System.out.println();
			}

			// dublicate value check
			for (int i = 0; i < arr.size(); i++) {
				for (int j = i + 1; j < arr.size(); j++) {
					if (arr.get(i) == arr.get(j)) {
						doubleCheck = true;
						break;
					}
				}

			}
			// sum check on each row and column
			if (doubleCheck == false) {
				num = row * row;
				sum = num * (num + 1) / (2 * row);
				for (int i = 0; i < row; i++) {
					int resultSumRow = 0;
					int resultSumCol = 0;
					for (int j = 0; j < col; j++) {
						resultSumRow = resultSumRow + matrix[i][j];
						resultSumCol = resultSumCol + matrix[j][i];
						if (j == i) {
							top2ButtomDiagonal = top2ButtomDiagonal + matrix[i][j];
						}

					}
					if (resultSumRow == sum && resultSumCol == sum) {
						check = true;
					} else {
						check = false;
						break;
					}

				}

				for (int i = 0; i < row; i++) {
					buttom2TopDiagonal = buttom2TopDiagonal + matrix[i][row - 1 - i];
				}

				if (buttom2TopDiagonal == sum && top2ButtomDiagonal == sum) {
					check = true;
				} else {
					check = false;
				}
				// matrix display
				System.out.println("the matrix is :");
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < col; j++) {
						System.out.print("\t" + matrix[i][j]);
					}
					System.out.println();
				}

				// check whether the matrix is magic square or not
				if (check == true) {
					System.out.println("Magic squre");
				} else {
					System.out.println("Not magic squre");
				}
			}
			else {
				System.out.println("dublicate value not allowed.");
			}
		}

	}

}
