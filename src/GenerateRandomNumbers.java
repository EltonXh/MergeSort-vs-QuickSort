import java.io.*;
import java.util.Random;

public class GenerateRandomNumbers {
	public void init(int maxNumbers) {
		
		Random ran = new Random();
	        int number = 0;
	        try (PrintWriter file = new PrintWriter(
	                new BufferedWriter(
	                        new FileWriter("randomNumbers.txt")));
	        ) {

	            for (int i = 1; i <= maxNumbers; i++) {
	                number = ran.nextInt(maxNumbers) + 1;
	                file.println(number);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        System.out.println("File randomNumbers.txt has u krijua me sukses!");
	}
}
