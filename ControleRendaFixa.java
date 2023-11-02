// UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ - CAMPUS CORNÉLIO PROCÓPIO
// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA
// RA: 2564203
// 01/11/2023

import java.util.ArrayList;
import java.util.List;

public class ControleRendaFixa {
    
    private List<RendaFixa> rendaFixaList = new ArrayList<>();
    private int id;
    private boolean encontrada;

    public ControleRendaFixa() {
        id = 1;
        encontrada = false;
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
            System.out.println("Ainda nao ha Renda Fixa cadastrada!");
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
                encontrada = true;
                break;
                } 
            }
            if (encontrada == false) {
                System.out.println("\nRenda Fixa não encontrada!");
            }
        }
    }

    // Excluir Renda Fixa
    public void excluirRendaFixa(int id) {
        System.out.println("\n---------------------------------------------\n");
        if(rendaFixaList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Fixa cadastrada");
            return;
        } else {
            for (RendaFixa rf  : rendaFixaList) {
                if (id == rf.getId()) {
                    rendaFixaList.removeIf(r -> rf.getId() == id); // -> cria funções anônimas de forma concisa
                    System.out.println("Rendas Fixas excluidas com sucesso!");
                    break;
                }
            }
        }
    }

    // Consultar Renda Fixa
    public void consultarRendaFixa(int id) {
        if(rendaFixaList.isEmpty()) {
            System.out.println("\nAinda nao ha Renda Fixa cadastrada");
            return;
        } else {
            for (RendaFixa rf : rendaFixaList) {
                if (id == rf.getId()) {
                    encontrada = true;
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
            if (encontrada == false) {
                System.out.println("\nRenda Fixa nao encontrada!");
            }
        }    
    }

    // 
}


