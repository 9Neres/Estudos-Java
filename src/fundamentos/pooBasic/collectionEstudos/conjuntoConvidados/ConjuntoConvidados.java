package fundamentos.pooBasic.collectionEstudos.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> SetConvidado;

    public ConjuntoConvidados(){
        this.SetConvidado = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codeConvidado){
        SetConvidado.add(new Convidado(nome, codeConvidado));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvidado){
        Convidado removeConvidado = null;
            for(Convidado c : SetConvidado){
                if(c.getCodeConvite() == codigoConvidado){
                    removeConvidado = c;
                    break;
                }
            }
        SetConvidado.remove(removeConvidado);
    }

    public int contarConvidados(){
        return SetConvidado.size();
    }

    public void exibirConvidados(){
        System.out.println(SetConvidado);
    }

    public static void main( String [] args){
        var conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem\t" + conjuntoConvidados.contarConvidados() + "\tDentro do set de convidos");

        // Adicionando convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        // Exibindo os convidados no conjunto
        System.out.println("Convidados no conjunto:");
        conjuntoConvidados.exibirConvidados();

        // Exibindo o número atualizado de convidados no conjunto
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

        // Removendo um convidado do conjunto por código de convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados após a remoção");

        // Exibindo os convidados atualizados no conjunto
        System.out.println("Convidados no conjunto após a remoção:");
        conjuntoConvidados.exibirConvidados();
    }
}
