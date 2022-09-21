package com.pedrobacchini.springcloudstarterstreamkafka.oldway;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.UUID;

@Component("hollaProducer")
@RequiredArgsConstructor
public class HollaProducer {

    private final StreamBridge streamBridge;

    public void send(String event) {

        var headers = new HashMap<String, Object>();
        headers.put("eventId", UUID.randomUUID().toString().getBytes());
        headers.put("correlationId", UUID.randomUUID().toString().getBytes());

        var message = MessageBuilder.createMessage(event, new MessageHeaders(headers));

        streamBridge.send("holla", message);
    }
}
