package com.students.controller;

import com.students.dao.entity.SaveStudentRequest;
import com.students.dao.entity.StudentEntity;
import com.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    public void save(@RequestBody StudentEntity studentEntity){
        studentService.save(studentEntity);
    }

    @RequestMapping(value = "/saveAll", method = RequestMethod.POST, consumes = "application/json")
    public void save(@RequestBody SaveStudentRequest saveStudentRequest){
        studentService.saveAll(saveStudentRequest);
    }
}
