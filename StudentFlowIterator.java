package auto_tesst_OOP;

import java.util.Iterator;
import java.util.List;

public class StudentFlowIterator implements Iterator<StudentGroup>{

    private int index = 0;

    
    private final List<StudentGroup> groupList;

    public StudentFlowIterator(StudentFlow studentFlow){
        this.index = 0;
        this.groupList = studentFlow.getFLowGroups();
    }

    @Override
    public boolean hasNext() {
        return groupList.size() > this.index;
    }

    @Override
    public StudentGroup next() {
        if(!this.hasNext()){
            return null;
        }
        index++;
        return this.groupList.get(this.index);
    }

    @Override
    public void remove() {
        groupList.remove(this.index);
    }
    
}
