package com.pedrobacchini.springcloudstarterstreamkafka.newway;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("helloFunctional")
public class ConsumerListener implements Consumer<String> {

    @Override
    public void accept(final String value) {
        System.out.println("helloFunctional: " + value);
    }

}
