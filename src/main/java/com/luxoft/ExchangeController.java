package com.luxoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qtr-ptc-9 on 9/1/2016.
 */

@RestController
public class ExchangeController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello " + name;
    }

    @GetMapping("/{currency}/exchange-rate")
    public String exchangeRate(@PathVariable String currency) {
        if ("usd".equalsIgnoreCase(currency)) {
            return "1.00";
        }

        return "not supported";
    }
}
