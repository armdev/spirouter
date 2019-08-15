package io.project.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.router.PayloadTypeRouter;
import org.springframework.messaging.MessageChannel;

import io.project.app.model.BitcoinModel;
import io.project.app.model.PaypalModel;

@Configuration
@EnableIntegration
@IntegrationComponentScan
public class RouterConfig {

	@Bean
	public MessageChannel recieverChannel() {
		return new DirectChannel();
	}

	
	@ServiceActivator(inputChannel = "router.channel")
	@Bean
	public PayloadTypeRouter payloadRouter() {
		PayloadTypeRouter router = new PayloadTypeRouter();
		router.setChannelMapping(PaypalModel.class.getName(), "paypal.channel");
		router.setChannelMapping(BitcoinModel.class.getName(), "bitcoin.channel");
		return router;
	}

}