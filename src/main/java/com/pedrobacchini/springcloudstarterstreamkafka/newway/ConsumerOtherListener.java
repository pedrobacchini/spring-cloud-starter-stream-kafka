package com.pedrobacchini.springcloudstarterstreamkafka.newway;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component("helloOther")
public class ConsumerOtherListener implements Consumer<String> {

    @Override
    public void accept(final String value) {
        System.out.println("helloOther: " + value);
    }

}
