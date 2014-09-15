/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql;

import com.microsoft.azure.exception.ServiceException;
import com.microsoft.azure.management.sql.models.RestoreDatabaseOperationCreateParameters;
import com.microsoft.azure.management.sql.models.RestoreDatabaseOperationCreateResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.util.concurrent.Future;
import javax.xml.datatype.DatatypeConfigurationException;
import org.xmlpull.v1.XmlPullParserException;

/**
* Contains the operation to create restore requests for Azure SQL Databases.
*/
public interface RestoreDatabaseOperations {
    /**
    * Issues a restore request for an Azure SQL Database.
    *
    * @param sourceServerName Required. The name of the Azure SQL Database
    * Server where the source database is, or was, hosted.
    * @param parameters Required. Additional parameters for the Create Restore
    * Database Operation request.
    * @throws MalformedURLException Thrown in case of an invalid request URL
    * @throws ProtocolException Thrown if invalid request method
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred
    * @throws XmlPullParserException This exception is thrown to signal XML
    * Pull Parser related faults.
    * @throws DatatypeConfigurationException Invalid datatype configuration
    * @return Contains the response to the Create Restore Database Operation
    * request.
    */
    RestoreDatabaseOperationCreateResponse create(String sourceServerName, RestoreDatabaseOperationCreateParameters parameters) throws MalformedURLException, ProtocolException, ServiceException, IOException, XmlPullParserException, DatatypeConfigurationException;
    
    /**
    * Issues a restore request for an Azure SQL Database.
    *
    * @param sourceServerName Required. The name of the Azure SQL Database
    * Server where the source database is, or was, hosted.
    * @param parameters Required. Additional parameters for the Create Restore
    * Database Operation request.
    * @return Contains the response to the Create Restore Database Operation
    * request.
    */
    Future<RestoreDatabaseOperationCreateResponse> createAsync(String sourceServerName, RestoreDatabaseOperationCreateParameters parameters);
}