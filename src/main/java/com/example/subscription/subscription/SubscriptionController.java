package com.example.subscription.subscription;

import org.ldaptive.LdapException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(path = "student-test-app/v1")
public class SubscriptionController {
    private final SubscriptionService subscriptionService;
    @Autowired
    public SubscriptionController(SubscriptionService subscriptionService) { this.subscriptionService = subscriptionService; }

    @GetMapping(path = "{subscriptionId}")
    public String getSubscription(
            @PathVariable("subscriptionId") String subscriptionId,
            @RequestParam(required = false) String  subscribedEvent,
            @RequestParam(required = false ) String ssnsai
    ) throws IOException, LdapException {
    return subscriptionService.getSubscription(subscriptionId, subscribedEvent, ssnsai);
    }
}
