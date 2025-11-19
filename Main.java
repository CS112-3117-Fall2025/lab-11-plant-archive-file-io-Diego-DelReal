// TODO: Step 2 - Import file input statements here
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main 
{
	public static void main(String[] args) 
	{
		//TEST FOR STEP 1 (you can delete/comment this out after completing step 1)
		Plant test = new Plant("Stinging Nettle,65,anti-inflammatory and culinary");
		System.out.println("test plant:\n" + test + "\n\n");


		//TODO: Step 2 - Declare + initialize variables for file input here

		String FILE_NAME = "Forage.csv";

		//TODO: Step 2 - Connect input stream to file (dont forget the try/catch!)


		//TODO: Step 2 - create loop to read through whole file


			//TODO: Step 3 - build Plant Objects and store into ArrayList



		//TODO: Step 2 - close the input stream


		//TODO: Step 3 - print contents of ArrayList
		BufferedReader inputStream;
		String[] parts;
		String name, uses, temp;
		double tempF;
		Plant plant;

		temp = null;

		try {
			inputStream = new BufferedReader(new FileReader(FILE_NAME));
			temp = inputStream.readLine();
			inputStream.close();
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("ERROR: File " + FILE_NAME + " not found or could not be opened.");
			System.exit(0);
		}
		catch (IOException ioe) {
			System.out.println("ERROR reading from " + FILE_NAME);
			System.exit(0);
		}

		parts = temp.split(",");
		name = parts[0];
		tempF = Double.parseDouble(parts[1]);
		uses = parts[2];

		plant = new Plant(name, tempF, uses);
		System.out.println("New plant info entered:\n" + plant);


	}
}