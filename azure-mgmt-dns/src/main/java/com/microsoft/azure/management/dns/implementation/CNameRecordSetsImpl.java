/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.dns.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.dns.CNameRecordSet;
import com.microsoft.azure.management.dns.CNameRecordSets;
import com.microsoft.azure.management.dns.RecordType;
import rx.Observable;

/**
 * Implementation of CNameRecordSets.
 */
@LangDefinition
class CNameRecordSetsImpl
        extends DnsRecordSetsBaseImpl<CNameRecordSet, CNameRecordSetImpl>
        implements CNameRecordSets {

    private final DnsZoneImpl dnsZone;

    CNameRecordSetsImpl(DnsZoneImpl dnsZone) {
        this.dnsZone = dnsZone;
    }

    @Override
    public CNameRecordSet getByName(String name) {
        RecordSetInner inner = this.parent().manager().inner().recordSets().get(
                this.parent().resourceGroupName(),
                this.parent().name(),
                name,
                RecordType.CNAME);
        return new CNameRecordSetImpl(this.parent(), inner);
    }

    @Override
    protected PagedList<CNameRecordSet> listIntern(String recordSetNameSuffix, Integer pageSize) {
        return super.wrapList(this.parent().manager().inner().recordSets().listByType(
                this.parent().resourceGroupName(),
                this.parent().name(),
                RecordType.CNAME,
                pageSize,
                recordSetNameSuffix));
    }

    @Override
    protected Observable<CNameRecordSet> listInternAsync(String recordSetNameSuffix, Integer pageSize) {
        return wrapPageAsync(this.parent().manager().inner().recordSets().listByTypeAsync(
                this.dnsZone.resourceGroupName(),
                this.dnsZone.name(),
                RecordType.CNAME));
    }

    @Override
    protected CNameRecordSetImpl wrapModel(RecordSetInner inner) {
        return new CNameRecordSetImpl(this.parent(), inner);
    }

    @Override
    public DnsZoneImpl parent() {
        return this.dnsZone;
    }
}