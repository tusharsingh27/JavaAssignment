package Student;

import Student.StudentDetail;
import Student.StudentRecords;

public class StudentMainClass {

    public static void main(String args[]) {
        StudentRecords stuRecordsObj = new StudentRecords();
        stuRecordsObj.addNewStudent(new StudentDetail(1, "Tushar", "Singh", 'A'));
        stuRecordsObj.addNewStudent(new StudentDetail(2, "abc", "iii", 'B'));
        stuRecordsObj.addNewStudent(new StudentDetail(3, "xyz", "aaa", 'C'));
        stuRecordsObj.addNewStudent(new StudentDetail(4, "def", "sss", 'B'));
        System.out.println(stuRecordsObj.findAllStudents());
        System.out.println(stuRecordsObj.findGradeForStudent(3));
        stuRecordsObj.printStudentsByGrade();
        stuRecordsObj.deleteStudent(1);
        System.out.println(stuRecordsObj.findAllStudents());
    }
}