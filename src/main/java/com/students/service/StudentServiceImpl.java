package com.students.service;

import com.students.dao.StudentRepository;
import com.students.dao.entity.SaveStudentRequest;
import com.students.dao.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public void save(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
    }

    @Override
    public void saveAll(SaveStudentRequest saveStudentRequest) {
     studentRepository.saveAll(saveStudentRequest.getStudents());
    }
}
