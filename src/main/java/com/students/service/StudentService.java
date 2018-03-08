package com.students.service;

import com.students.dao.entity.SaveStudentRequest;
import com.students.dao.entity.StudentEntity;

public interface StudentService {

    void save(StudentEntity studentEntity);
    void saveAll(SaveStudentRequest saveStudentRequest);
}
