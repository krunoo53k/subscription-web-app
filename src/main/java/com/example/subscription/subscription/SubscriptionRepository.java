package com.example.subscription.subscription;

import org.ldaptive.LdapEntry;
import org.ldaptive.beans.reflect.DefaultLdapEntryMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



public class SubscriptionRepository{

    public  ResponseEntity addSubscription(Subscription subscription, Integer subscriptionId){
        //treba se spojit na bazu nekako u repo, to moram skontat kako

        DefaultLdapEntryMapper<Snssai> snssaiDefaultLdapEntryMapper = new DefaultLdapEntryMapper<>();
        LdapEntry snssaiLdapEntry = new LdapEntry();
        snssaiDefaultLdapEntryMapper.map(subscription.getSnssai(), snssaiLdapEntry);

        DefaultLdapEntryMapper<Subscription> subscriptionMapper = new DefaultLdapEntryMapper<>();
        LdapEntry subscriptionLdapEntry = new LdapEntry();
        subscriptionMapper.map(subscription, subscriptionLdapEntry);
        subscriptionLdapEntry.setDn("subscriptionId="+ subscriptionId + ",dc=example,dc=com");

        return new ResponseEntity("Request good!", HttpStatus.OK);
    }
}
