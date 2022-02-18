package org.mage.test.cards.enchantments;

import mage.constants.PhaseStep;
import mage.constants.Zone;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

/**
 *
 * @author LevelX2
 */
public class AnimateDeadTest extends CardTestPlayerBase {

    @Test
    public void testAnimateOpponentsCreature() {
        addCard(Zone.GRAVEYARD, playerB, "Silvercoat Lion", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 2);
        // Enchant creature card in a graveyard
        // When Animate Dead enters the battlefield, if it's on the battlefield, it loses "enchant creature card in a graveyard"
        // and gains "enchant creature put onto the battlefield with Animate Dead." Return enchanted creature card to the battlefield
        // under your control and attach Animate Dead to it. When Animate Dead leaves the battlefield, that creature's controller sacrifices it.
        // Enchanted creature gets -1/-0.
        addCard(Zone.HAND, playerA, "Animate Dead"); // {1}{B}

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Animate Dead", "Silvercoat Lion");

        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();

        assertPowerToughness(playerA, "Silvercoat Lion", 1, 2);
        assertPermanentCount(playerA, "Animate Dead", 1);
    }

    @Test
    public void testAnimateEternalWitness() {
        // When Eternal Witness enters the battlefield, you may return target card from your graveyard to your hand.
        addCard(Zone.GRAVEYARD, playerB, "Eternal Witness", 1);
        addCard(Zone.GRAVEYARD, playerA, "Silvercoat Lion", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 2);
        // Enchant creature card in a graveyard
        // When Animate Dead enters the battlefield, if it's on the battlefield, it loses "enchant creature card in a graveyard"
        // and gains "enchant creature put onto the battlefield with Animate Dead." Return enchanted creature card to the battlefield
        // under your control and attach Animate Dead to it. When Animate Dead leaves the battlefield, that creature's controller sacrifices it.
        // Enchanted creature gets -1/-0.
        addCard(Zone.HAND, playerA, "Animate Dead"); // {1}{B}

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Animate Dead", "Eternal Witness");
        addTarget(playerA, "Silvercoat Lion");

        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();

        assertPowerToughness(playerA, "Eternal Witness", 1, 1);
        assertPermanentCount(playerA, "Animate Dead", 1);
        assertHandCount(playerA, "Silvercoat Lion", 1);
    }

    /**
     * Buddy animated an Eternal Witness. I killed the Eternal Witness. Animate
     * Dead stayed on the battlefield. Using Meren, Eternal Witness came back to
     * the battlefield and immediately got enchanted by Animate Dead.
     *
     * Very weird. Animate Dead should've hit the graveyard the first time its
     * creature died, right?
     *
     */
    @Test
    public void testAnimateAndKillEternalWitness() {
        // When Eternal Witness enters the battlefield, you may return target card from your graveyard to your hand.
        addCard(Zone.GRAVEYARD, playerB, "Eternal Witness", 1);
        addCard(Zone.BATTLEFIELD, playerB, "Mountain", 1);
        addCard(Zone.HAND, playerB, "Lightning Bolt", 1);

        addCard(Zone.GRAVEYARD, playerA, "Silvercoat Lion", 1);
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 2);
        // Enchant creature card in a graveyard
        // When Animate Dead enters the battlefield, if it's on the battlefield, it loses "enchant creature card in a graveyard"
        // and gains "enchant creature put onto the battlefield with Animate Dead." Return enchanted creature card to the battlefield
        // under your control and attach Animate Dead to it. When Animate Dead leaves the battlefield, that creature's controller sacrifices it.
        // Enchanted creature gets -1/-0.
        addCard(Zone.HAND, playerA, "Animate Dead"); // {1}{B}

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Animate Dead", "Eternal Witness");
        addTarget(playerA, "Silvercoat Lion");

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerB, "Lightning Bolt", "Eternal Witness");

        setStopAt(1, PhaseStep.BEGIN_COMBAT);
        execute();

        assertGraveyardCount(playerB, "Lightning Bolt", 1);
        assertGraveyardCount(playerB, "Eternal Witness", 1);
        assertHandCount(playerA, "Silvercoat Lion", 1);
        assertGraveyardCount(playerA, "Animate Dead", 1);
        assertPermanentCount(playerA, "Animate Dead", 0);
    }

    /**
     * Animate Dead is incorrectly not entering the graveyard when the animated
     * target is sacrificed.
     */
    @Test
    public void testAnimateAndSacrificeTarget() {
        // Target opponent sacrifices a creature.
        addCard(Zone.HAND, playerB, "Cruel Edict"); // {1}{B}
        addCard(Zone.BATTLEFIELD, playerB, "Swamp", 2);
        addCard(Zone.GRAVEYARD, playerB, "Silvercoat Lion", 1);

        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 2);
        // Enchant creature card in a graveyard
        // When Animate Dead enters the battlefield, if it's on the battlefield, it loses "enchant creature card in a graveyard"
        // and gains "enchant creature put onto the battlefield with Animate Dead." Return enchanted creature card to the battlefield
        // under your control and attach Animate Dead to it. When Animate Dead leaves the battlefield, that creature's controller sacrifices it.
        // Enchanted creature gets -1/-0.
        addCard(Zone.HAND, playerA, "Animate Dead"); // {1}{B}

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Animate Dead", "Silvercoat Lion");

        castSpell(2, PhaseStep.PRECOMBAT_MAIN, playerB, "Cruel Edict", playerA);

        setStopAt(2, PhaseStep.END_TURN);
        execute();

        assertGraveyardCount(playerB, "Cruel Edict", 1);
        assertGraveyardCount(playerB, "Silvercoat Lion", 1);

        assertGraveyardCount(playerA, "Animate Dead", 1);
    }

    /**
     * Animate Dead enchanting a creature with a "enters the battlefield"
     * triggered ability with targets available.
     */
    @Test
    public void testAnimateAndDragonlordAtarkaWithTargets() {
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 2);

        // Enchant creature card in a graveyard
        // When Animate Dead enters the battlefield, if it's on the battlefield, it loses "enchant creature card in a graveyard"
        // and gains "enchant creature put onto the battlefield with Animate Dead." Return enchanted creature card to the battlefield
        // under your control and attach Animate Dead to it. When Animate Dead leaves the battlefield, that creature's controller sacrifices it.
        // Enchanted creature gets -1/-0.
        addCard(Zone.HAND, playerA, "Animate Dead"); // {1}{B}

        // Flying
        // Trample
        // When Dragonlord Atarka enters the battlefield, it deals 5 damage divided as you choose among any number of target
        // creatures and/or planeswalkers your opponents control.
        addCard(Zone.GRAVEYARD, playerB, "Dragonlord Atarka", 1);
        addCard(Zone.BATTLEFIELD, playerB, "Silvercoat Lion", 3);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Animate Dead", "Dragonlord Atarka");

        setStopAt(2, PhaseStep.BEGIN_COMBAT);
        execute();

        assertPermanentCount(playerA, "Animate Dead", 1);
        assertPermanentCount(playerA, "Dragonlord Atarka", 1);

        assertPermanentCount(playerB, "Silvercoat Lion", 1);
    }

    /**
     * Animate Dead enchanting a creature with a "enters the battlefield"
     * triggered ability with no available targets.
     * https://github.com/magefree/mage/issues/4428
     */
    @Test
    public void testAnimateAndDragonlordAtarkaWithNoTargets() {
        setStrictChooseMode(true);

        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 2);

        // Enchant creature card in a graveyard
        // When Animate Dead enters the battlefield, if it's on the battlefield, it loses "enchant creature card in a graveyard"
        // and gains "enchant creature put onto the battlefield with Animate Dead." Return enchanted creature card to the battlefield
        // under your control and attach Animate Dead to it. When Animate Dead leaves the battlefield, that creature's controller sacrifices it.
        // Enchanted creature gets -1/-0.
        addCard(Zone.HAND, playerA, "Animate Dead"); // {1}{B}

        // Flying
        // Trample
        // When Dragonlord Atarka enters the battlefield, it deals 5 damage divided as you choose among any number of target
        // creatures and/or planeswalkers your opponents control.
        addCard(Zone.GRAVEYARD, playerB, "Dragonlord Atarka", 1);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Animate Dead", "Dragonlord Atarka");

        setStopAt(2, PhaseStep.BEGIN_COMBAT);
        execute();

        assertAllCommandsUsed();

        assertLife(playerA, 20);
        assertLife(playerB, 20);

        assertPermanentCount(playerA, "Animate Dead", 1);
        assertPermanentCount(playerA, "Dragonlord Atarka", 1);
    }
}
