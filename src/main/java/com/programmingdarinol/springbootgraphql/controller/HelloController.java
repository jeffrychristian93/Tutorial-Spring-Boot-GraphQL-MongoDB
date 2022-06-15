package com.programmingdarinol.springbootgraphql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

  @QueryMapping
  public String getHelloWorld(@Argument String name){
    return "Hello " + name;
  }
}
