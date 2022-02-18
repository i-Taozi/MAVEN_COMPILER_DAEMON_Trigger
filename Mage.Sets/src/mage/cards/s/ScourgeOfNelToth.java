
package mage.cards.s;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.costs.Cost;
import mage.abilities.costs.Costs;
import mage.abilities.costs.CostsImpl;
import mage.abilities.costs.common.SacrificeTargetCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.AsThoughEffectImpl;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.AsThoughEffectType;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.Zone;
import mage.game.Game;
import mage.players.Player;
import mage.target.common.TargetControlledCreaturePermanent;

/**
 *
 * @author LevelX2
 */
public final class ScourgeOfNelToth extends CardImpl {

    public ScourgeOfNelToth(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId,setInfo,new CardType[]{CardType.CREATURE},"{5}{B}{B}");
        this.subtype.add(SubType.ZOMBIE);
        this.subtype.add(SubType.DRAGON);
        this.power = new MageInt(6);
        this.toughness = new MageInt(6);

        // Flying
        this.addAbility(FlyingAbility.getInstance());
        // You may cast Scourge of Nel Toth from your graveyard by paying {B}{B} and sacrificing two creatures rather than paying its mana cost.
        this.addAbility(new SimpleStaticAbility(Zone.ALL, new ScourgeOfNelTothPlayEffect()));
    }

    private ScourgeOfNelToth(final ScourgeOfNelToth card) {
        super(card);
    }

    @Override
    public ScourgeOfNelToth copy() {
        return new ScourgeOfNelToth(this);
    }
}

class ScourgeOfNelTothPlayEffect extends AsThoughEffectImpl {

    public ScourgeOfNelTothPlayEffect() {
        super(AsThoughEffectType.PLAY_FROM_NOT_OWN_HAND_ZONE, Duration.EndOfGame, Outcome.Benefit);
        staticText = "You may cast {this} from your graveyard by paying {B}{B} and sacrificing two creatures rather than paying its mana cost";
    }

    public ScourgeOfNelTothPlayEffect(final ScourgeOfNelTothPlayEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public ScourgeOfNelTothPlayEffect copy() {
        return new ScourgeOfNelTothPlayEffect(this);
    }

    @Override
    public boolean applies(UUID sourceId, Ability source, UUID affectedControllerId, Game game) {
        if (sourceId.equals(source.getSourceId()) && source.isControlledBy(affectedControllerId)) {
            if (game.getState().getZone(source.getSourceId()) == Zone.GRAVEYARD) {
                Player player = game.getPlayer(affectedControllerId);
                if (player != null) {
                    // can sometimes be cast with base mana cost from grave????
                    Costs<Cost> costs = new CostsImpl<>();
                    costs.add(new SacrificeTargetCost(new TargetControlledCreaturePermanent(2)));
                    player.setCastSourceIdWithAlternateMana(sourceId, new ManaCostsImpl<>("{B}{B}"), costs);
                    return true;
                }
            }
        }
        return false;
    }

}
