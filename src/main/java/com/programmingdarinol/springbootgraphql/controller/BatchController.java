package com.programmingdarinol.springbootgraphql.controller;

import com.programmingdarinol.springbootgraphql.model.Account;
import com.programmingdarinol.springbootgraphql.model.Customer;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.graphql.data.method.annotation.BatchMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
class BatchController {

  @QueryMapping
  Collection<Customer> customers() {
    return List.of(new Customer("1", "A"), new Customer("2", "B"));
  }

  @BatchMapping
  Map<Customer, Account> account(List<Customer> customers) {
    System.out.println("count : " + customers.size() + " customers");
    return customers.stream()
        .collect(Collectors.toMap(customer -> customer,
            customer -> new Account(customer.id())));
  }
}