package cards.commonCards.minions;

import cards.CardClass;
import cards.Minion;

/**
 * @author Ilya239.
 *         Created on 23.12.2016.
 */
public class FenCreeper extends Minion {
    public FenCreeper() {
        cardClass = CardClass.COMMON;

        manaCost = 5;

        defaultHealth = 6;

        attack = 3;

        name = "Fen Creeper";
    }
}