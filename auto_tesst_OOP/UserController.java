package auto_tesst_OOP;

public interface UserController<T extends User> {
    void create(String firstName, String lastName, String middleName);

}
