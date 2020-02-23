package lecture10.homework.service.users;


import lecture10.homework.repository.user.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUser(int id);

    User getUser(int id);

    List<User> getAllUsers();

    void update(User user);

    void playSong(int id, int songId);
}
