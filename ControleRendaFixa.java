import java.util.ArrayList;
import java.util.List;

public class ControleRendaFixa {
    
    private RendaFixa rf = new RendaFixa();
    private Leitura l = new Leitura();
    private List<RendaFixa> rendaFixaList = new ArrayList<>();

    // Adicionar Renda Fixa
    public void adicionarRendaFixa(RendaFixa rf) {
        rf.setTitulo(l.entDados("Digite o titulo da sua aplicacao (ex.: Poupanca, CDB, Tesouro direto, LCI etc.): "));
        rf.setValor(Double.parseDouble(l.entDados("\nDigite o valor da sua aplicacao (ex.: R$ 1.100,50, digite 1100.5): ")));
        rf.setRentAnual(Integer.parseInt(l.entDados("\nDigite a rentabilidade anual (ex.: se a rentabilidade for 12.5%, digite apenas 12): ")));
        rf.setLiqui(l.entDados("\nDigite a liquidez do seu ativo (ex.: Diaria, 3 meses, 6 meses, 1 ano): "));
        rf.setGarantia(l.entDados("\nDigite a garantia do seu ativo (ex.: FGC, Tesouro Nacional, sem garantia): "));
        rf.setRisco(l.entDados("\nDigite o risco da sua aplicação (ex.: Baixo, Medio, Alto): "));
        rf.setId(rendaFixaList.indexOf(rf));
        rendaFixaList.add(rf);
    }

    // Listar Renda Fixa
    public void listarRendaFixa() {
        if (rendaFixaList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Fixa cadastrada!");
            return;
        } else {
            for (int i = 0; i < rendaFixaList.size(); i++) {
                if (rf.getId() == rendaFixaList.get(i).getId()) {
                    System.out.println("\nID.................: " + rf.getId());
                    System.out.println("Titulo.............: " + rf.getTitulo());
                    System.out.println("Valor..............: " + rf.getValor());
                    System.out.println("\n");
                    return;
                }
            }
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
                } else System.out.println("\nRenda Fixa nao encontrada!");
            }
        }
    }

    // Excluir Renda Fixa
    public void excluirRendaFixa(int id) {
        System.out.println("\n---------------------------------------------\n");
        for (RendaFixa rf  : rendaFixaList) {
            if (id == rf.getId()) {
                System.out.println("\nID.................: " + rf.getId());
                System.out.println("Titulo.............: " + rf.getTitulo());
                System.out.println("Valor..............: " + rf.getValor());
            } else System.out.println("\nRenda Fixa nao encontrada!");
        }
        rendaFixaList.removeIf(rf -> rf.getId() == id); // -> cria funções anônimas de forma concisa
        System.out.println("\nRenda Fixa excluida com sucesso!");
    }

    // Consultar Renda Fixa
    public void consultarRendaFixa(int id) {
        if(rendaFixaList.isEmpty()) {
            System.out.println("Ainda nao ha Renda Fixa cadastrada");
            return;
        } else {
            for (int i = 0; i < rendaFixaList.size(); i++) {
                if (id == rendaFixaList.get(i).getId()) {
                    System.out.println("\nID.................: " + rf.getId());
                    System.out.println("Titulo.............: " + rf.getTitulo());
                    System.out.println("Valor..............: " + rf.getValor());
                    System.out.println("Rentabilidade Anual: " + rf.getRentAnual());
                    System.out.println("Liquidez...........: " + rf.getLiqui());
                    System.out.println("Garantia...........: " + rf.getGarantia());
                    System.out.println("Risco..............: " + rf.getRisco());
                    System.out.println("Rentabilidade Real.: " + rf.calcular()); // Calc
                    return;
                }
            }
        }

        

        System.out.println("\nInvestimento nao encontrado!");
    }
}


