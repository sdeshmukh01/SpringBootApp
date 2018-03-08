package com.students.dao.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by himu on 3/7/2018.
 */
public class SaveStudentRequest implements Serializable{

    List<StudentEntity> students;

    public List<StudentEntity> getStudents() {
        return students;
    }

    public void setStudents(List<StudentEntity> students) {
        this.students = students;
    }
}
