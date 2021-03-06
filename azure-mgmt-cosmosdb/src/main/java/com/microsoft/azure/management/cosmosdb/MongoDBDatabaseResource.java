/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB MongoDB database id object.
 */
public class MongoDBDatabaseResource {
    /**
     * Name of the Cosmos DB MongoDB database.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get name of the Cosmos DB MongoDB database.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB MongoDB database.
     *
     * @param id the id value to set
     * @return the MongoDBDatabaseResource object itself.
     */
    public MongoDBDatabaseResource withId(String id) {
        this.id = id;
        return this;
    }

}
