package Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getId() > student1.getId()){
            return 1;
        }
        else if(student1.getId() < student1.getId()){
            return -1;
        }
        else{
            return student1.getId() - student2.getId();
        }
    }
}
