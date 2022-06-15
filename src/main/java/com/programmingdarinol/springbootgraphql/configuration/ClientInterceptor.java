package com.programmingdarinol.springbootgraphql.configuration;

import org.springframework.graphql.client.ClientGraphQlRequest;
import org.springframework.graphql.client.ClientGraphQlResponse;
import org.springframework.graphql.client.GraphQlClientInterceptor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ClientInterceptor implements GraphQlClientInterceptor {

  @Override
  public Mono<ClientGraphQlResponse> intercept(ClientGraphQlRequest request, Chain chain) {
    // ...
    return chain.next(request);
  }

  @Override
  public Flux<ClientGraphQlResponse> interceptSubscription(ClientGraphQlRequest request, SubscriptionChain chain) {
    // ...
    return chain.next(request);
  }
}
