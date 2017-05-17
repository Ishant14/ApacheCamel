package com.apachecamel.ApacheCamel.camelroute;

import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by igaurav on 5/17/2017.
 */
@Component
public class JmsRoute extends RouteBuilder {

    static final Logger log = LoggerFactory.getLogger(JmsRoute.class);

    @Value("${outbound.loop.count}")
    private String loopCount;

    @Override
    public void configure() throws Exception {
        from("{{inbound.endpoint}}")
                .transacted()
                .log(LoggingLevel.INFO,log,"Recieved Message")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        log.info("Exchange: {}", exchange.getIn().getBody());
                    }
                })
                .loop()
                .simple(loopCount)
                .to("{{outbound.endpoint}}")
                .log(LoggingLevel.INFO, log, "Message Sent. Iteration : ${property.CamelLoopIndex}")
                .end();

    }
}
