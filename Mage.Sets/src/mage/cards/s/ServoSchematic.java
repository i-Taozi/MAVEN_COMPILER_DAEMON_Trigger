
package mage.cards.s;

import java.util.UUID;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.common.PutIntoGraveFromBattlefieldSourceTriggeredAbility;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.game.permanent.token.ServoToken;

/**
 *
 * @author fireshoes
 */
public final class ServoSchematic extends CardImpl {

    public ServoSchematic(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT}, "{2}");

        // When Servo Schematic enters the battlefield or is put into a graveyard from the battlefield, create a 1/1 colorless Servo artifact creature token.
        this.addAbility(new EntersBattlefieldTriggeredAbility(new CreateTokenEffect(new ServoToken())));
        this.addAbility(new PutIntoGraveFromBattlefieldSourceTriggeredAbility(new CreateTokenEffect(new ServoToken())));
    }

    private ServoSchematic(final ServoSchematic card) {
        super(card);
    }

    @Override
    public ServoSchematic copy() {
        return new ServoSchematic(this);
    }
}
