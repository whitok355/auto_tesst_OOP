package auto_tesst_OOP;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {

    private int count;
    private final List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.count = 0;
        this.studentList = studentGroup.getUserList();
    }

    @Override
    public boolean hasNext() {
        return count < studentList.size() -1;
    }

    @Override
    public Student next() {
        if(!hasNext()){
            return null;
        }
        count++;
        return studentList.get(count);
    }

    @Override
    public void remove() {
        studentList.remove(count);
    }
}
