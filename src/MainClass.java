import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.print(
				"Shtyp '1' per te gjeneruar file me numra random\nShtyp '2' per Merge Sort\nShtyp '3' per Quick Sort\n");
		int firstSel = scan.nextInt();

		if (firstSel == 1) {
			System.out.print("Vendos nje numer\n");
			int num = scan.nextInt();
			scan.close();

			GenerateRandomNumbers generateNumbers = new GenerateRandomNumbers();
			generateNumbers.init(num);
		} else if (firstSel == 2) {
			int j = GetNumbrOfLines.countLinesNew("randomNumbers.txt");
			int[] arrayL = FileToArray.toArray(j);
			int arrayLength = arrayL.length - 1;
			int startLength = 0;

			double startTime = System.nanoTime();
			MergeSort.mergeSort(arrayL, startLength, arrayLength);
			double endTime = System.nanoTime();

			// System.out.println(Arrays.toString(arrayL));
			System.out.println("Kohezgjatja e Merge Sort: " + (endTime - startTime) / 1000000 + " ms");
			MainClass.main(args);
		} else if (firstSel == 3) {
			int j = GetNumbrOfLines.countLinesNew("randomNumbers.txt");
			int[] arrayL = FileToArray.toArray(j);
			int arrayLength = arrayL.length - 1;
			int startLength = 0;

			double startTime = System.nanoTime();
			QuickSort.quicksort(arrayL, startLength, arrayLength);
			double endTime = System.nanoTime();

			// System.out.println(Arrays.toString(arrayL));
			System.out.println("Kohezgjatja e Quick Sort: " + (endTime - startTime) / 1000000 + " ms");
			MainClass.main(args);
		} else {
			System.out.print("Ju lutem\n");
			MainClass.main(args);
		}
	}
}
