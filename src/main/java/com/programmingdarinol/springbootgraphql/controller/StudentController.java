package com.programmingdarinol.springbootgraphql.controller;

import com.programmingdarinol.springbootgraphql.model.Student;
import com.programmingdarinol.springbootgraphql.service.StudentService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.ContextValue;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

  @Autowired
  private StudentService studentService;

  @QueryMapping
  public Student getStudentById(@Argument String id){
    return studentService.getStudentById(id);
  }

  @MutationMapping
  public Student addStudent(@Argument String name){
    Student student = studentService.addStudent(name);
    return student;
  }

  @QueryMapping
  public List<Student> getStudents(@ContextValue Map<String , List<String>> headers){
    return studentService.getStudents(headers);
  }
}
