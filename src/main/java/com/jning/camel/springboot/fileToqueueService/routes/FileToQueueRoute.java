package com.jning.camel.springboot.fileToqueueService.routes;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileToQueueRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        // define a Camel REST service using the rest-dsl
        // where we define a GET /hello as a service that routes to the hello route
        // we will cover rest-dsl in chapter 10

//        from("file:C:\\jning\\Labs\\CamelInAction\\Springboot\\file_jms\\data")
        from("file:src/data?noop=true")
                .log(LoggingLevel.INFO, log, "New message received")
                .to("{{output.queue}}")
                .log(LoggingLevel.INFO, log, "Message is successfully sent to the output queue");
    }
}
