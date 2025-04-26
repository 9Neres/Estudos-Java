package fundamentos.testandoArray;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main ( String [] args){
        List<User> users = List.of(new User("João", 21), new User("Ana", 12), new User("Caua", 18), new User("Vasquez", 29));

        users.forEach(new Consumer<User>() {
            @Override
            public void accept(final User user){
                System.out.println(user); // forma mais robusta
            }
        });

        users.forEach(( User user ) ->{
            System.out.println(user);  // forma simplifica de fazer o lambida
        });
    }
}
