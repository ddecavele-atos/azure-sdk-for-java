/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * The HierarchySegment model.
 */
@JacksonXmlRootElement(localName = "Blobs")
public final class  HierarchySegment {
    /**
     * The blobPrefixItems property.
     */
    @JsonProperty("BlobPrefix")
    private List<BlobPrefix> blobPrefixItems = new ArrayList<>();

    /**
     * The blobItems property.
     */
    @JsonProperty("Blob")
    private List<BlobItem> blobItems = new ArrayList<>();

    /**
     * Get the blobPrefixItems value.
     *
     * @return the blobPrefixItems value.
     */
    public List<BlobPrefix> blobPrefixItems() {
        return this.blobPrefixItems;
    }

    /**
     * Set the blobPrefixItems value.
     *
     * @param blobPrefixItems the blobPrefixItems value to set.
     * @return the HierarchySegment object itself.
     */
    public HierarchySegment withBlobPrefixItems(List<BlobPrefix> blobPrefixItems) {
        this.blobPrefixItems = blobPrefixItems;
        return this;
    }

    /**
     * Get the blobItems value.
     *
     * @return the blobItems value.
     */
    public List<BlobItem> blobItems() {
        return this.blobItems;
    }

    /**
     * Set the blobItems value.
     *
     * @param blobItems the blobItems value to set.
     * @return the HierarchySegment object itself.
     */
    public HierarchySegment withBlobItems(List<BlobItem> blobItems) {
        this.blobItems = blobItems;
        return this;
    }
}
