import java.util.Scanner;

/**
 * @author Serhiy Bardysh
 *
 */
public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String choice2 = "y";
		System.out.println("Welcome to Rock Paper Scissors!");
		System.out.println();

		System.out.println("Enter your name: ");

		String userName = scnr.nextLine();

		System.out.println("Please select an opponent (Rock or Random): ");

		String userOpp = scnr.nextLine();
		
		while (choice2.equalsIgnoreCase("y")) {
					
		System.out.println("Select: Rock, Paper, Scissors");

		// TODO Replace with enums later!!!!
		String choice = scnr.nextLine();

		int iChoice = 0;

		switch (choice) {
		case "Rock":
			iChoice = 1;
			break;
		case "Paper":
			iChoice = 2;
			break;
		case "Scissors":
			iChoice = 3;
			break;

		default:
			break;
		}

		// TODO
		System.out.println("Your choice: " + choice);

		Player humanPlayer = new HumanPlayer(userName, iChoice);
		// humanPlayer.setName(userName);
		// humanPlayer.setRoshembo(iChoice);
		// humanPlayer.generateRoshambo();

		Player opponentPlayer = null;
		if (userOpp.equalsIgnoreCase("Rock")) {
			opponentPlayer = new RockPlayer("Rock");

		} else if (userOpp.equalsIgnoreCase("Random")) {
			opponentPlayer = new RandomPlayer("Random");
		}
		
				getResults(humanPlayer, opponentPlayer);
				
				System.out.println("Would you like play another game? y/n: ");
				choice2 = scnr.nextLine();
		}
		System.out.println("The end!!!");
		
				scnr.close();
	}

	private static void getResults(Player humanPlayer, Player opponentPlayer) {
			int roshNum = opponentPlayer.generateRoshambo();
			int humNum = humanPlayer.getRoshembo();
			
			System.out.println("Opponent choice: " + roshResults(roshNum) + "\n" + "Opponent name: " + opponentPlayer.getName());

		if (humNum == roshNum) {
			System.out.println("Tie!!!");
		} else if (humNum == 1 && roshNum == 2) {
			System.out.println(opponentPlayer.getName() + " Win!!!");
		} else if (humNum == 1 && roshNum == 3) {
			System.out.println(humanPlayer.getName() + " Win!!!");
		} else if (humNum == 2 && roshNum == 1) {
			System.out.println(humanPlayer.getName() + " Win!!!");
		} else if (humNum == 2 && roshNum == 3) {
			System.out.println(opponentPlayer.getName() + " Win!!!");
		} else if (humNum == 3 && roshNum == 1) {
			System.out.println(opponentPlayer.getName() + " Win!!!");
		} else if (humNum == 3 && roshNum == 2) {
			System.out.println(humanPlayer.getName() + " Win!!!");
		}
	}
	public static String roshResults( int roshNum ) {
		String roshResult = null;
		
		switch (roshNum) {
		case 1:
		roshResult = "Rock";
			break;
		case 2:
		roshResult = "Paper";
		break;
		case 3: 
		roshResult = "Scissors";
		break;
		default:
			break;
		}
		return roshResult;
	}
}
