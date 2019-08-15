package io.project.app.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;

@MessageEndpoint
@Slf4j
public class BitcoinService {

    @ServiceActivator(inputChannel = "bitcoin.channel")
    public void recieveMessage(Message<?> message) throws MessagingException {        
        log.info("****************Bitcoin.channel*****************");
        log.info("Message " + message);
        log.info("*******************************");
        log.info("Payload " + message.getPayload());
        
    }
}
