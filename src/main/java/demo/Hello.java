package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

@Data
@AllArgsConstructor
class User {
    String name;
    String email;
}

public class Hello {

    public static void main(String[] args) {

        User user1 = new User("Freewind", "freewind@test.com");
        User user2 = new User("Freewind", "freewind@test.com");

        System.out.println("### user1:" + user1);
        System.out.println("### user2:" + user2);
        System.out.println("### equals:" + user1.equals(user2));
    }

}
