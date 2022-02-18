package mage.game.permanent.token;

import mage.MageInt;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.Arrays;

/**
 * @author spjspj
 */
public final class ConstructToken extends TokenImpl {

    public ConstructToken() {
        super("Construct", "1/1 colorless Construct artifact creature token");
        cardType.add(CardType.ARTIFACT);
        cardType.add(CardType.CREATURE);
        subtype.add(SubType.CONSTRUCT);
        power = new MageInt(1);
        toughness = new MageInt(1);

        availableImageSetCodes = Arrays.asList("ZNR");
    }

    public ConstructToken(final ConstructToken token) {
        super(token);
    }

    public ConstructToken copy() {
        return new ConstructToken(this);
    }
}
