package JavaAssignment;
import java.util.Scanner;
import java.util.ArrayList;


class Student
{
    private String id;
    private String name;
    private String age;
    private String address;
    private String grade;
    //Making Student Details as Private
    public Student() { }

    public Student(String id, String name, String age, String address,String grade ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.grade = grade;
        //Used to return current class instance variable
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;

    }
}

class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Creates an object of Scanner
        ArrayList<Student> arr = new ArrayList<Student>();
        //Create ArrrayList of Students

        while (true) {
            System.out.println();
            print();
            System.out.print("Please enter operation: ");
            //Enter numeric digits for operation
            int what = scanner.nextInt();
            //Takes input from Keyboard

            switch (what) {
                //Case statement within Switch Block
                case 1:
                    addStu(arr);
                    break;
                case 2:
                    setStu(arr);
                    break;
                case 3:
                    deleteStu(arr);
                    break;
                case 4:
                    allStu(arr);
                    break;
                case 5: {
                    System.out.println("Welcome to use again!");
                    return;

                }
            }
        }
    }


    private static void print() {
        System.out.println("*** Welcome to the student management system ***");
        System.out.println("*** 1: Add student ***");
        System.out.println("*** 2: Revise student information ***");
        System.out.println("*** 3: Delete student ***");
        System.out.println("*** 4: View all student information ***");
        System.out.println("*** 5: Exit ***");
    }
    //Put the information about Student by pressing the required number

    private static void addStu(ArrayList<Student> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student ID: ");
        //Enter numeric Student Id of any Student
        String id = scanner.nextLine();

        for (Student stu : arr) {
            if (stu.getId().equals(id)) {
                System.out.println("Student already exists!");
                //If Student Id same it shows already Student is there of same ID
                return;
            }
        }

        System.out.print("Please enter the student's name: ");
        //Enter Alphabet Student name
        String name = scanner.nextLine();

        System.out.print("Please enter student age: ");
        //Enter numeric Student age
        String age = scanner.nextLine();

        System.out.print("Please enter student address: ");
        //Enter Alphabet Student Adddress
        String address = scanner.next();

        System.out.print("Please enter student grade[A+,A,A-,B,B-C+,C,C-F]:");
        //Enter Grade of specified above type
        String grade = scanner.next();

        Student stu = new Student(id, name, age, address, grade);
        if (arr.add(stu)) {
            System.out.println("Added successfully!");
        } else {
            System.out.println("add failed!");
        }
    }

    private static void deleteStu(ArrayList<Student> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the student ID to be deleted: ");
        //Enter Student Id which we want to Delete
        String id = scanner.nextLine();

        for (Student stu : arr) {
            if (stu.getId().equals(id)) {
                if (arr.remove(stu))
                    System.out.println("successfully deleted!");
                return;
            }
        }
        System.out.println("Deletion failed! No such student!");
        //If Entered Incorrect then deletion will be failed.
    }

    private static void setStu(ArrayList<Student> arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the student ID to be modified: ");
        //Enter Student Id which we have to change some things
        String id = scanner.nextLine();

        for (Student stu : arr) {
            if (stu.getId().equals(id)) {
                System.out.print("Please enter the name to be modified: ");
                String name = scanner.nextLine();
                stu.setName(name);

                System.out.print("Please enter the age to be modified: ");
                String age = scanner.nextLine();
                stu.setAge(age);

                System.out.print("Please enter the address to be modified: ");
                String address = scanner.next();
                stu.setAddress(address);

                System.out.print("Please enter the grade to be modified[A+,A,A-,B,B-C+,C,C-F]:");
                String grade = scanner.next();
                stu.setGrade(grade);

                System.out.println("Successfully modified!");
                return;
            }
        }
        System.out.println("Modification failed! No such student!");
        //If entered incorrect then changing not take place
    }


    private static void allStu(ArrayList<Student> arr) {
        String[] gradeValue = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "F"};
        if (arr.size() == 0) {
            System.out.println("No students");
            //If we do not entered above grade in any type of Student then it will show No Students of that Grade is there
            return;
        }
        for (int i = 0; i < gradeValue.length; i++) {

            for (Student stu : arr) {
                if (stu.getGrade().equals(gradeValue[i])) {
                    System.out.println("Sorted by Grades\n");
                    System.out.printf("student ID: " + stu.getId() + " Name: " + stu.getName() + " Age: " + stu.getAge() + " Address: " + stu.getAddress() + " Grade: " + stu.getGrade() + "\n");
                    //It will print sorting by grade like A,A+ of Students
                }
            }
        }
    }
}