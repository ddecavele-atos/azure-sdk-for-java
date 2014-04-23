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

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.Calendar;

/**
* Parameters returned from the Create Virtual Machine Image operation.
*/
public class VirtualMachineOSImageUpdateResponse extends OperationResponse {
    private String category;
    
    /**
    * Optional. The repository classification of the image. All user images
    * have the category User.
    * @return The Category value.
    */
    public String getCategory() {
        return this.category;
    }
    
    /**
    * Optional. The repository classification of the image. All user images
    * have the category User.
    * @param categoryValue The Category value.
    */
    public void setCategory(final String categoryValue) {
        this.category = categoryValue;
    }
    
    private String description;
    
    /**
    * Optional. Specifies the description of the OS image.
    * @return The Description value.
    */
    public String getDescription() {
        return this.description;
    }
    
    /**
    * Optional. Specifies the description of the OS image.
    * @param descriptionValue The Description value.
    */
    public void setDescription(final String descriptionValue) {
        this.description = descriptionValue;
    }
    
    private String eula;
    
    /**
    * Optional. Specifies the End User License Agreement that is associated
    * with the image. The value for this element is a string, but it is
    * recommended that the value be a URL that points to a EULA.
    * @return The Eula value.
    */
    public String getEula() {
        return this.eula;
    }
    
    /**
    * Optional. Specifies the End User License Agreement that is associated
    * with the image. The value for this element is a string, but it is
    * recommended that the value be a URL that points to a EULA.
    * @param eulaValue The Eula value.
    */
    public void setEula(final String eulaValue) {
        this.eula = eulaValue;
    }
    
    private URI iconUri;
    
    /**
    * Optional. Specifies the URI to the icon that is displayed for the image
    * in the Management Portal.
    * @return The IconUri value.
    */
    public URI getIconUri() {
        return this.iconUri;
    }
    
    /**
    * Optional. Specifies the URI to the icon that is displayed for the image
    * in the Management Portal.
    * @param iconUriValue The IconUri value.
    */
    public void setIconUri(final URI iconUriValue) {
        this.iconUri = iconUriValue;
    }
    
    private String imageFamily;
    
    /**
    * Optional. Specifies a value that can be used to group OS images.
    * @return The ImageFamily value.
    */
    public String getImageFamily() {
        return this.imageFamily;
    }
    
    /**
    * Optional. Specifies a value that can be used to group OS images.
    * @param imageFamilyValue The ImageFamily value.
    */
    public void setImageFamily(final String imageFamilyValue) {
        this.imageFamily = imageFamilyValue;
    }
    
    private Boolean isPremium;
    
    /**
    * Optional. Indicates if the image contains software or associated services
    * that will incur charges above the core price for the virtual machine.
    * @return The IsPremium value.
    */
    public Boolean isPremium() {
        return this.isPremium;
    }
    
    /**
    * Optional. Indicates if the image contains software or associated services
    * that will incur charges above the core price for the virtual machine.
    * @param isPremiumValue The IsPremium value.
    */
    public void setIsPremium(final Boolean isPremiumValue) {
        this.isPremium = isPremiumValue;
    }
    
    private String label;
    
    /**
    * Optional. Specifies the friendly name of the image.
    * @return The Label value.
    */
    public String getLabel() {
        return this.label;
    }
    
    /**
    * Optional. Specifies the friendly name of the image.
    * @param labelValue The Label value.
    */
    public void setLabel(final String labelValue) {
        this.label = labelValue;
    }
    
    private String language;
    
    /**
    * Optional. Specifies the language of the image. The Language element is
    * only available using version 2013-03-01 or higher.
    * @return The Language value.
    */
    public String getLanguage() {
        return this.language;
    }
    
    /**
    * Optional. Specifies the language of the image. The Language element is
    * only available using version 2013-03-01 or higher.
    * @param languageValue The Language value.
    */
    public void setLanguage(final String languageValue) {
        this.language = languageValue;
    }
    
    private String location;
    
    /**
    * Optional. The geo-location in which this media is located. The Location
    * value is derived from storage account that contains the blob in which
    * the media is located. If the storage account belongs to an affinity
    * group the value is NULL. If the version is set to 2012-08-01 or later,
    * the locations are returned for platform images; otherwise, this value is
    * NULL for platform images.
    * @return The Location value.
    */
    public String getLocation() {
        return this.location;
    }
    
    /**
    * Optional. The geo-location in which this media is located. The Location
    * value is derived from storage account that contains the blob in which
    * the media is located. If the storage account belongs to an affinity
    * group the value is NULL. If the version is set to 2012-08-01 or later,
    * the locations are returned for platform images; otherwise, this value is
    * NULL for platform images.
    * @param locationValue The Location value.
    */
    public void setLocation(final String locationValue) {
        this.location = locationValue;
    }
    
    private double logicalSizeInGB;
    
    /**
    * Optional. The size, in GB, of the image.
    * @return The LogicalSizeInGB value.
    */
    public double getLogicalSizeInGB() {
        return this.logicalSizeInGB;
    }
    
    /**
    * Optional. The size, in GB, of the image.
    * @param logicalSizeInGBValue The LogicalSizeInGB value.
    */
    public void setLogicalSizeInGB(final double logicalSizeInGBValue) {
        this.logicalSizeInGB = logicalSizeInGBValue;
    }
    
    private URI mediaLinkUri;
    
    /**
    * Optional. Specifies the location of the blob in Azure storage. The blob
    * location must belong to a storage account in the subscription specified
    * by the SubscriptionId value in the operation call. Example:
    * http://example.blob.core.windows.net/disks/mydisk.vhd.
    * @return The MediaLinkUri value.
    */
    public URI getMediaLinkUri() {
        return this.mediaLinkUri;
    }
    
    /**
    * Optional. Specifies the location of the blob in Azure storage. The blob
    * location must belong to a storage account in the subscription specified
    * by the SubscriptionId value in the operation call. Example:
    * http://example.blob.core.windows.net/disks/mydisk.vhd.
    * @param mediaLinkUriValue The MediaLinkUri value.
    */
    public void setMediaLinkUri(final URI mediaLinkUriValue) {
        this.mediaLinkUri = mediaLinkUriValue;
    }
    
    private String name;
    
    /**
    * Optional. Specifies a name that Azure uses to identify the image when
    * creating one or more virtual machines.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Specifies a name that Azure uses to identify the image when
    * creating one or more virtual machines.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private String operatingSystemType;
    
    /**
    * Optional. The operating system type of the OS image. Possible values are:
    * Linux or Windows.
    * @return The OperatingSystemType value.
    */
    public String getOperatingSystemType() {
        return this.operatingSystemType;
    }
    
    /**
    * Optional. The operating system type of the OS image. Possible values are:
    * Linux or Windows.
    * @param operatingSystemTypeValue The OperatingSystemType value.
    */
    public void setOperatingSystemType(final String operatingSystemTypeValue) {
        this.operatingSystemType = operatingSystemTypeValue;
    }
    
    private URI privacyUri;
    
    /**
    * Optional. Specifies the URI that points to a document that contains the
    * privacy policy related to the OS image.
    * @return The PrivacyUri value.
    */
    public URI getPrivacyUri() {
        return this.privacyUri;
    }
    
    /**
    * Optional. Specifies the URI that points to a document that contains the
    * privacy policy related to the OS image.
    * @param privacyUriValue The PrivacyUri value.
    */
    public void setPrivacyUri(final URI privacyUriValue) {
        this.privacyUri = privacyUriValue;
    }
    
    private Calendar publishedDate;
    
    /**
    * Optional. Specifies the date when the OS image was added to the image
    * repository.
    * @return The PublishedDate value.
    */
    public Calendar getPublishedDate() {
        return this.publishedDate;
    }
    
    /**
    * Optional. Specifies the date when the OS image was added to the image
    * repository.
    * @param publishedDateValue The PublishedDate value.
    */
    public void setPublishedDate(final Calendar publishedDateValue) {
        this.publishedDate = publishedDateValue;
    }
    
    private String publisherName;
    
    /**
    * Optional. Specifies the name of the publisher of the image.
    * @return The PublisherName value.
    */
    public String getPublisherName() {
        return this.publisherName;
    }
    
    /**
    * Optional. Specifies the name of the publisher of the image.
    * @param publisherNameValue The PublisherName value.
    */
    public void setPublisherName(final String publisherNameValue) {
        this.publisherName = publisherNameValue;
    }
    
    private String recommendedVMSize;
    
    /**
    * Optional. Specifies the size to use for the virtual machine that is
    * created from the OS image.
    * @return The RecommendedVMSize value.
    */
    public String getRecommendedVMSize() {
        return this.recommendedVMSize;
    }
    
    /**
    * Optional. Specifies the size to use for the virtual machine that is
    * created from the OS image.
    * @param recommendedVMSizeValue The RecommendedVMSize value.
    */
    public void setRecommendedVMSize(final String recommendedVMSizeValue) {
        this.recommendedVMSize = recommendedVMSizeValue;
    }
    
    private Boolean showInGui;
    
    /**
    * Optional. Specifies whether the image should appear in the image gallery.
    * @return The ShowInGui value.
    */
    public Boolean isShowInGui() {
        return this.showInGui;
    }
    
    /**
    * Optional. Specifies whether the image should appear in the image gallery.
    * @param showInGuiValue The ShowInGui value.
    */
    public void setShowInGui(final Boolean showInGuiValue) {
        this.showInGui = showInGuiValue;
    }
    
    private URI smallIconUri;
    
    /**
    * Optional. Specifies the URI to the small icon that is displayed when the
    * image is presented in the Azure Management Portal. The SmallIconUri
    * element is only available using version 2013-03-01 or higher.
    * @return The SmallIconUri value.
    */
    public URI getSmallIconUri() {
        return this.smallIconUri;
    }
    
    /**
    * Optional. Specifies the URI to the small icon that is displayed when the
    * image is presented in the Azure Management Portal. The SmallIconUri
    * element is only available using version 2013-03-01 or higher.
    * @param smallIconUriValue The SmallIconUri value.
    */
    public void setSmallIconUri(final URI smallIconUriValue) {
        this.smallIconUri = smallIconUriValue;
    }
}
