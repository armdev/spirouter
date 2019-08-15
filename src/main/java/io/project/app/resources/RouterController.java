package io.project.app.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.project.app.model.BitcoinModel;
import io.project.app.model.PaypalModel;
import io.project.app.services.PaymentGateway;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v2/integrate")
public class RouterController {

    @Autowired
    private PaymentGateway integrationGateway;

    @PostMapping("/paypal")
    public ResponseEntity<?> processPaymentPaypal(@RequestBody PaypalModel paypalModel) {
        integrationGateway.process(paypalModel);
        return ResponseEntity.status(HttpStatus.OK).body("Paypal Processing started");
    }

    @PostMapping("/bitcoin")
    public ResponseEntity<?> processBitcoinPayment(@RequestBody BitcoinModel bitcoinModel) {
        integrationGateway.process(bitcoinModel);
        return ResponseEntity.status(HttpStatus.OK).body("Bitcoin Processing started");
    }
}
