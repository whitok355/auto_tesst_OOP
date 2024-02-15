package auto_tesst_OOP;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    
    private int number;
    private List<Student> studentList;

    public StudentGroup(int number, List<Student>studentList){
        this.number = number;
        this.studentList = studentList;
    }


    //region

    public int getNumber(){
        return this.number;
    }

    public Integer getSizeGroup(){
        return this.studentList.size();
    }
    public List<Student> getStudentList(){
        return this.studentList;
    }
    public void setStudentList(List<Student> newSetStudentList){
        this.studentList = newSetStudentList;
    }
    //endregion


    @Override
    public Iterator<Student> iterator() {
        return new GroupIterator(this);
    }

}
