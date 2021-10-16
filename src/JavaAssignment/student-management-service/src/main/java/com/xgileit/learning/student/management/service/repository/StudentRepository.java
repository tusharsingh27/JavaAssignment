package com.xgileit.learning.student.management.service.repository;

import com.xgileit.learning.student.management.service.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>{
}
