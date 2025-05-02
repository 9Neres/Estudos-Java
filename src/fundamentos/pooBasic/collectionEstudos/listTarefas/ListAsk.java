package fundamentos.pooBasic.collectionEstudos.listTarefas;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por gerenciar uma lista de tarefas.
 * Implementa operações básicas como adicionar, remover e listar tarefas.
 */
public class ListAsk {

    // Atributo que armazena a lista de tarefas
    private List<Tarefa> tarefaList;

    /**
     * Construtor que inicializa a lista de tarefas vazia
     */
    public ListAsk() {
        this.tarefaList = new ArrayList<>();
    }

    /**
     * Adiciona uma nova tarefa à lista
     * @param descricao A descrição da tarefa a ser adicionada
     */
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    /**
     * Remove todas as tarefas que possuem a descrição informada
     * Observação: Este método pode remover múltiplas tarefas se tiverem a mesma descrição
     * @param descricao A descrição da tarefa a ser removida
     */
    public void removeTarefa(String descricao){
        // Cria uma lista temporária para armazenar as tarefas que serão removidas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        // Percorre todas as tarefas da lista principal
        for(Tarefa t : tarefaList){
            // Verifica se a descrição da tarefa atual é igual à descrição informada (ignorando maiúsculas/minúsculas)
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                // Adiciona a tarefa à lista de tarefas para remover
                tarefasParaRemover.add(t);
            }
        }
        // Remove todas as tarefas encontradas de uma só vez
        tarefaList.removeAll(tarefasParaRemover);
    }

    /**
     * Retorna o número total de tarefas na lista
     * @return O tamanho atual da lista de tarefas
     */
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    /**
     * Exibe todas as tarefas da lista no console
     * Observação: Esta função depende do método toString() da classe Tarefa
     */
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    /**
     * Método principal para testar a funcionalidade da classe
     */
    public static void main(String [] args){
        // Cria uma nova instância da classe ListAsk
        ListAsk listAsk = new ListAsk();

        // Adiciona duas tarefas à lista
        listAsk.adicionarTarefa("Tarefa 1");
        listAsk.adicionarTarefa("Tarefa 2");

        // Exibe o número total de tarefas (deve ser 2)
        System.out.println("\nnumero de elementos:\t" + listAsk.obterNumeroTotalTarefas());

        // Remove a tarefa com descrição "Tarefa 2"
        listAsk.removeTarefa("Tarefa 2");

        // Exibe o número de tarefas após a remoção (deve ser 1)
        System.out.printf("elementos após a remoção:\t" + listAsk.obterNumeroTotalTarefas() + "\n\n");

        // Exibe todas as tarefas restantes
        listAsk.obterDescricoesTarefas();

        System.out.printf("\n\n\n");
    }
}