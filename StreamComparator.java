package auto_tesst_OOP;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup>{

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getSizeGroup().compareTo(o2.getSizeGroup());
    }

}
