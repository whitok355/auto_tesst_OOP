package auto_tesst_OOP;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        int resultOfComporator = o1.getFirstName().compareTo(o2.getFirstName());
            if(resultOfComporator == 0){
                return o1.getLastName().compareTo(o2.getLastName());
            } else{
                return resultOfComporator;
            }
    }

    
}
