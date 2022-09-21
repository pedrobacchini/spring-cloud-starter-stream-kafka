package com.pedrobacchini.springcloudstarterstreamkafka.listeners;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InputChannels {

    @Input(ListenedEvents.Kafka.Hello.HELLO_CONSUMER)
    SubscribableChannel helloChanel();

}
