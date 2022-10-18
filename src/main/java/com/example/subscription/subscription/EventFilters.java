package com.example.subscription.subscription;

import org.ldaptive.beans.Attribute;
import org.ldaptive.beans.Entry;

@Entry(
        dn="entryId",
        attributes = {
                @Attribute(name = "instanceTypes"),
                @Attribute(name = "transProtocols"),
                @Attribute(name = "ptpProfiles"),
        }
)
public class EventFilters {
    private String[] instanceTypes;
    private String[] transProtocols;
    private String[] ptpProfiles;
}
