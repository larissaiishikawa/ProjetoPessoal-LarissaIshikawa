// UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ - CAMPUS CORNÉLIO PROCÓPIO
// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA
// RA: 2564203
// 01/11/2023

import java.util.ArrayList;
import java.util.List;

public class ControleCriptomoedas {
    
    private List<Criptomoedas> criptomoedasList = new ArrayList<>();
    private int id;
    private boolean encontrada;

    public ControleCriptomoedas() {
        id = 1;
        encontrada = false;
    }

    // Adicionar Criptomoedas
    public void adicionarCriptomoedas(Criptomoedas cm) {
        cm.setId(id);
        criptomoedasList.add(cm);
        id++;
    }

    // Listar Criptomoedas
    public void listarCriptomoedas() {
        if (criptomoedasList.isEmpty()) {
            System.out.println("Ainda nao ha Criptomoedas cadastradas!");
            return;
        }
    
        for (Criptomoedas cm : criptomoedasList) {
            System.out.println("\nID.................: " + cm.getId());
            System.out.println("Nome...............: " + cm.getNomeC());
            System.out.println("Valor..............: R$ " + cm.getValor());
        }
    }

    // Editar valor da Criptomoedas
    public void editarCriptomoedas(int id, double valor) {
        if (criptomoedasList.isEmpty()) {
            System.out.println("\nAinda nao ha Criptomoedas cadastradas!");
            return;
        } else {
            for (Criptomoedas cm  : criptomoedasList) {
                if (id == cm.getId()) {
                    cm.setValor(valor);
                    System.out.println("\nCriptomoeda alterada com sucesso!");
                    encontrada = true;
                    break;
                }
            }
            if (encontrada == false) {
                System.out.println("\nCriptomoeda não encontrada!");
            }
        }
    }

    // Excluir Criptomoedas
    public void excluirCriptomoedas(int id) {
        System.out.println("\n---------------------------------------------\n");
        if(criptomoedasList.isEmpty()) {
            System.out.println("\nAinda nao ha Criptomoedas cadastradas");
            return;
        } else {
            for (Criptomoedas cm  : criptomoedasList) {
                if (id == cm.getId()) {
                    criptomoedasList.removeIf(r -> cm.getId() == id); // -> cria funções anônimas de forma concisa
                    System.out.println("Criptomoedas excluidas com sucesso!");
                    break;
                } 
            }
        }
    }

    // Consultar Criptomoedas
    public void consultarCriptomoedas(int id) {
        if(criptomoedasList.isEmpty()) {
            System.out.println("\nAinda nao ha Criptomoedas cadastradas");
            return;
        } else {
            for (Criptomoedas cm : criptomoedasList) {
                if (id == cm.getId()) {
                    encontrada = true;
                    System.out.println("\nID.................: " + cm.getId());
                    System.out.println("Nome...............: " + cm.getNomeC());
                    System.out.println("Valor..............: R$ " + cm.getValor());
                    System.out.println("Rentabilidade Anual: " + cm.getRentAnual() + "%");
                    System.out.println("Liquidez...........: " + cm.getLiqui());
                    System.out.println("Ticker.............: " + cm.getTicker());
                    System.out.println("Valor Atual........: " + cm.getValorAtual());
                    System.out.println("Fracao do ativo....: " + cm.calcular());// Calc
                    return;
                }
            }
            if (encontrada == false) {
                System.out.println("\nCriptomoeda nao encontrada!");
            }
        }    
    }
}





    