package cards.priestCards.minions;

import cards.CardClass;
import cards.Minion;
import game.GameState;

/**
 * @author Ilya239.
 *         Created on 23.12.2016.
 */
public class HoodedAcolyte extends Minion {
    public HoodedAcolyte() {
        cardClass = CardClass.PRIEST;

        manaCost = 4;

        defaultHealth = 6;

        attack = 3;

        name = "Hooded Acolyte";
    }

    @Override
    public void resolve(int target, GameState gameState) {

    }
}