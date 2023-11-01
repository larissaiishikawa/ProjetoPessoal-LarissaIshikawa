import java.util.ArrayList;
import java.util.List;

public class ControleCriptomoedas {
    
    private Criptomoedas cm;
    private List<Criptomoedas> CriptomoedasList = new ArrayList<>();

    // Adicionar Criptomoedas
    public void adicionarCriptomoedas(Criptomoedas cm) {
        CriptomoedasList.add(cm);
        cm.setId(CriptomoedasList.indexOf(cm));
    }

    // Listar Criptomoedas
    public void listarCriptomoedas() {
        if (CriptomoedasList.isEmpty()) {
            System.out.println("\nAinda nao ha Criptomoedas cadastrada!");
            return;
        }

        // O ID pode ser o endereço
        System.out.println("\nID.................: " + cm.getId());
        System.out.println("\nNome...............: " + cm.getNomeC());
        System.out.println("\nValor..............: " + cm.getValor());
        System.out.println("\nRentabilidade Anual: " + cm.getRentAnual());
        System.out.println("\nLiquidez...........: " + cm.getLiqui());
        System.out.println("\nTicker.............: " + cm.getTicker());
        System.out.println("\nValor Atual........: " + cm.getValorAtual());
        System.out.println("\n");
    }

    // Editar valor da Criptomoedas
    public void editarCriptomoedas(int id, double valor) {
        if (CriptomoedasList.isEmpty()) {
            System.out.println("\nAinda nao ha Criptomoedas cadastrada!");
            return;
        }

        for (Criptomoedas cm  : CriptomoedasList) {
            if (id == cm.getId()) {
               cm.setValor(valor);
            } else System.out.println("\nCriptomoedas nao encontrada!");
        }
    }

    // Excluir Criptomoedas
    public void excluirCriptomoedas(int id) {
        CriptomoedasList.removeIf(cm -> cm.getId() == id);
    }
}



