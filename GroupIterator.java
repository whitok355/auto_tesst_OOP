package auto_tesst_OOP;

import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<Student>{

    private int index = 0; 
    
    
    private final List<Student> studentList;

    public GroupIterator(StudentGroup studentGroup){
        this.index = 0;
        this.studentList = studentGroup.getStudentList();
    }
    
    @Override
    public boolean hasNext() {
        return studentList.size() > this.index;
    }

    @Override
    public Student next() {
        if(!this.hasNext()){
            return null;
        } 
        this.index++;
        return this.studentList.get(index);
    }

    @Override
    public void remove() {
        this.studentList.remove(this.index);
    }
    
}
