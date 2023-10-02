package dz3.users;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        if(!user.getAuthenticate()){
          return;
        }
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logOutAllOrdinaryUsers(){
        for (User user : data){
            if (!user.isAdmin()){
                user.setAuthenticate(false);
            }
        }
    }

}