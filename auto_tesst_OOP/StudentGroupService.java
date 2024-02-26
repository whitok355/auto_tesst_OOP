package auto_tesst_OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        Iterator<Student> iterator = studentGroup.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName) && student.getMiddleName().equals(middleName)){
                iterator.remove();
            }
        }
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = new ArrayList<>(studentGroup.getUserList());
        Collections.sort(studentList);
        return studentList;
    }

    public  List<Student> getSortedStudentByFIO(){
        List<Student> studentList = new ArrayList<>(studentGroup.getUserList());
        studentList.sort(new UserComparator<Student>());
        return studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
