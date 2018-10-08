/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.trafficmanager;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.Region;

/**
 * An immutable client-side representation of an Azure traffic manager profile external endpoint.
 */
@Fluent
public interface TrafficManagerExternalEndpoint extends TrafficManagerEndpoint {
    /**
     * @return the fully qualified DNS name of the external endpoint
     */
    String fqdn();

    /**
     * @return the location of the traffic that the endpoint handles
     */
    Region sourceTrafficLocation();
}