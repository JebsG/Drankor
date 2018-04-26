import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public class MainMenu{
	private static NewPlayerChoices newPlayerChoices = new NewPlayerChoices();

    private static int playerStats[] = new int[6]; //lvl, exp, hp, armor, mana, attack
    private static String statMessages[] = new String[]{"Level ", "Exp   ", "HP    ", "Armor ", "Mana  ", "Attack"};

    public static void main(String[] args){
        String userString;
        int userInt;

        Scanner userInput = new Scanner(System.in);

        while(true){

            System.out.println("\n1. New Game\n2. Continue\n3. Help\n");

            try {
                userString = userInput.nextLine();
            }
            catch(InputMismatchException e){
                userString = "0";
            }

            switch (userString) {
                case "1":
                    playerSetup();
                    break;
                case "2":
                    System.out.println("Not available. Please only choose the New Game option for now.");
                    break;
                case "3":
                    System.out.println("This is Dankor, a text based game. If there are numbers, " +
                            "enter the number that corresponds with your desired action.\nIf there is a " +
                            "question without numbers, type your response (such as yes or no).");
                    break;
                default:
                    System.out.println("Invalid command. Please only use the numbers 1 and 2 for selections.");
                    break;
            }

            if(userString.equals("1")) break;
            else continue;
        }

        System.out.println("\nPlayer Stats:");
        for(int x=0; x<6; x++) System.out.println(statMessages[x] + "   " + playerStats[x]);
        System.out.println("\nIs this acceptable? (type yes or no)");
        userString = userInput.nextLine();

        switch(userString.toLowerCase()){
            case "yes":
                System.out.println("Good, let's begin...\n");
                break;
            case "no":
                playerStats[0] = 0;
                for(int x=1; x<6; x++) playerStats[x] = playerStats[x]/2;
                System.out.println("Level changed to 0.\nStats decreased by half.");
                System.out.println("\nPlayer Stats:");
                for(int x=0; x<6; x++) System.out.println(statMessages[x] + "   " + playerStats[x]);
                System.out.println("\nDon't be greedy, or you will die.\nLet's begin.\n");
                break;
            default:
                System.out.println("Invalid command. Please restart the game and try reading 'Help'.");
                break;
        }
        userString = "902390814823";
        System.out.print("Enter any key to begin:\n");
        userString = userInput.nextLine();
        if(!"902390814823".equals(userString)){
        	System.out.print("\n");
			newPlayerChoices.dreamDesc();
		}
		else System.out.print("Game closing due to input error.");
    }

    public static void playerSetup(){
        int baseStats[] = {1, 0, 10, 0, 6, 2}; //lvl, exp, hp, armor, mana, attack

        for(int x=0; x<6; x++) playerStats[x] = baseStats[x];
    }
}