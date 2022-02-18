package it.unibz.inf.ontop.docker.oracle;

/*
 * #%L
 * ontop-test
 * %%
 * Copyright (C) 2009 - 2014 Free University of Bozen-Bolzano
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import it.unibz.inf.ontop.docker.AbstractConstraintTest;

public class OracleConstraintTest extends AbstractConstraintTest {

	private static final String propertyFile = "/oracle/oracle.properties";

	// TODO: CHECK THAT THE DATABASE CONTAINS THE TABLES
	public OracleConstraintTest(String method) {
		super(method, propertyFile);
	}

}