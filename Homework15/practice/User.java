package Homework15.practice;
import java.util.Optional;
public class User {
    public String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        User user = null;
        Optional<User> optionalUser = Optional.ofNullable(user);
        String userName = optionalUser.map(User::getName).orElse("DEFAULT");
        System.out.println(userName);
    }
}
