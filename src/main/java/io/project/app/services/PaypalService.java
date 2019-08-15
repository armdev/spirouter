package io.project.app.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;

@MessageEndpoint
@Slf4j
public class PaypalService {

    @ServiceActivator(inputChannel = "paypal.channel")
    public void recieveMessage(Message<?> message) throws MessagingException {
        log.info("#########Paypal.channel#############");
        log.info("Message " + message);
        log.info("######################");
        log.info("Payload " + message.getPayload());
    }
}
