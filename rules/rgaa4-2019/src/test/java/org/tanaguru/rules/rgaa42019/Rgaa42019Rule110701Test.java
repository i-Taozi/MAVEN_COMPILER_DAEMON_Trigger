/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015  Tanaguru.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: tanaguru AT tanaguru DOT org
 */
package org.tanaguru.rules.rgaa42019;

import org.tanaguru.entity.audit.TestSolution;
import org.tanaguru.rules.keystore.HtmlElementStore;
import org.tanaguru.rules.keystore.RemarkMessageStore;
import org.tanaguru.entity.audit.ProcessResult;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.tanaguru.rules.rgaa42019.test.Rgaa42019RuleImplementationTestCase;

/**
 * Unit test class for the implementation of the rule 11-7-1 of the referential Rgaa 4-2019.
 *
 * @author edaconceicao
 */
public class Rgaa42019Rule110701Test extends Rgaa42019RuleImplementationTestCase {

    /**
     * Default constructor
     */
    public Rgaa42019Rule110701Test (String testName){
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName(
                "org.tanaguru.rules.rgaa42019.Rgaa42019Rule110701");
    }

    @Override
    protected void setUpWebResourceMap() {
        addWebResource("Rgaa42019.Test.11.07.01-2Failed-01");
        addWebResource("Rgaa42019.Test.11.07.01-2Failed-02");
        addWebResource("Rgaa42019.Test.11.07.01-3NMI-01");
        addWebResource("Rgaa42019.Test.11.07.01-4NA-01");
        addWebResource("Rgaa42019.Test.11.07.01-4NA-02");
        addWebResource("Rgaa42019.Test.11.07.01-4NA-03");

    }

    @Override
    protected void setProcess() {
        //----------------------------------------------------------------------
        //------------------------------2Failed-01------------------------------
        //----------------------------------------------------------------------
        ProcessResult processResult = processPageTest("Rgaa42019.Test.11.07.01-2Failed-01");
        checkResultIsFailed(processResult, 1, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.NOT_PERTINENT_LEGEND_MSG,
                HtmlElementStore.LEGEND_ELEMENT,
                1, 
                new ImmutablePair(HtmlElementStore.TEXT_ELEMENT2,""));
        
        //----------------------------------------------------------------------
        //------------------------------2Failed-02------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa42019.Test.11.07.01-2Failed-02");
        checkResultIsFailed(processResult, 1, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.FAILED,
                RemarkMessageStore.NOT_PERTINENT_LEGEND_MSG,
                HtmlElementStore.LEGEND_ELEMENT,
                1, 
                new ImmutablePair(HtmlElementStore.TEXT_ELEMENT2,"%!:/;.,~"));
        
        //----------------------------------------------------------------------
        //------------------------------3NMI-01---------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa42019.Test.11.07.01-3NMI-01");
        checkResultIsPreQualified(processResult, 1, 1);
        checkRemarkIsPresent(
                processResult,
                TestSolution.NEED_MORE_INFO,
                RemarkMessageStore.CHECK_LEGEND_PERTINENCE_MSG,
                HtmlElementStore.LEGEND_ELEMENT,
                1, 
                new ImmutablePair(HtmlElementStore.TEXT_ELEMENT2,"Fieldset legend"));
        
        //----------------------------------------------------------------------
        //------------------------------4NA-01----------------------------------
        //----------------------------------------------------------------------
        checkResultIsNotApplicable(processPageTest("Rgaa42019.Test.11.07.01-4NA-01"));
        
        //----------------------------------------------------------------------
        //------------------------------4NA-02----------------------------------
        //----------------------------------------------------------------------
        checkResultIsNotApplicable(processPageTest("Rgaa42019.Test.11.07.01-4NA-02"));
        
        //----------------------------------------------------------------------
        //------------------------------4NA-03----------------------------------
        //----------------------------------------------------------------------
        checkResultIsNotApplicable(processPageTest("Rgaa42019.Test.11.07.01-4NA-03"));
    }

}