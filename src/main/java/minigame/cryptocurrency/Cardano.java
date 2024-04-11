package minigame.cryptocurrency;

import player.PlayerProfile;
import ui.ResponseManager;
import java.util.Random;

public class Cardano implements CryptoCurrency {
    private static final String CRYPTO_INFORMATION =
            "Cardano is a blockchain platform for change makers, innovators, and visionaries, \n" +
                    "offering tools and technologies required to create possibility for the many, \n" +
                    "as well as the few, and bring about positive global change. \n" +
                    "It provides return to you every round, but it might be listed as illegal items. \n";
    private static final int RISK_FACTOR = 19;
    private static final String NAME = "Cardano";
    private static final String HIDDEN_INFO =
            "With its unique dual-layer architecture and focus on sustainability, scalability, and transparency, \n" +
                    "Cardano is positioned to overcome common blockchain challenges \n" +
                    "and might see significant growth in utility and value. \n";
    private int currentPrice;

    public Cardano() {
        this.currentPrice = 2;
    }

    @Override
    public void printInfo(PlayerProfile playerProfile) {
        ResponseManager.indentPrint(CRYPTO_INFORMATION + "\n"
            + "Crypto Name: " + NAME + "\n"
            + "Current Price: " + currentPrice + " USD" + "\n");

        if (playerProfile.getOccupation().equals("Artificial intelligence")) {
            ResponseManager.indentPrint(HIDDEN_INFO + "\n");
        }
    }

    @Override
    public int calculateChange(int amountInvested) {
        Random random = new Random();
        int changePercentage = random.nextInt(5) - 2;
        int changeAmount = amountInvested * changePercentage / 100;
        this.currentPrice += this.currentPrice * changePercentage / 100;

        if (changePercentage > 0) {
            System.out.println("Cardano has seen a positive trend, increasing by " + changePercentage + "%.");
        } else if (changePercentage < 0) {
            System.out.println("Cardano has faced a slight downturn, decreasing by "
                    + Math.abs(changePercentage) + "%.");
        } else {
            System.out.println("The market for Cardano has been stable, with no significant price changes.");
        }

        return changeAmount;
    }

    @Override
    public String returnCryptoName() {
        return NAME;
    }

    @Override
    public int returnCurrentPrice() {
        return currentPrice;
    }
    @Override
    public int getRiskFactor() {
        return RISK_FACTOR;
    }
}
