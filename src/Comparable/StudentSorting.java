package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorting {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(102,"Manoj","Guntur"));
        studentList.add(new Student(101,"Swapna","Hyderabad"));
        studentList.add(new Student(100,"Vissu","Kakinada"));

        System.out.println(studentList);

        Collections.sort(studentList);

        System.out.println(studentList);
    }
}
