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
        User user2 = new User("Olga");
        Optional<User> optionalUser = Optional.ofNullable(user);
        String userName = optionalUser.map(User::getName).orElse("DEFAULT");
        System.out.println(userName);
        Optional<User> optionalUser2 = Optional.ofNullable(user2);
        String user2Name = optionalUser2.map(User::getName).orElse("DEFAULT");
        System.out.println(user2Name);
    }
}
