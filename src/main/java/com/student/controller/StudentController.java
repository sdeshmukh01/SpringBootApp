package com.student.controller;

import com.student.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
    public void save(@RequestBody StudentEntity studentEntity){

    }
}
