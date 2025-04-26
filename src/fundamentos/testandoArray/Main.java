package fundamentos.testandoArray;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main ( String [] args){

        // Arrays, interface e Lambda

        List<User> users = List.of(new User("João", 21), new User("Ana", 12), new User("Caua", 18), new User("Vasquez", 29));

        List<Account> accounts = List.of(new Account(123, "Paulin@gmail.com\t", "vasco123"), new Account( 721, "lucas.martins82@emailtest.com\t", "filha123"));

        List<Nota> notas = List.of(new Nota(10 , 10 , 10), new Nota(5, 6, 4));

        users.forEach(new Consumer<User>() {
            @Override
            public void accept(final User user){
                System.out.println(user); // forma mais robusta
            }
        });

        System.out.println("\n");

        accounts.forEach(( Account account ) ->{
            System.out.println(account);  // forma simplifica de fazer o lambda
        });

        System.out.println("\n");

        printStringValue(Record :: toString , notas); // outra forma também
    }

    private static void printStringValue(Function<Nota, String> callback, List<Nota> notas ){
        notas.forEach( u -> System.out.println(callback.apply(u))); // estudar como fazer com int ou double
    }
}
