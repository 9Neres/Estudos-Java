package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe Luiz");
        felipe.setIdade(10);
        felipe.setSexo("Macho");

        System.out.println("O aluno: " + felipe.getNome() + " tem " + felipe.getIdade() + " sexo " + felipe.getSexo());
    }
}
