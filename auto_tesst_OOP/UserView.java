package auto_tesst_OOP;

import java.util.List;

public interface UserView <T extends User>{
    void sendOnConsole(List<T> list);
}
