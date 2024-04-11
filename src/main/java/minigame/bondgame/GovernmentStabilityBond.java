package minigame.bondgame;

import player.PlayerProfile;
import ui.ResponseManager;

public class GovernmentStabilityBond implements Bond {
    private static final String BOND_INFORMATION =
            "The Government Stability Bond is considered a secure investment, \n" +
                    "with fixed interest payouts and a guaranteed return of principal at maturity. \n" +
                    "This bond is favored by investors seeking stability and low risk. \n";
    private static final String NAME = "Government Stability Bond";
    private static final String HIDDEN_INFO =
            "Recent economic trends suggest that the bond market may see a reduction in volatility.";
    private static final int PRICE = 1000;
    private static final int INTEREST_RATE = 3;
    private static final int MATURITY = 5;

    @Override
    public void printInfo(PlayerProfile playerProfile) {
        ResponseManager.indentPrint(BOND_INFORMATION + "\n"
        + "Bond Name: " + NAME + "\n"
        + "Price per bond unit: " + PRICE + "\n"
        + "Annual Interest Rate (%): " + INTEREST_RATE + "\n"
        +"Maturity (years): " + MATURITY + "\n");

        // Display hidden information based on player's occupation
        if (playerProfile.getOccupation().equals("Economist")) {
            ResponseManager.indentPrint(HIDDEN_INFO);
        }
    }

    @Override
    public int calculateInterest(int amountInvested) {
        return (int) (amountInvested * INTEREST_RATE / 100.0);
    }

    @Override
    public String returnBondName() {
        return NAME;
    }

    @Override
    public int returnBondPrice() {
        return PRICE;
    }

    @Override
    public int returnBondInterestRate() {
        return INTEREST_RATE;
    }

    @Override
    public int returnBondMaturity() {
        return MATURITY;
    }
}
