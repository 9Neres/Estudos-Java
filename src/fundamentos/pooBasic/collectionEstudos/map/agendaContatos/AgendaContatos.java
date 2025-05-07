package fundamentos.pooBasic.collectionEstudos.map.agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //trabalhando com genericos do map
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    } //hashmap e muito usada

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
        // "put" serve tanto para adicionar quanto atualizar
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome); // diferente de um for que percorre o map vai achar uma key ao achar ela remove direto
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaNome(String nome){
        Integer numeroPoNome = null;

        if(!agendaContatoMap.isEmpty()){
            numeroPoNome = agendaContatoMap.get(nome);
        }
        return numeroPoNome;
    }

    public static void main (String [] args ){

        var ag = new AgendaContatos();

        // Adicionar contatos
        ag.adicionarContato("Camila", 123456);
        ag.adicionarContato("João", 5665);
        ag.adicionarContato("Carlos", 1111111);
        ag.adicionarContato("Ana", 654987);
        ag.adicionarContato("Maria", 1111111);
        ag.adicionarContato("Camila", 44444);

        ag.exibirContato();

        // Remover um contato
        ag.removerContato("Maria");
        ag.exibirContato();

        // Pesquisar número por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = ag.pesquisaNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = ag.pesquisaNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }


}
