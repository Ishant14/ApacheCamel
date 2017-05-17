package com.apachecamel.ApacheCamel.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by igaurav on 5/17/2017.
 */
@Component
public class CamelEndpointConstants {

    @Value("${inbound.endpoint}")
    public static  String jmsInboundEndpoint;

    @Value("${outbound.endpoint}")
    public static String jmsOutBoundEndpoint;

}
