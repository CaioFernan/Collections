package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class listaTarefa {
    //atributo
    private List<tarefa> tarefaList;

    public listaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionartarefa(String descricao){
        tarefaList.add(new tarefa(descricao));
    }

    public void removertarefa(String descricao){
        List<tarefa> tarefapraremover = new ArrayList<>();

        for(tarefa t: tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefapraremover.add(t);
            }
        }
        tarefaList.removeAll(tarefapraremover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }
}
