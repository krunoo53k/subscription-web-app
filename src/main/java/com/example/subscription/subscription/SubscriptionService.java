package com.example.subscription.subscription;

import org.ldaptive.*;
import org.ldaptive.io.JsonWriter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.io.StringWriter;
@Service
public class SubscriptionService {
    public String getSubscription(String subscriptionId, String subscribedEvent, String ssnsai) throws LdapException, IOException {
        StringWriter writer = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(writer);
        SearchOperation search = new SearchOperation(new DefaultConnectionFactory("ldap://10.14.42.6:389"));
        SearchResponse response = search.execute(SearchRequest.builder()
                    .dn("subscriptionId="+subscriptionId+",dc=example,dc=com")
                    .filter("subscriptionId="+subscriptionId)
                    .build());
        if (response.entrySize()<=0){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "subscription not found"
            );
        }
        jsonWriter.write(response);
        System.out.println(writer.toString());
        return  writer.toString();
    }
}
