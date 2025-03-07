package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorting {

    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(101,"Swapna","Hyderabad"));
        studentList.add(new Student(102,"Manoj","Guntur"));
        studentList.add(new Student(100,"Vissu","Kakinada"));

        System.out.println(studentList);

        NameComparator nameComparator = new NameComparator();
        Collections.sort(studentList,nameComparator);

        System.out.println(studentList);

        IdComparator idComparator = new IdComparator();
        Collections.sort(studentList,idComparator);
        System.out.println(studentList);


    }
}
