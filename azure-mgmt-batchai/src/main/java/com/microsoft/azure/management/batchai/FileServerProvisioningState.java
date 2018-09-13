/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for FileServerProvisioningState.
 */
public final class FileServerProvisioningState extends ExpandableStringEnum<FileServerProvisioningState> {
    /** Static value creating for FileServerProvisioningState. */
    public static final FileServerProvisioningState CREATING = fromString("creating");

    /** Static value updating for FileServerProvisioningState. */
    public static final FileServerProvisioningState UPDATING = fromString("updating");

    /** Static value deleting for FileServerProvisioningState. */
    public static final FileServerProvisioningState DELETING = fromString("deleting");

    /** Static value succeeded for FileServerProvisioningState. */
    public static final FileServerProvisioningState SUCCEEDED = fromString("succeeded");

    /** Static value failed for FileServerProvisioningState. */
    public static final FileServerProvisioningState FAILED = fromString("failed");

    /**
     * Creates or finds a FileServerProvisioningState from its string representation.
     * @param name a name to look for
     * @return the corresponding FileServerProvisioningState
     */
    @JsonCreator
    public static FileServerProvisioningState fromString(String name) {
        return fromString(name, FileServerProvisioningState.class);
    }

    /**
     * @return known FileServerProvisioningState values
     */
    public static Collection<FileServerProvisioningState> values() {
        return values(FileServerProvisioningState.class);
    }
}