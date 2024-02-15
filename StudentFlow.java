package auto_tesst_OOP;

import java.util.Iterator;
import java.util.List;

public class StudentFlow implements Iterable<StudentGroup>{
    
    private int number;
    private List<StudentGroup> studentGroupsList;

    public StudentFlow(int number, List<StudentGroup> studentGroupsList){
        this.number = number;
        this.studentGroupsList = studentGroupsList;
    }

    // region
    public int getNumberFlow(){
        return this.number;
    }
    public List<StudentGroup> getFLowGroups(){
        return this.studentGroupsList;
    }
    
    public void setNumberFlow(int newNumberFlow){
        this.number = newNumberFlow;
    }

    public void getFLowGroups(List<StudentGroup> newGroup){
        this.studentGroupsList = newGroup;
    }
    // endregion

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentFlowIterator(this);
    }


    
}
