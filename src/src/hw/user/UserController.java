package src.hw.user;

public interface UserController<T extends User> {
    void create(String firstName, String lastName, String middleName);

}
