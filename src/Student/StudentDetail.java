package Student;

import java.util.Objects;
    public class StudentDetail implements Comparable<StudentDetail>{

        int studentId;
        String firstName;
        String lastName;
        char grade;

        public StudentDetail(int studentId, String firstName, String lastName ,char grade)
        {
            super();
            this.studentId = studentId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade   = grade;
        }
        public int getStudent(int id) {
            return studentId;
        }
        public void setstudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getfirstName(String firstName) {
            return firstName;
        }
        public void setfirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getlastName(String lastName) {
            return lastName;
        }
        public void lastName(String lastName) {
            this.lastName = lastName;
        }

        public char getgrade(char grade) {
            return grade;
        }
        public void setgrade(char grade) {
            this.grade = grade;
        }



        @Override
        public int hashCode() {
            return Objects.hash(firstName, grade, lastName, studentId);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            StudentDetail other = (StudentDetail) obj;
            return Objects.equals(firstName, other.firstName) && grade == other.grade
                    && Objects.equals(lastName, other.lastName) && studentId == other.studentId;
        }
        @Override
        public String toString() {
            return "StudentDetail [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
                    + ", grade=" + grade + "]";
        }
        @Override
        public int compareTo(StudentDetail obj) {
            return this.grade-obj.grade;
        }


    }
