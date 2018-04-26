import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NewPlayerChoices {
	public static void dreamDesc(){
		File desc = new File("./TextFiles/desc.txt");

		try {
			Scanner fileScan = new Scanner(desc);
			while(fileScan.hasNextLine()) System.out.println(fileScan.nextLine());
		}
		catch(FileNotFoundException fileNotFound){
			System.out.println("Critical error. File " + desc + " not found.");
		}
	}
}
