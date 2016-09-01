package com.luxoft;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by qtr-ptc-9 on 9/1/2016.
 */
public class ExchangeControllerTest {

    @Test
    public void testExchangeRate() throws Exception {
        ExchangeController controller = new ExchangeController();

        assertEquals("not supported", controller.exchangeRate("pln"));
        assertEquals("1.00", controller.exchangeRate("usd"));
    }
}