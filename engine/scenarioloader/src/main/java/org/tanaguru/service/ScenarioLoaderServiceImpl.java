/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015  Tanaguru.org
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
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
package org.tanaguru.service;

import java.util.List;
import org.tanaguru.entity.audit.Audit;
import org.tanaguru.entity.audit.Content;
import org.tanaguru.entity.service.audit.ContentDataService;
import org.tanaguru.entity.service.subject.WebResourceDataService;
import org.tanaguru.scenarioloader.ScenarioLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.tanaguru.scenarioloader.ScenarioLoaderFactory;

/**
 * 
 * @author jkowalczyk
 */
public class ScenarioLoaderServiceImpl implements ScenarioLoaderService {

    private ScenarioLoaderFactory scenarioLoaderFactory;
    @Override
    @Autowired
    public void setScenarioLoaderFactory(ScenarioLoaderFactory scenarioLoaderFactory) {
        this.scenarioLoaderFactory = scenarioLoaderFactory;
    }

    private ContentDataService contentDataService;
    @Autowired
    public void setContentDataService (ContentDataService contentDataService) {
        this.contentDataService = contentDataService;
    }
    
    private WebResourceDataService webResourceDataService;
    @Autowired
    public void setWebResourceDataService (WebResourceDataService webResourceDataService) {
        this.webResourceDataService = webResourceDataService;
    }

    public ScenarioLoaderServiceImpl() {
        super();
    }

    @Override
    public List<Content> loadScenario(Audit audit, String scenarioFile) {
        ScenarioLoader scenarioLoader = scenarioLoaderFactory.create(audit.getSubject());
        scenarioLoader.run(scenarioFile);
        return getContentList(scenarioLoader, audit);
    }

    @Override
    public List<Content> loadUrlListContent(Audit audit, List<String> urlList) {
        ScenarioLoader scenarioLoader = scenarioLoaderFactory.create(audit.getSubject());
        scenarioLoader.run(urlList);
        return getContentList(scenarioLoader, audit);
    }

    private List<Content> getContentList(ScenarioLoader scenarioLoader, Audit audit){
        List<Content> contentList = scenarioLoader.getResult();
        for (Content content : contentList) {
            content.setAudit(audit);
            contentDataService.saveAuditToContent(content.getId(),audit.getId());
        }
        return contentList;
    }
}