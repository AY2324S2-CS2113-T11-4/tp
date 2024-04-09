package command;

import exception.GameException;
import player.PlayerProfile;
import ui.ResponseManager;

public class AdjustSalaryCommand implements Command {
    private static final int ADJUSTMENT_LIMIT = 800;
    private final String updateType;
    private int amount;

    public AdjustSalaryCommand(String updateType, int amount) {
        this.updateType = updateType;
        this.amount = amount;
    }

    @Override
    public void execute(PlayerProfile playerProfile) throws GameException {
        if (Math.abs(amount) > playerProfile.getEmployeeSalary()) {
            throw new GameException("Extent of salary adjustment cannot be more than the employee's current salary.\n");
        }

        if (updateType.equals("lower")) {
            if (amount > playerProfile.getEmployeeSalary()) {
                throw new GameException("Extent of lowering salary cannot be more than the employee's salary.\n");
            }
            amount = -amount;
            ResponseManager.indentPrint("You have successfully lowered the salary by $" + (-amount) + ".\n");
            playerProfile.recordFinancialActivity("Salary Adjustment", "Lowered salary by $"
                    + (-amount), amount);
        } else {
            if (amount > ADJUSTMENT_LIMIT) {
                throw new GameException("Extent of rising salary cannot be more than $" + ADJUSTMENT_LIMIT + ".\n");
            }
            ResponseManager.indentPrint("You have successfully raised the salary by $" + amount + ".\n");
            playerProfile.recordFinancialActivity("Salary Adjustment", "Raised salary by $"
                    + amount, amount);
        }
        playerProfile.updateSalary(amount);
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public boolean canGenerateEvent() {
        return true;
    }
}
