import java.util.ArrayList;
import java.util.List;

public class ControleRendaVariavel {
    
    private RendaVariavel rv;
    private List<RendaVariavel> rendaVariavelList = new ArrayList<>();

    // Adicionar Renda Variavel
    public void adicionarRendaVariavel(RendaVariavel rv) {
        rendaVariavelList.add(rv);
        rv.setId(rendaVariavelList.indexOf(rv));
    }

    // Listar Renda Variavel
    public void listarRendaVariavel() {
        if (rendaVariavelList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Variavel cadastrada!");
            return;
        }

        // O ID pode ser o endereço
        System.out.println("\nID.................: " + rv.getId());
        System.out.println("\nCodigo.............: " + rv.getCodigo());
        System.out.println("\nValor..............: " + rv.getValor());
        System.out.println("\nRentabilidade Anual: " + rv.getRentAnual());
        System.out.println("\nLiquidez...........: " + rv.getLiqui());
        System.out.println("\nP/VP...............: " + rv.getPvp());
        System.out.println("\nUltimo Rendimento..: " + rv.getUltRend());
        System.out.println("\nQuant. de cotas....: " + rv.getQtdCotas());
        System.out.println("\n");
    }

    // Editar valor da Renda Variavel
    public void editarRendaVariavel(int id, double valor) {
        if (rendaVariavelList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Variavel cadastrada!");
            return;
        }

        for (RendaVariavel rv  : rendaVariavelList) {
            if (id == rv.getId()) {
               rv.setValor(valor);
            } else System.out.println("\nRenda Variavel nao encontrada!");
        }
    }

    // Excluir Renda Variavel
    public void excluirRendaVariavel(int id) {
        rendaVariavelList.removeIf(rv -> rv.getId() == id);
    }
}



