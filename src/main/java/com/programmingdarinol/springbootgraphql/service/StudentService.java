package com.programmingdarinol.springbootgraphql.service;

import com.programmingdarinol.springbootgraphql.model.Student;
import java.util.List;
import java.util.Map;

public interface StudentService {

  Student getStudentById(String id);
  Student addStudent(String name);
  List<Student> getStudents(Map<String , List<String>> headers);
}
