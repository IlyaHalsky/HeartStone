package cards.commonCards.minions;

import cards.CardClass;
import cards.Minion;

/**
 * @author Ilya239.
 *         Created on 23.12.2016.
 */
public class Sheep extends Minion {
    public Sheep() {
        CardClass cardClass = CardClass.COMMON;

        manaCost = 1;

        defaultHealth = 1;

        attack = 1;

        String name = "Sheep";
    }
}