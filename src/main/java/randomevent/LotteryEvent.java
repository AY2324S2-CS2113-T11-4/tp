package randomevent;

import player.PlayerProfile;
import static ui.Parser.isAccept;


public class LotteryEvent extends RandomEvent {
    private static final int TICKET_PRICE = 2000;
    private static final int[] PRIZES = {0, 100, 500, 800, 1000, 1500, 2500, 3000, 10000};
    public LotteryEvent(double probability) {
        super(probability);
    }

    @Override
    public void triggerEvent(PlayerProfile playerProfile) {
        System.out.println("You have entered a lottery event! \n" +
                "You can choose to buy a ticket for $2000. \n" +
                "If you win, you will receive a cash prize up to $10000! \n" +
                "Do you want to buy a ticket? (Yes/No)");
        if (isAccept()) {
            drawLottery(playerProfile);
        } else {
            System.out.println("You have chosen not to buy a ticket.");
        }
    }

    private void drawLottery(PlayerProfile playerProfile) {
        playerProfile.loseAsset(TICKET_PRICE);
        System.out.println("You have bought a ticket for $2000.");
        int prizeIndex = (int)(Math.random() * PRIZES.length);
        int prize = PRIZES[prizeIndex];
        if (prize == 0) {
            System.out.println("You have won nothing. Better luck next time!");
            return;
        }
        System.out.println("You have won $" + prize + "!");
        playerProfile.addAsset(prize);
    }
}
