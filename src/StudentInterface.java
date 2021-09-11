package XgileItJavaAssignments;

import java.util.List;

import Student.StudentDetail;

public interface StudentInterface {
    //student objects

    List<StudentDetail> findAllStudents();
    void addNewStudent(StudentDetail student);
    char findGradeForStudent(int studentId);
    void printStudentsByGrade();
    List<StudentDetail> deleteStudent(int id);
}