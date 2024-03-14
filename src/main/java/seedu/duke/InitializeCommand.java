package seedu.duke;

import seedu.duke.ui.ResponseManager;
import seedu.duke.userprofile.Profile;

import java.util.Scanner;


public class InitializeCommand {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        ResponseManager.printInitializationMessage();

        String playerName = scanner.nextLine();
        while (playerName.isEmpty()) {
            playerName = Parser.parseCareer(scanner.nextLine());
        }

        ResponseManager.printJobSelectionMessage();
        String jobType = Parser.parseCareer(scanner.nextLine());

        while (jobType.isEmpty()) {
            jobType = Parser.parseCareer(scanner.nextLine());
        }

        Profile profile = new Profile(playerName, jobType);
        System.out.println(getProfile(profile));

        ResponseManager.printWelcomeMessage(profile);

        scanner.close();
    }

    public static String getProfile(Profile profile) {
        return profile.toString();
    }
}
