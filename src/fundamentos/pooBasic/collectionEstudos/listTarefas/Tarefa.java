package fundamentos.pooBasic.collectionEstudos.listTarefas;

/**
 * Classe que representa uma tarefa individual.
 * Cada tarefa possui uma descrição que a identifica.
 */
public class Tarefa {

    // Atributo que armazena a descrição da tarefa
    private String descricao;

    /**
     * Construtor que inicializa uma tarefa com a descrição fornecida
     * @param descricao A descrição da tarefa
     */
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Método getter que retorna a descrição da tarefa
     * @return A descrição da tarefa
     */
    public String getDescricao(){
        return descricao;
    }

    /**
     * Sobrescreve o método toString() da classe Object para personalizar
     * a representação textual da tarefa
     *
     * Observação: Este método sempre adiciona "\tlimpar casa" após a descrição,
     * o que pode não ser o comportamento ideal para todas as tarefas.
     * Considera-se revisar essa implementação se precisar de representações mais precisas.
     *
     * @return Uma string formatada com a descrição da tarefa
     */
    @Override
    public String toString() {
        return descricao + "\tlimpar casa";
    }
}