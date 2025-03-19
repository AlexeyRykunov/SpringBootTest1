package com.example.springboottest1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/exchange-rates")
    public ResponseEntity<ExchangeRatesResponse> getExchangeRates(
            @RequestParam String exchange,
            @RequestParam long amount
    ) {
        double rateToRUB = 0.0;

        switch (exchange) {
            case "RUB":
                rateToRUB = 1.0;
                break;

            case "USD":
                rateToRUB = 82.85;
                break;
            case "EUR":
                rateToRUB = 90.83;
                break;
            case "CNY":
                rateToRUB = 11.43;
                break;
            case "KZT":
                rateToRUB = 0.17;
                break;
            case "TRY":
                rateToRUB = 2.26;
                break;
            case "AED":
                rateToRUB = 22.56;
                break;
            case "BYN":
                rateToRUB = 27.18;
                break;
            case "JPY":
                rateToRUB = 0.55;
                break;

        }

        ExchangeRatesResponse response = new ExchangeRatesResponse(amount, rateToRUB);
        return ResponseEntity.ok(response);
    }
}
