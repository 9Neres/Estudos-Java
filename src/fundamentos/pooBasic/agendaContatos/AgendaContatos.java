package fundamentos.pooBasic.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> AgendaContatosSet;

    public AgendaContatos(){
        this.AgendaContatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        AgendaContatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(AgendaContatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosAgendaNome = new HashSet<>();

        for(Contato c : AgendaContatosSet){
            if(c.getNome().startsWith(nome)){
                contatosAgendaNome.add(c);
            }
        }
        return contatosAgendaNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado =  null;

        for(Contato c : AgendaContatosSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroDeTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String [] args){

        AgendaContatos ag = new AgendaContatos();

        ag.exibirContatos();

        ag.adicionarContato("João", 123456789);
        ag.adicionarContato("Maria", 987654321);
        ag.adicionarContato("Maria Fernandes", 55555555);
        ag.adicionarContato("Ana", 88889999);

        // Pesquisando contatos pelo nome
        System.out.println(ag.pesquisarPorNome("João"));

        // Atualizando o número de um contato
        Contato atualizarContato = ag.atualizarNumeroContato("João", 62991975);
        System.out.println("Contato:\t" + atualizarContato);

        // Exibindo os contatos atualizados na agenda
        ag.exibirContatos();
    }
}

