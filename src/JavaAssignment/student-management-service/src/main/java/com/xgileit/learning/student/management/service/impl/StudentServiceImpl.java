package com.xgileit.learning.student.management.service.impl;

import com.xgileit.learning.student.management.service.entity.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    List<Student>list;
    public StudentServiceImpl() {

        list = new ArrayList<>();
        list.add(new Student(14, "Satish", "Lucknow"));
        list.add(new Student(15, "Anil", "Agra"));
    }
        @Override
        public List<Student> getStudent()
    {
            return list;
        }
    }









