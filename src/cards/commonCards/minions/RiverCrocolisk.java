package cards.commonCards.minions;

import cards.CardClass;
import cards.Minion;
import game.GameState;

/**
 * @author Ilya239.
 *         Created on 23.12.2016.
 */
public class RiverCrocolisk extends Minion {
    public RiverCrocolisk() {
        cardClass = CardClass.COMMON;

        manaCost = 2;

        defaultHealth = 3;

        attack = 2;

        name = "River Crocolisk";
    }

    @Override
    public void resolve(int target, GameState gameState) {

    }
}