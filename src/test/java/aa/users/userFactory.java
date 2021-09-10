package aa.users;

import java.util.ResourceBundle;

public class userFactory {
    static ResourceBundle user1 = ResourceBundle.getBundle("user");
    public static  user getValidUser() {
        return new user(user1.getString("login"), user1.getString("password"), user1.getString("email"));

    }
}
