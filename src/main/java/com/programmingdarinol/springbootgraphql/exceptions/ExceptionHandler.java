package com.programmingdarinol.springbootgraphql.exceptions;

import graphql.GraphQLError;
import graphql.GraphqlErrorBuilder;
import graphql.schema.DataFetchingEnvironment;
import java.util.ArrayList;
import java.util.List;
import org.springframework.graphql.execution.DataFetcherExceptionResolver;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ExceptionHandler implements
    DataFetcherExceptionResolver {

  @Override
  public Mono<List<GraphQLError>> resolveException(Throwable exception,
      DataFetchingEnvironment environment) {
    List<GraphQLError> list = new ArrayList<>();
    list.add(GraphqlErrorBuilder.newError().message("AA", "bb").build());
    return Mono.justOrEmpty(list);
  }
}
