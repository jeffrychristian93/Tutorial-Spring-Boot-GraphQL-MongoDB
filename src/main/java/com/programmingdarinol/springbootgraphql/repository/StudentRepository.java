package com.programmingdarinol.springbootgraphql.repository;

import com.programmingdarinol.springbootgraphql.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
