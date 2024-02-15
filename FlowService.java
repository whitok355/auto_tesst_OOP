package auto_tesst_OOP;

import java.util.ArrayList;
import java.util.List;

public class FlowService {
    
    private StudentFlow flow;

    public List<StudentGroup> getSortedFlow(){

        List<StudentGroup> listSortFlow = new ArrayList<>(flow.getFLowGroups());
        
        listSortFlow.sort(new StreamComparator());

        return listSortFlow;

    }
}