package com.pedrobacchini.springcloudstarterstreamkafka.config;

import com.pedrobacchini.springcloudstarterstreamkafka.listeners.InputChannels;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {InputChannels.class})
public class KafkaListenerConfig {

}
