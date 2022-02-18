
package mage.game.permanent.token;

import mage.constants.CardType;
import mage.constants.SubType;

/**
 *
 * @author spjspj
 */
public final class DevastatingSummonsElementalToken extends TokenImpl {

    public DevastatingSummonsElementalToken() {
        super("Elemental", "X/X red Elemental creature");
        cardType.add(CardType.CREATURE);
        color.setRed(true);
        subtype.add(SubType.ELEMENTAL);
    }

    public DevastatingSummonsElementalToken(final DevastatingSummonsElementalToken token) {
        super(token);
    }

    public DevastatingSummonsElementalToken copy() {
        return new DevastatingSummonsElementalToken(this);
    }
}
