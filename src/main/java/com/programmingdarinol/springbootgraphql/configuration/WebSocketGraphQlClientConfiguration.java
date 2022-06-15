package com.programmingdarinol.springbootgraphql.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.client.WebSocketGraphQlClient;
import org.springframework.web.reactive.socket.client.ReactorNettyWebSocketClient;
import org.springframework.web.reactive.socket.client.WebSocketClient;

@Configuration
public class WebSocketGraphQlClientConfiguration {

  WebSocketClient client = new ReactorNettyWebSocketClient();
  String url = "http://localhost:8080/graphql";

  @Bean
  public WebSocketGraphQlClient graphQlClient(){
    return WebSocketGraphQlClient.builder(url, client)
        .interceptor(new ClientInterceptor())
        .build();
  }


}
