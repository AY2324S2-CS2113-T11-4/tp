package seedu.duke;

import seedu.duke.ui.ResponseManager;
import seedu.duke.userprofile.Profile;
import seedu.duke.tictactoe.TicTacToe;

import java.util.Scanner;


public class InitializeCommand {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ResponseManager.printInitializationMessage();

        String playerName = scanner.nextLine();
        while (playerName.isEmpty()) {
            playerName = Parser.parseName(scanner.nextLine());
        }

        ResponseManager.printJobSelectionMessage();
        String jobType = Parser.parseCareer(scanner.nextLine());

        while (jobType.isEmpty()) {
            jobType = Parser.parseCareer(scanner.nextLine());
        }

        Profile profile = new Profile(playerName, jobType);
        System.out.println(getProfile(profile));

        ResponseManager.printWelcomeMessage(profile);

        TicTacToe game = new TicTacToe('X');
        game.gameStart();

        scanner.close();
    }

    public static String getProfile(Profile profile) {
        return profile.toString();
    }
}