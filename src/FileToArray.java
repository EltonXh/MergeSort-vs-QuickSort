import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileToArray {
	public static int[] toArray(int len) throws FileNotFoundException {
		int[] result = new int[len];
		int i = 0;

		try (Scanner s = new Scanner(new FileReader("randomNumbers.txt"))) {
			while (s.hasNext()) {				
				int st = Integer.parseInt(s.nextLine().toString());
				result[i] = st;
				i++;
			}
			return result;
		}
	}
}
