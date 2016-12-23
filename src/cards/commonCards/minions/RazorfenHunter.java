package cards.commonCards.minions;

import cards.CardClass;
import cards.Minion;
import game.GameState;

/**
 * @author Ilya239.
 *         Created on 23.12.2016.
 */
public class RazorfenHunter extends Minion {
    public RazorfenHunter() {
        cardClass = CardClass.COMMON;

        manaCost = 3;

        defaultHealth = 3;

        attack = 2;

        name = "Razorfen Hunter";
    }

    @Override
    public void resolve(int target, GameState gameState) {
        gameState.getActivePlayer().addMinion(new Sheep());
    }
}