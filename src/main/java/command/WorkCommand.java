package command;

import minigame.TypingGame;
import player.PlayerProfile;
import ui.ResponseManager;

public class WorkCommand implements Command {
    public static final int SALARY = 1000;

    public void execute(PlayerProfile playerProfile) {
        TypingGame game = new TypingGame();
        game.startGame();
        game.outputResult();
        playerProfile.loseHealth(10);
        if (game.getAccuracy() >= 50) {
            assert game.getAccuracy() <= 100 : "Accuracy should not exceed 100";
            int reward = game.getAccuracy() * SALARY / 100;
            int earned = game.isOverTime() ? reward / 2 : reward;
            assert earned >= 0 : "Earned should not be negative";
            playerProfile.addAsset(earned);
            String activityDescription = "Worked and earned $" + earned + " with an accuracy of "
                    + game.getAccuracy() + "%.";
            playerProfile.recordFinancialActivity("Work", activityDescription, earned);

            ResponseManager.indentPrint("You have earned $" + earned + "\n");
        } else {
            ResponseManager.indentPrint("You have failed the typing game and earned nothing.\n");
        }
    }

    public boolean isExit() {
        return false;
    }

    public boolean canGenerateEvent() {
        return true;
    }
}
