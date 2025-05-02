package fundamentos.pooBasic.collectionEstudos.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> listPessoa;

    public OrdenacaoPessoas() {
        this.listPessoa = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listPessoa.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){ // Comparable
        List<Pessoa> ordemIdade = new ArrayList<>(listPessoa);

        if(!listPessoa.isEmpty()){
            Collections.sort(ordemIdade); // sort ordena por idade, logica na classe pessoa
            return ordemIdade;
        }else{
            throw new RuntimeException("Lista vazia" + ordenarPorIdade());
        }
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> ordemAltura = new ArrayList<>(listPessoa);

        if(!listPessoa.isEmpty()){
            Collections.sort(ordemAltura, new CompareAltura());
            return ordemAltura;
        }else{
            throw new RuntimeException("erro:" + ordemAltura);
        }
    }

    public static void main (String [] args){

        var ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.listPessoa);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
