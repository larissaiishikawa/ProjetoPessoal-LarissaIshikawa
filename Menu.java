// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Menu {

    private Leitura l =  new Leitura();
    private Investidor i = new Investidor();
    //private RendaFixa rf = new RendaFixa();
    //private RendaVariavel rv = new RendaVariavel();
    //private Criptomoedas cm = new Criptomoedas();
    private ControleRendaFixa controleRF = new ControleRendaFixa();
    //private final ControleRendaVariavel controleRV = new ControleRendaVariavel();
    //private final ControleCriptomoedas controleCM = new ControleCriptomoedas();
    private LocalDateTime agora = LocalDateTime.now();

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String dataHoraFormatada = agora.format(formatador);

    private int opc;
    private boolean sair;
    // private int qtd;

    public Menu() {

        opc = 0;
        this.i = new Investidor();
        sair = false;
        // qtd = 0;

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
                    do {
                        System.out.println("\nQual é o seu perfil de investidor?");
                        i.setCodPerfilInvest(Integer.parseInt(l.entDados("1 - Conservador | 2 - Moderado | 3 - Arrojado")));
                        switch (i.getCodPerfilInvest()) {
                            case 1:
                                System.out.println("\nOPCAO ESCOLHIDA: 1 - CONSERVADOR");
                                break;
                            case 2:
                                System.out.println("\nOPCAO ESCOLHIDA: 2 - MODERADO");
                                break;
                            case 3:
                                System.out.println("\nOPCAO ESCOLHIDA: 3 - ARROJADO");
                                break;
                            default:
                            System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                                break;
                        }
                    } while (i.getCodPerfilInvest() != 1 && i.getCodPerfilInvest() != 2 && i.getCodPerfilInvest() != 3); 
                    
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
            opc = Integer.parseInt(l.entDados("1 - Investimentos \n2 - Meus dados \n0 - Sair"));
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

                case 0:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 0 - SAIR");
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
        System.out.println("Perfil investidor.:    " + i.getCodPerfilInvest() + " - " + i.getPerfil());
        System.out.println("Patrimonio........:    R$ " + i.getPatri());

        do {
            opc = Integer.parseInt(l.entDados("\n1 - Alterar dados \n0 - Inicio"));
            switch (opc) {
                case 1:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 1 - ALTERAR DADOS");
                    alterarDados();
                    menuDados();
                    break;
                case 0:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 0 - INICIO");
                    menuHome();
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
        } while (!sair && opc != 1 && opc != 0);

        
    }

    public void alterarDados() {
        do {
            System.out.println("\n1 - Nome \n2 - E-mail \n3 - Perfil de investidor \n4 - Patrimonio \n5 - Data de nascimento");
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
                    do {
                        System.out.println("\nDigite o novo perfil de investidor:");
                        i.setCodPerfilInvest(Integer.parseInt(l.entDados("1 - Conservador | 2 - Moderado | 3 - Arrojado")));
                        switch (i.getCodPerfilInvest()) {
                            case 1:
                                System.out.println("\nOPCAO ESCOLHIDA: 1 - CONSERVADOR");
                                break;
                            case 2:
                                System.out.println("\nOPCAO ESCOLHIDA: 2 - MODERADO");
                                break;
                            case 3:
                                System.out.println("\nOPCAO ESCOLHIDA: 3 - ARROJADO");
                                break;
                            default:
                            System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                                break;
                        }
                    } while (i.getCodPerfilInvest() != 1 && i.getCodPerfilInvest() != 2 && i.getCodPerfilInvest() != 3);
                    System.out.println("\n---------------------------------------------\n");
                    break;

                case 4:
                    i.setPatri(Integer.parseInt(l.entDados("\nDigite o novo patrimonio: ")));
                    System.out.println("\n---------------------------------------------\n");
                    break;
                    
                case 5:
                    i.setDataNasc(l.entDados("\nDigite a nova data de nascimento: "));
                    System.out.println("\n---------------------------------------------\n");
                    break;

                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
        } while (!sair && opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5);
        
    }

    public void menuInvestimentos() {
    
        System.out.println("\nINVESTIMENTOS");
        do {
            System.out.println("Qual tipo de investimento voce gostaria de operar?");
            System.out.println("\n1 - Renda Fixa");
            System.out.println("2 - Renda Variavel");
            System.out.println("3 - Criptomoedas");
            opc = Integer.parseInt(l.entDados("0 - Inicio"));

            switch (opc) {
                case 1:
                    menuRF();
                    break;
                case 2:
                    // menuRV();
                    break;
                case 3:
                    // menuCM();
                    break;
                case 0:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 0 - INICIO");
                    menuHome();
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
        } while (!sair && opc != 1 && opc != 2 && opc != 3 && opc != 0);
        
    }

    public void menuRF() {
        System.out.println("\n---------------------------------------------\n");
        System.out.println("OPCAO ESCOLHIDA: 1 - RENDA FIXA\n");
        // qtd = ControleRendaFixa rendaFixaList.size(); - Descobrir porquê não funciona
        
        do {
            // System.out.println("Você tem " + qtd + " investimento(s) cadastrado(s).\n");
            System.out.println("1 - Cadastrar novo investimento");
            System.out.println("2 - Listar investimentos");
            System.out.println("3 - Consultar investimento");
            System.out.println("4 - Editar investimento");
            System.out.println("5 - Remover investimento");
            opc = Integer.parseInt(l.entDados("0 - Retornar"));

            switch (opc) {
                case 1:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 1 - CADASTRAR NOVO INVESTIMENTO\n");
                    do {
                        RendaFixa rf1 = new RendaFixa();
                        rf1.setTitulo(l.entDados("Digite o titulo da sua aplicacao (ex.: Poupanca, CDB, Tesouro direto, LCI etc.): "));
                        rf1.setValor(Double.parseDouble(l.entDados("\nDigite o valor da sua aplicacao (ex.: R$ 1.100,50, digite 1100.5): ")));
                        rf1.setRentAnual(Integer.parseInt(l.entDados("\nDigite a rentabilidade anual (ex.: se a rentabilidade for 12.5%, digite apenas 12): ")));
                        rf1.setLiqui(l.entDados("\nDigite a liquidez do seu ativo (ex.: Diaria, 3 meses, 6 meses, 1 ano): "));
                        rf1.setGarantia(l.entDados("\nDigite a garantia do seu ativo (ex.: FGC, Tesouro Nacional, sem garantia): "));
                        rf1.setRisco(l.entDados("\nDigite o risco da sua aplicação (ex.: Baixo, Medio, Alto): "));
                        controleRF.adicionarRendaFixa(rf1);
                        System.out.println("\nRenda Fixa inserida com sucesso!");
                        } while (l.entDados("Gostaria de inserir uma nova Renda Fixa? (S/N)").equalsIgnoreCase("s"));
                        menuRF();                 
                    break;
                case 2:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 2 - LISTAR INVESTIMENTOS\n");
                    controleRF.listarRendaFixa();
                    menuRF();
                    break;  
                case 3:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 3 - CONSULTAR INVESTIMENTO\n");
                    controleRF.consultarRendaFixa(Integer.parseInt(l.entDados("Digite o ID do ativo: "))); 
                    menuRF();                   
                    break;
                case 4:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 4 - EDITAR INVESTIMENTO\n");
                    controleRF.listarRendaFixa();
                    controleRF.editarRendaFixa(
                        Integer.parseInt(l.entDados("\nDigite o ID da Renda Fixa a ser alterada: ")),
                        Double.parseDouble(l.entDados("\nDigite o novo valor (ex.: R$ 1.100,50, digite 1100.5): "))
                        );
                    menuRF();    
                    break;
                case 5:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 5 - REMOVER INVESTIMENTO");
                    controleRF.listarRendaFixa();
					controleRF.excluirRendaFixa(Integer.parseInt(l.entDados("\nDigite o ID do ativo a ser removido: ")));
                    menuRF();
                    break;
                case 0:
                    System.out.println("\n---------------------------------------------\n");
                    System.out.println("OPCAO ESCOLHIDA: 0 - RETORNAR");
                    menuInvestimentos();
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA! Tente novamente.\n");
                    break;
            }
            
        } while (!sair && opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5 && opc != 0);
    }



    /*
    public void controleRF () {
        List<RendaFixa> list = new ArrayList<>();
        RendaFixa rf = new RendaFixa();
        rf.setTipo(opc);
        rf.setValor(Double.parseDouble(l.entDados("\nDigite o valor da sua aplicacao (ex.: R$ 1.100,50, digite 1100.5): ")));
        rf.setLiqui(l.entDados("\nDigite a liquidez do seu ativo: "));
        rf.setRentAnual(Integer.parseInt(l.entDados("\nDigite a rentabilidade anual (ex.: se a rentabilidade for 12.5%, digite apenas 12): ")));
        rf.setTitulo(l.entDados("\nDigite o título da sua aplicacao (CDB, Tesouro direto, LCI etc.): "));
        rf.setGarantia(l.entDados("\nDigite a garantia da sua aplicacao (FGC, Tesouro Nacional, sem garantia): "));
        rf.setRisco(l.entDados("\nDigite o título da sua aplicacao (CDB, Tesouro direto, LCI etc.): "));
        list.add(rf);

    }
    
    */

}

    
