package com.example.subscription.subscription;


import org.ldaptive.beans.Attribute;
import org.ldaptive.beans.Entry;

@Entry(
        dn = "subscriptionId",
        attributes = {
                @Attribute(name = "supis", property = "supis"),
                @Attribute(name = "interGrpId", property = "interGrpId"),
                @Attribute(name = "notifMethod", property = "notifMethod"),
                @Attribute(name = "anyUeInd", property = "anyUeInd"),
                @Attribute(name = "dnn", property = "dnn"),
                @Attribute(name = "subscribedEvents", property = "subscribedEvents"),
                @Attribute(name = "subsNotifUri", property = "subsNotifUri"),
                @Attribute(name = "subsNotifId", property = "subsNotifId"),
                @Attribute(name = "maxReportNbr", property = "maxReportNbr"),
                @Attribute(name = "expiry", property = "expiry"),
                @Attribute(name = "repPeriod", property = "repPeriod"),
                @Attribute(name = "suppFeat", property = "suppFeat"),
        }
)
public class Subscription {
    private String[] supis;
    private String interGrpId;
    private boolean anyUeInd;
    private String notifMethod;
    private String dnn;
    private String[] subscribedEvents;
    private String subsNotifUri;
    private String subsNotifId;
    private int maxReportNbr;
    private String expiry;
    private int repPeriod;
    private String suppFeat;
    private Snssai snssai;
    private EventFilters[] eventFilters;
}
