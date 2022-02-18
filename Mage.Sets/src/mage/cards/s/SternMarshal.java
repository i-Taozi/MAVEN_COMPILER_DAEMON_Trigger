
package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.ActivateIfConditionActivatedAbility;
import mage.abilities.condition.common.MyTurnBeforeAttackersDeclaredCondition;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.effects.common.continuous.BoostTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.Zone;
import mage.target.common.TargetCreaturePermanent;

/**
 *
 * @author fireshoes
 */
public final class SternMarshal extends CardImpl {

    public SternMarshal(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{2}{W}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);

        // {tap}: Target creature gets +2/+2 until end of turn. Activate this ability only during your turn, before attackers are declared.
        Ability ability = new ActivateIfConditionActivatedAbility(Zone.BATTLEFIELD, 
                new BoostTargetEffect(2, 2, Duration.EndOfTurn), new TapSourceCost(), MyTurnBeforeAttackersDeclaredCondition.instance);
        ability.addTarget(new TargetCreaturePermanent());
        this.addAbility(ability);
    }

    private SternMarshal(final SternMarshal card) {
        super(card);
    }

    @Override
    public SternMarshal copy() {
        return new SternMarshal(this);
    }
}
