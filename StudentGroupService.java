package auto_tesst_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    
    private StudentGroup group;

    public void removeStudentByFIO(String firstName, String lastName){
        Iterator<Student> iterator = group.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();

            if(
                student.getFirstName().equals(firstName) 
                && student.getLastName().equals(lastName)
                ){
                    iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList(){
        List<Student> sortList =  new ArrayList<>(group.getStudentList());

        Collections.sort(sortList);
        
        return sortList;

    }
    

    public List<Student> getSortedByFIO(){
        List<Student> studentList = new ArrayList<>(group.getStudentList());
        studentList.sort(new StudentComparator());

        return studentList;

        
    }
}
