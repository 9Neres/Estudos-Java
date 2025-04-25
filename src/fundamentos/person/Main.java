package fundamentos.person;

public class Main {
    public static void main ( String [] agrs){
        Person pessoa1 = new Person();
        pessoa1.setNome("Ana");
        pessoa1.setIdade(25);
        pessoa1.setCidade("São Paulo");

        Person pessoa2 = new Person();
        pessoa2.setNome("Luiza");
        pessoa2.setIdade(18);
        pessoa2.setCidade("Goiânia");

        showPerson(pessoa1);
        showPerson(pessoa2);
    }

    public static void showPerson( Person person){
        switch (person.getNome()) {
            case "Ana" -> {
                System.out.println("Dados da primeira pessoa:");
                System.out.println(person.getNome());
                System.out.println(person.getIdade());
                System.out.println(person.getCidade());
                System.out.println("\n");
            }
            case "Luiza" -> {
                System.out.println("Dados da segunda pessoa:");
                System.out.println(person.getNome());
                System.out.println(person.getIdade());
                System.out.println(person.getCidade());
                System.out.println("\n");
            }
        }
    }
}
