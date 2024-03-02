package src.hw.stream;

import src.hw.user.UserGroup;

import java.util.ArrayList;
import java.util.List;

public class StreamService<T extends UserGroup> {
    private Stream stream;

    public List<UserGroup> getSortedStreamBySize(){
        List<UserGroup> groupList = new ArrayList<>(stream.getUserGroupList());
        groupList.sort(new StreamComparator());
        return groupList;
    }

}
