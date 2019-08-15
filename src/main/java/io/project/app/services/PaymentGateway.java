package io.project.app.services;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
public interface PaymentGateway {

    @Gateway(requestChannel = "router.channel")
    public <T> void process(T object);
}
