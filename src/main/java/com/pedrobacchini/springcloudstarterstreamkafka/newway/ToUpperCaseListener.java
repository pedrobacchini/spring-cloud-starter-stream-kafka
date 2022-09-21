//package com.pedrobacchini.springcloudstarterstreamkafka.listeners;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import java.util.function.Function;
//
//@Component
//public class ToUpperCaseListener {
//
//    @Bean
//    public Function<String, String> toUpperCase() {
//        return value -> {
//            System.out.println("Uppercasing: " + value);
//            return value.toUpperCase();
//        };
//    }
//
//}
