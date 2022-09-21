package com.pedrobacchini.springcloudstarterstreamkafka.oldway;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;

import javax.validation.Valid;

//@Component
@RequiredArgsConstructor
public class HelloListener {

    private final HollaProducer hollaProducer;

    @StreamListener(value = ListenedEvents.Kafka.Hello.HELLO_CONSUMER)
    public void handle(@Valid String message) {
        System.out.println(message);
        hollaProducer.send(message);
    }

}
