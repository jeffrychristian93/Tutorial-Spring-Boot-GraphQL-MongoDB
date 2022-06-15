package com.programmingdarinol.springbootgraphql.service;

import com.programmingdarinol.springbootgraphql.model.Student;
import com.programmingdarinol.springbootgraphql.repository.StudentRepository;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

  @Autowired
  StudentRepository studentRepository;

  @Override
  public Student getStudentById(String id) {
    Optional<Student> result = studentRepository.findById(id);
    if (result.isPresent()) {
      return result.get();
    }
    return null;
  }

  @Override
  public Student addStudent(String name) {
    Student result = studentRepository.save(new Student(null, name));
    return result;
  }

  @Override
  public List<Student> getStudents(Map<String, List<String>> headers) {
    return studentRepository.findAll();
  }
}
