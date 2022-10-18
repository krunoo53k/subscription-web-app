package com.example.subscription.subscription;

import org.ldaptive.beans.Attribute;
import org.ldaptive.beans.Entry;

@Entry(
        dn= "snssaiId",
        attributes = {
                @Attribute(name="sst", property = "sst"),
                @Attribute(name="sd", property = "sd"),
        }
)
public class Snssai {
    private int sst;
    private String sd;
}
