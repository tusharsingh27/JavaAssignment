package com.xgileit.learning.student.management.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity annotation indicates that the class is a persistent Java class.
//@Table annotation provides the table that maps this entity.
//@Id annotation is for the primary key.
//@Column annotation is used to define the column in database that maps annotated field.

    @Entity
    @Table(name="xgileitstudent")
    public class Student {

        @Id
        @Column(name="sid")
        private int studentId;

        @Column(name="sname")
        private String studentName;

        @Column(name="scity")
        private String studentCity;

        public Student(int studentId,String studentName,String studentCity) {
            this.studentId = studentId;
            this.studentName=studentName;
            this.studentCity=studentCity;
        }

        public Student(){}

        //Using getter and setter
        public int getStudentId() {
            return studentId;
        }
        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }
        public String getStudentName() {
            return studentName;
        }
        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }
        public String getStudentCity() {
            return studentCity;
        }
        public void setStudentCity(String studentCity) {
            this.studentCity = studentCity;
        }

        @Override
        public String toString() {
            return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity + "]";
        }
        public static boolean isPresent() {
            return false;
        }
    }

