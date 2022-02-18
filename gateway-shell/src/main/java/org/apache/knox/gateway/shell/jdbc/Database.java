/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.knox.gateway.shell.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public interface Database {

  /**
   * Creates this database
   *
   * @throws SQLException
   *           if any errors occur
   */
  void create() throws SQLException;

  /**
   * Shuts down this database
   *
   * @throws SQLException
   *           if any errors occur
   */
  void shutdown() throws SQLException;

  /**
   * Retrieves a connection to this database
   *
   * @return an SQL connection to this database
   * @throws SQLException
   *           if any errors occur
   */
  Connection getConnection() throws SQLException;

  /**
   * Checks whether the specified table is created within this database (does not check schema)
   *
   * @param tableName
   *          the name of the table to check
   * @return true if the table exists; false otherwise
   * @throws SQLException
   *           if any I/O errors occur
   */
  boolean hasTable(String tableName) throws SQLException;

  /**
   * Checks whether the specified table is created within this database
   *
   * @param schemaName
   *          the database schema name
   * @param tableName
   *          the name of the table to check
   * @return true if the table exists; false otherwise
   * @throws SQLException
   *           if any I/O errors occur
   */
  boolean hasTable(String schemaName, String tableName) throws SQLException;
}
