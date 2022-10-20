package com.example.subscription.subscription;

import org.springframework.data.ldap.repository.LdapRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SubscriptionRepository extends LdapRepository<Subscription> {
    /*
        Optional<Subscription> findSubscriptionByDn(String dn){
        Implementation needed
        }
        */
}
