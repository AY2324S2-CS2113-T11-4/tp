package ui;

import player.PlayerProfile;

public class ResponseManager {
    private static final String INITIALIZATION_MESSAGE = "Initializing...\n"
        + "Enter your name: \n";
    private static final String INDENTATION =
            "===".repeat(10) + "\n";
    private static final String JOB_SELECT_MSG = "Choose your job type: \n" +
            "for Robotics, enter '/r'\n" +
            "for Semiconductor industry, enter '/s'\n" +
            "for Artificial intelligence, enter '/a'\n";
    private static final String BYE_MSG = "Bye bye adventurer!";

    public static void printBoard(String boardInfor) {
        System.out.println(INDENTATION + boardInfor + INDENTATION);
    }

    public static void indentPrint(String message) {
        System.out.println(INDENTATION + message + INDENTATION);
    }

    public static void printGameInit() {
        indentPrint(INITIALIZATION_MESSAGE);
    }

    public static void printJobSelect() {
        indentPrint(JOB_SELECT_MSG);
    }

    public static void printWelcome(PlayerProfile playerProfile) {
        System.out.println("Welcome, " + playerProfile.toString());
    }

    public static void echoChosenIndustry(String input) {
        System.out.println("You have chosen " + input);
    }

    public static void printGoodbye() {
        System.out.println(BYE_MSG);
    }
}