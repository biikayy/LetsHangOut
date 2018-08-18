package commain.wixsite.brunellekama.lets_hang_out;

import java.util.HashMap;

public class Database {
    private HashMap<String, String> username_to_password;
    private HashMap<String, User> username_to_users;


    public User getUser(String username, String password) {
        if (this.username_to_password.containsKey(username) &&
                (this.username_to_users.containsKey(username))) {
            if (this.username_to_password.get(username).equals(password)) {
                User user = username_to_users.get(username);
                return user;
            }
            else {
                throw new java.lang.Error("Password incorrect");
            }
        }
        else {
            throw new java.lang.Error("Username not found");
        }
    }
}
