package com.example.subscription.subscription;

import org.ldaptive.*;
import org.ldaptive.io.JsonWriter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.StringWriter;
@Service
public class SubscriptionService {
    public String getSubscription(String subscriptionId, String subscribedEvent, String ssnsai) throws LdapException, IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        SearchOperation search = new SearchOperation(new DefaultConnectionFactory("ldap://10.14.42.6:389"));
        SearchResponse response = search.execute(SearchRequest.builder()
                    .dn("subscriptionId=100,dc=example,dc=com")
                    .filter("subscriptionId=100")
                    .build());
        jsonWriter.write(response);
        System.out.println(response);
        return  jsonWriter.toString();
    }
}
