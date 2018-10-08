/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.management.network.ConnectionMonitorDestination;
import com.microsoft.azure.v2.management.network.ConnectionMonitorSource;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.Map;

/**
 * Parameters that define the operation to create a connection monitor.
 */
@JsonFlatten
public class ConnectionMonitorInner {
    /**
     * Connection monitor location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Connection monitor tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The source property.
     */
    @JsonProperty(value = "properties.source", required = true)
    private ConnectionMonitorSource source;

    /**
     * The destination property.
     */
    @JsonProperty(value = "properties.destination", required = true)
    private ConnectionMonitorDestination destination;

    /**
     * Determines if the connection monitor will start automatically once
     * created.
     */
    @JsonProperty(value = "properties.autoStart")
    private Boolean autoStart;

    /**
     * Monitoring interval in seconds.
     */
    @JsonProperty(value = "properties.monitoringIntervalInSeconds")
    private Integer monitoringIntervalInSeconds;

    /**
     * Get the location value.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set.
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set.
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the source value.
     *
     * @return the source value.
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set.
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination value.
     *
     * @return the destination value.
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination value.
     *
     * @param destination the destination value to set.
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the autoStart value.
     *
     * @return the autoStart value.
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set the autoStart value.
     *
     * @param autoStart the autoStart value to set.
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get the monitoringIntervalInSeconds value.
     *
     * @return the monitoringIntervalInSeconds value.
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set the monitoringIntervalInSeconds value.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value
     * to set.
     * @return the ConnectionMonitorInner object itself.
     */
    public ConnectionMonitorInner withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }
}