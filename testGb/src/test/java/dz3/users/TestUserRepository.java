package dz3.users;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestUserRepository {
    User user;
    UserRepository userRepository;
    List<User>  users;

    @Test
    public void testAddUserTrue(){
        userRepository = new UserRepository();
        user = new User("user", "passwd", false);
        user.setAuthenticate(true);
        userRepository.addUser(user);


        users = new ArrayList<>();
        users.add(user);

        assertThat(userRepository.data).isEqualTo(users);
    }
    @Test
    public void testAddUserFalse(){
        userRepository = new UserRepository();
        user = new User("user", "passwd", false);
        userRepository.addUser(user);

        users = new ArrayList<>();

        assertThat(userRepository.data).isEqualTo(users);
    }
    @Test
    public void testLogOutAllOrdinaryUsers(){
        userRepository = new UserRepository();

        user = new User("user", "passwd", false);
        User userIsAdmin = new User("user1", "passwd1", true);

        user.setAuthenticate(true);
        userIsAdmin.setAuthenticate(true);

        userRepository.addUser(user);
        userRepository.addUser(userIsAdmin);

        users = new ArrayList<>();


//        assertThat(userRepository.data)
    }


}
