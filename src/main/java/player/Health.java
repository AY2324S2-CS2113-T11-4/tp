package player;

import static ui.ResponseManager.indentPrint;
import static ui.ResponseManager.RED;
import static ui.ResponseManager.GREEN;
import static ui.ResponseManager.RESET;

public class Health {
    private int healthAmount;

    public Health() {
        this.healthAmount = 100;
    }

    public Health(int healthAmount) {
        this.healthAmount = healthAmount;
    }

    public void addHealth(int amount) {
        healthAmount += amount;
        if (healthAmount > 100) {
            healthAmount = 100;
            indentPrint(GREEN + "Health is full!\n" + RESET +
                    "Your health is now 100!\n");
        }
        indentPrint("Your have gained " + amount + " health.\n" +
                "Your current health is: " + healthAmount + "\n");
    }

    public void setHealth(int amount) {
        healthAmount = amount;
    }

    public void deductHealth(int amount) {
        if (healthAmount - amount < 0) {
            healthAmount = 0;
            return;
        }
        healthAmount -= amount;
        if (!isHealthy()) {
            indentPrint(RED + "Your health is below 50!\n" + RESET +
                    "Please take care of yourself!\n");
        }
        indentPrint("Your have lost " + amount + " health.\n" +
                "Your current health is: " + healthAmount + "\n");
    }

    public boolean isHealthy() {
        return healthAmount >= 50;
    }

    public int outputHealth() {
        return healthAmount;
    }

    public String toString() {
        int totalBar = 10;
        int bar = totalBar * healthAmount / 100;
        String healthBar = "#".repeat(bar) +
                " ".repeat(totalBar - bar);
        String color = healthAmount >= 30 ? GREEN : RED;

        return "|" + color + healthBar + RESET +"|" + " " + healthAmount + "/100";
    }
}
