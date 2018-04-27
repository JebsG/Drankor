import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class NewPlayerChoices {
	private static MainMenu mainMenu = new MainMenu();
	private static int choiceValidity;
	private static int trollCounter = 0;
	private static Scanner playerInput = new Scanner(System.in);
	private static String playerChoice;

	public static void choiceInterator(){
		dreamDec();
		breakfastDec();
	}

	public static void dreamDec() {
		File decDesc = new File("./TextFiles/DreamDec.txt");

		try {
			Scanner fileScan = new Scanner(decDesc);
			while (fileScan.hasNextLine()) System.out.println(fileScan.nextLine());
		}
		catch (FileNotFoundException fileNotFound) {
			System.out.println("Critical error. File " + decDesc + " not found.");
		}

		System.out.println("\n1. Spiders crawling up to your eye and then burrowing through your pupil.\n2. Unicorns stabbing you with their horns.\n" +
				"3. Your mother melting over your head and dripping on you.\n4. Polka music marathon that you can't escape.");
		while (choiceValidity != 1) {
			playerChoice = playerInput.nextLine();
			switch (playerChoice) {
				case "1":
					System.out.println("Arachnophobia is the most common phobia.\n");
					choiceValidity = 1;
					break;
				case "2":
					System.out.println("You always think you can pet them. Too bad they are not as loving as they look.\n");
					choiceValidity = 1;
					break;
				case "3":
					System.out.println("You didn't necessarily like your mom but it was still a horror scene.\n");
					choiceValidity = 1;
					break;
				case "4":
					System.out.println("Polka... It had to be polka.\n");
					choiceValidity = 1;
					break;
				default:
					if(trollCounter == 0){
						System.out.println("Not a valid choice. If you do it again, you won't get to try again.");
					}
					else if(trollCounter == 1){
						System.out.println("I warned you.\n");
					}
					trollCounter++;
					break;
			}
			if(trollCounter > 1){
				choiceValidity = 1;
			}
		}
		choiceValidity = 0;
	}

	public static void breakfastDec() {
		File decDesc = new File("./TextFiles/BreakfastDec.txt");

		try {
			Scanner fileScan = new Scanner(decDesc);
			while (fileScan.hasNextLine()) System.out.println(fileScan.nextLine());
		}
		catch (FileNotFoundException fileNotFound) {
			System.out.println("Critical error. File " + decDesc + " not found.");
		}
		System.out.println("\n1. The hearts of your enemies, stored in the cabinet.\n2. Cereal... Lucky Charms cereal.\n" +
				"3. Glazed Donut\n4. Strawberry and vanilla yogurt");
		while (choiceValidity != 1) {
			playerChoice = playerInput.nextLine();
			switch (playerChoice) {
				case "1":
					System.out.println("You reach for protein bar labeled 'Hearts of your Enemies' and scarf it down.\n");
					choiceValidity = 1;
					break;
				case "2":
					System.out.println("You reach for the Lucky Charms. Not feeling lucky because you realize you have to eat it without milk.\n");
					choiceValidity = 1;
					break;
				case "3":
					System.out.println("As you reach for the glazed donut your fat rolls tingle. You bite into the fluffy dough sent from the gods.\n");
					choiceValidity = 1;
					break;
				case "4":
					System.out.println("You scoop the yogurt into your mouth, licking the container after you are done. You seem to want more...\n");
					choiceValidity = 1;
					break;
				default:
					if(trollCounter == 0){
						System.out.println("Not a valid choice. If you do it again, you won't get to try again.");
					}
					else if(trollCounter == 1){
						System.out.println("I warned you.\n");
					}
					trollCounter++;
					break;
			}
			if(trollCounter > 1){
				choiceValidity = 1;
			}
		}
		choiceValidity = 0;
	}
}