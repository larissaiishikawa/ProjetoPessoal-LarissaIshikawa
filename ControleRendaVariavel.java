// UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ - CAMPUS CORNÉLIO PROCÓPIO
// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA
// RA: 2564203
// 01/11/2023

import java.util.ArrayList;
import java.util.List;
// import java.util.Iterator;

public class ControleRendaVariavel {

    private List<RendaVariavel> rendaVariavelList = new ArrayList<>();
    private int id;
    private boolean encontrada;

    public ControleRendaVariavel() {
        id = 1;
        encontrada = false;
    }

    // Adicionar Renda Variavel
    public void adicionarRendaVariavel(RendaVariavel rv) {
        rv.setId(id);
        rendaVariavelList.add(rv);
        id++;
    }

    // Listar Renda Variavel
    public void listarRendaVariavel() {
        if (rendaVariavelList.isEmpty()) {
            System.out.println("Ainda nao ha Renda Variavel cadastrada!");
            return;
        }
    
        for (RendaVariavel rv : rendaVariavelList) {
            System.out.println("\nID.................: " + rv.getId());
            System.out.println("Codigo.............: " + rv.getCodigo());
            System.out.println("Valor..............: R$ " + rv.getValor());
        }
    }

    // Editar valor da Renda Variavel
    public void editarRendaVariavel(int id, double valor) {
        if (rendaVariavelList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Variavel cadastrada!");
            return;
        } else {
            for (RendaVariavel rv  : rendaVariavelList) {
                if (id == rv.getId()) {
                    rv.setValor(valor);
                    System.out.println("\nRenda Variavel alterada com sucesso!");
                    encontrada = true;
                    break;
                }
            }
            if (encontrada == false) {
                System.out.println("\nRenda Variavel não encontrada!");
            }
        }
    }

    // Excluir Renda Variavel 
    public void excluirRendaVariavel(int id) {
        System.out.println("\n---------------------------------------------\n");
        if(rendaVariavelList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Variavel cadastrada");
            return;
        } else {
            for (RendaVariavel rv  : rendaVariavelList) {
                if (id == rv.getId()) {
                    rendaVariavelList.removeIf(r -> rv.getId() == id); // -> cria funções anônimas de forma concisa
                    System.out.println("Rendas Variaveis excluidas com sucesso!");
                    break;
                }  
            }
        }
    }

    // Consultar Renda Variavel
    public void consultarRendaVariavel(int id) {
        if(rendaVariavelList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Variavel cadastrada");
            return;
        } else {
            for (RendaVariavel rv : rendaVariavelList) {
                if (id == rv.getId()) {
                    encontrada = true;
                    System.out.println("\nID.................: " + rv.getId());
                    System.out.println("Codigo.............: " + rv.getCodigo());
                    System.out.println("Valor..............: R$ " + rv.getValor());
                    System.out.println("Rentabilidade Anual: " + rv.getRentAnual() + "%");
                    System.out.println("Liquidez...........: " + rv.getLiqui());
                    System.out.println("P/VP...............: " + rv.getPvp());
                    System.out.println("Ultimo Rendimento..: R$ " + rv.getUltRend());
                    System.out.println("Quant. de cotas....: " + rv.getQtdCotas());
                    System.out.println("Valor por cota.....: R$ " + rv.calcular());// Calc
                    return;
                }
            }
            if (encontrada == false) {
                    System.out.println("\nRenda Variavel nao encontrada!");
            }
        }
    }    
}
