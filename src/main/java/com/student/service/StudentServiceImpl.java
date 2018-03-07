package com.student.service;

import com.student.dao.StudentRepository;
import com.student.entity.StudentEntity;
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
}
