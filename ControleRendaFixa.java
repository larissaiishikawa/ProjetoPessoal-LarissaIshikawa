import java.util.ArrayList;
import java.util.List;

public class ControleRendaFixa {
    
    //private RendaFixa rf = new RendaFixa();
    //private Leitura l = new Leitura();
    private List<RendaFixa> rendaFixaList = new ArrayList<>();
    private int id;

    public ControleRendaFixa() {
        id = 1;
    }

    // Adicionar Renda Fixa
    public void adicionarRendaFixa(RendaFixa rf) {
        rf.setId(id);
        rendaFixaList.add(rf);
        id++;
    }

    // Listar Renda Fixa
    public void listarRendaFixa() {
        if (rendaFixaList.isEmpty()) {
            System.out.println("Ainda não há Renda Fixa cadastrada!");
            return;
        }
    
        for (RendaFixa rf : rendaFixaList) {
            System.out.println("\nID.................: " + rf.getId());
            System.out.println("Titulo.............: " + rf.getTitulo());
            System.out.println("Valor..............: R$ " + rf.getValor());
        }
    }
    
    // Editar valor da Renda Fixa
    public void editarRendaFixa(int id, double valor) {
        if (rendaFixaList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Fixa cadastrada!");
            return;
        } else {
            for (RendaFixa rf  : rendaFixaList) {
                if (id == rf.getId()) {
                rf.setValor(valor);
                System.out.println("\nRenda Fixa alterada com sucesso!");
                } else System.out.println("\nRenda Fixa nao encontrada!");
            }
        }
    }

    // Excluir Renda Fixa
    public void excluirRendaFixa(int id) {
        System.out.println("\n---------------------------------------------\n");
        if(rendaFixaList.isEmpty()) {
            System.out.println("\nAinda não há Renda Fixa cadastrada");
            return;
        }
        for (RendaFixa rf  : rendaFixaList) {
            if (id == rf.getId()) {
                System.out.println("\nID.................: " + rf.getId());
                System.out.println("Titulo.............: " + rf.getTitulo());
                System.out.println("Valor..............: R$ " + rf.getValor());
            } else System.out.println("\nRenda Fixa nao encontrada!");
        }
        rendaFixaList.removeIf(rf -> rf.getId() == id); // -> cria funções anônimas de forma concisa
        System.out.println("\nRenda Fixa excluida com sucesso!");
    }

    // Consultar Renda Fixa
    public void consultarRendaFixa(int id) {
        if(rendaFixaList.isEmpty()) {
            System.out.println("\nAinda não há Renda Fixa cadastrada");
            return;
        } else {
            for (RendaFixa rf : rendaFixaList) {
                if (id == rf.getId()) {
                    System.out.println("\nID.................: " + rf.getId());
                    System.out.println("Titulo.............: " + rf.getTitulo());
                    System.out.println("Valor..............: R$ " + rf.getValor());
                    System.out.println("Rentabilidade Anual: " + rf.getRentAnual() + "%");
                    System.out.println("Liquidez...........: " + rf.getLiqui());
                    System.out.println("Garantia...........: " + rf.getGarantia());
                    System.out.println("Risco..............: " + rf.getRisco());
                    System.out.println("Rentabilidade Real.: R$ " + rf.calcular()); // Calc
                    return;
                }
            }
        }    

        System.out.println("\nInvestimento nao encontrado!");
    }
}


