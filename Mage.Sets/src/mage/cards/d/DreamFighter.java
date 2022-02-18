package mage.cards.d;

import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BlocksOrBecomesBlockedSourceTriggeredAbility;
import mage.abilities.effects.common.PhaseOutSourceEffect;
import mage.abilities.effects.common.PhaseOutTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.StaticFilters;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class DreamFighter extends CardImpl {

    public DreamFighter(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{U}");

        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.SOLDIER);
        this.power = new MageInt(1);
        this.toughness = new MageInt(1);

        // Whenever Dream Fighter blocks or becomes blocked by a creature, Dream Fighter and that creature phase out.
        Ability ability = new BlocksOrBecomesBlockedSourceTriggeredAbility(
                new PhaseOutSourceEffect(), StaticFilters.FILTER_PERMANENT_CREATURE,
                false, "Whenever {this} blocks or becomes blocked by a creature, " +
                "{this} and that creature phase out.", true
        );
        ability.addEffect(new PhaseOutTargetEffect());
        this.addAbility(ability);
    }

    private DreamFighter(final DreamFighter card) {
        super(card);
    }

    @Override
    public DreamFighter copy() {
        return new DreamFighter(this);
    }
}
