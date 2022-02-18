

package mage.cards.c;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EntersBattlefieldTriggeredAbility;
import mage.abilities.effects.common.ReturnToHandTargetEffect;
import mage.abilities.keyword.InfectAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.filter.FilterCard;
import mage.filter.predicate.mageobject.AbilityPredicate;
import mage.target.common.TargetCardInYourGraveyard;

/**
 *
 * @author Loki
 */
public final class CorpseCur extends CardImpl {

    private static final FilterCard filter = new FilterCard("creature card with infect from your graveyard");

    static {
        filter.add(new AbilityPredicate(InfectAbility.class));
    }

    public CorpseCur (UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.ARTIFACT,CardType.CREATURE},"{4}");
        this.subtype.add(SubType.PHYREXIAN);
        this.subtype.add(SubType.DOG);
        this.power = new MageInt(2);
        this.toughness = new MageInt(2);
        this.addAbility(InfectAbility.getInstance());
        Ability ability = new EntersBattlefieldTriggeredAbility(new ReturnToHandTargetEffect());
        ability.addTarget(new TargetCardInYourGraveyard(filter));
        this.addAbility(ability);
    }

    public CorpseCur (final CorpseCur card) {
        super(card);
    }

    @Override
    public CorpseCur copy() {
        return new CorpseCur(this);
    }

}
