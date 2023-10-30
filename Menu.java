// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private Leitura l =  new Leitura();
    private Investidor i = new Investidor();
    private LocalDateTime agora = LocalDateTime.now();
    private List<Investimento> invest = new ArrayList<>();

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String dataHoraFormatada = agora.format(formatador);

    private int opc;
    private boolean sair;
    private int qtd;

    public Menu() {

        opc = 0;
        this.i = new Investidor();
        sair = false;
        qtd = 0;

    }
    
    public void menuInicial() {
        System.out.println("\n---------------------------------------------\n");
        System.out.println("ISHIKAWA INVESTING\n");
        System.out.println("Seus investimentos no seu CMD!\n");
        System.out.println("---------------------------------------------\n");
        System.out.println("Seja bem-vind@! Escolha uma das opcoes abaixo\n");
        
        do {
            opc = Integer.parseInt(l.entDados("1 - ENTRAR | 2 - CADASTRE-SE"));
            switch (opc) {
                case 1:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 1 - ENTRAR");
                    i.setNome(l.entDados("\nDigite seu nome: "));
                    i.setCpf(l.entDados("\nDigite seu CPF (ex.: 000.000.000-00): "));
                    break;

                case 2:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 2 - CADASTRE-SE");
                    i.setNome(l.entDados("\nDigite seu nome: "));
                    i.setCpf(l.entDados("\nDigite seu CPF (ex.: 000.000.000-00): "));
                    i.setEmail(l.entDados("\nDigite seu e-mail (ex.: exemplo@gmail.com): "));
                    i.setDataNasc(l.entDados("\nDigite sua data de nascimento (ex.: DD/MM/AAAA): "));
                    System.out.println("\nQual é o seu perfil de investidor?");
                    i.setPerfilInvest(l.entDados("Conservador  |  Moderado  |  Arrojado"));
                    i.setPatri(Integer.parseInt(l.entDados("\nDigite seu patrimonio (ex.: 1500000): ")));
                    
                    break;
            
                default:
                System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }


        } while (opc != 1 && opc != 2);

    }

    public void menuHome() {
        System.out.println("\n---------------------------------------------\n");
        System.out.println("ISHIKAWA INVESTING \nSeus investimentos no seu CMD!");
        System.out.println("\nSeja bem-vind@, " + i.getNome());
        System.out.println("\nData e hora atual: " + dataHoraFormatada);
        System.out.println("\nHOME");
        do {
            opc = Integer.parseInt(l.entDados("\n1 - Investimentos \n2 - Meus dados \n3 - Sair"));
            switch (opc) {
                case 1:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 1 - INVESTIMENTOS");
                    menuInvestimentos();;
                    break;

                case 2:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 2 - MEUS DADOS");
                    menuDados();
                    break;

                case 3:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 3 - SAIR");
                    System.out.println("\nAte logo, " + i.getNome() + "! \nEncerrando o programa...\n");
                    sair = true;
                    break;
            
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
        } while (!sair && opc != 1 && opc != 2);
        
    }

    public void menuDados() {
        System.out.println("\nMEUS DADOS");
        System.out.println("\nNome..............:    " + i.getNome());
        System.out.println("CPF...............:    " + i.getCpf());
        System.out.println("E-mail............:    " + i.getEmail());
        System.out.println("Data de nascimento:    " + i.getDataNasc());
        System.out.println("Perfil investidor.:    " + i.getPerfilInvest());
        System.out.println("Patrimonio........:    R$ " + i.getPatri());

        do {
            opc = Integer.parseInt(l.entDados("\n1 - Alterar dados \n2 - Inicio"));
            switch (opc) {
                case 1:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 1 - ALTERAR DADOS");
                    alterarDados();
                    menuDados();
                    break;
                case 2:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 2 - INICIO");
                    menuHome();
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
        } while (!sair && opc != 1 && opc != 2);

        
    }

    public void alterarDados() {
        do {
            System.out.println("\n1 - Nome \n2 - E-mail \n3 - Perfil de investidor \n4 - Patrimonio");
            opc = Integer.parseInt(l.entDados("\nO que voce gostaria de alterar?"));
            switch (opc) {
                case 1:
                    i.setNome(l.entDados("\nDigite o novo nome: "));
                    System.out.println("\n---------------------------------------------\n");
                    break;

                case 2:
                    i.setEmail(l.entDados("\nDigite o novo e-mail: "));
                    System.out.println("\n---------------------------------------------\n");                    
                    break;

                case 3:
                    i.setPerfilInvest(l.entDados("\nDigite o novo perfil: "));
                    System.out.println("\n---------------------------------------------\n");
                    break;

                case 4:
                    i.setPatri(Integer.parseInt(l.entDados("\nDigite o novo patrimonio: ")));
                    System.out.println("\n---------------------------------------------\n");
                    break;
            
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
        } while (!sair && opc != 1 && opc != 2 && opc != 3 && opc != 4);
        
    }

    public void menuInvestimentos() {
        qtd = invest.size();
    
        System.out.println("\nINVESTIMENTOS");
                
        do {
            System.out.println("Você tem " + qtd + " investimento(s) cadastrado(s).\n");
            System.out.println("1 - Cadastrar novo investimento");
            System.out.println("2 - Listar investimentos");
            System.out.println("3 - Consultar investimento");
            System.out.println("4 - Alterar investimento");
            System.out.println("5 - Remover investimento");
            opc = Integer.parseInt(l.entDados("6 - Início"));

            switch (opc) {
                case 1:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 1 - CADASTRAR NOVO INVESTIMENTO");
                    System.out.println("\nem manutencao!\nestamos te redirecionando a home...");
                    menuHome();
                    //investCadastrar();
                    break;
                case 2:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 2 - LISTAR INVESTIMENTOS");
                    System.out.println("\nem manutencao!\nestamos te redirecionando a home...");
                    menuHome();
                    // investListar();
                    break;
                case 3:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 3 - CONSULTAR INVESTIMENTO");
                    System.out.println("\nem manutencao!\nestamos te redirecionando a home...");
                    menuHome();
                    // investConsultar();
                    break;
                case 4:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 4 - ALTERAR INVESTIMENTO");
                    System.out.println("\nem manutencao!\nestamos te redirecionando a home...");
                    menuHome();
                    // investAlterar();
                    break;
                case 5:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 5 - REMOVER INVESTIMENTO");
                    System.out.println("\nem manutencao!\nestamos te redirecionando a home...");
                    menuHome();
                    // investRemover();
                    break;
                case 6:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 6 - INICIO");
                    menuHome();
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
        } while (!sair && opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5 && opc != 6);

    }

    // /* 

    public void investCadastrar() {
        do {
            Investimento in = new Investimento();
            System.out.println("1 - Renda fixa \n2 - Renda variável \n3 - Criptomoedas");
            opc = Integer.parseInt(l.entDados("\nEscolha o tipo de ativo que deseja cadastrar: "));
            switch (opc) {
                case 1:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 1 - RENDA FIXA");
                    in.setTipo(opc);
                    break;
                case 2:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 2 - RENDA VARIAVEL");
                    in.setTipo(opc);
                    break;
                case 3:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 3 - CRIPTOMOEDAS");
                    in.setTipo(opc);
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
            in.setValor(Double.parseDouble(l.entDados("\nDigite o valor da sua aplicacao (ex.: R$ 1.100,50, digite 1100.5): ")));
            in.setLiqui(l.entDados("\nDigite a liquidez do seu ativo: "));
            in.setRentAnual(Integer.parseInt(l.entDados("\nDigite a rentabilidade anual (ex.: se a rentabilidade for 12.5%, digite apenas 12): ")));
            
            switch (opc) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:

                    break;
                default:
                    break;
            }
        } while (!sair && opc != 1 && opc != 2 && opc != 3);
        // invest.add(in);
    }
    
    // */

}

    
