
package teenpattimaverick;
//import java.util.Scanner;
///**
// *
// * @author : Hrithik Solanki and Jainil Patel
// * @date : 14th August, 2023
// */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeenPattiMaverick {

    public static void main(String[] args) {
    int noOfPlayers;
    int noOfRounds;
    List<String> playerNames = new ArrayList<>(); // Store player names
    
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter No of Players: (Note: At least 2 Players required)");
        noOfPlayers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        if (noOfPlayers < 2) {
            System.out.println("At least 2 Players are required...");
            System.exit(0);
        }

        for (int i = 0; i < noOfPlayers; i++) {
            System.out.print("Enter player " + (i + 1) + "'s name: ");
            String playerName = scanner.nextLine();
            playerNames.add(playerName); // Add player name to the list
        }
        
        System.out.println("Enter No of Rounds: ");
        noOfRounds = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
    }

    GameRules gameRules = new GameRules();
    for (int i = 0; i < noOfRounds; i++) {
        System.out.println("--- STARTING ROUND " + (i + 1) + "---");
        gameRules.playRound(playerNames); // Pass the player names list to playRound method
    }
}
}
