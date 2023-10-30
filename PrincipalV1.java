// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

/* 

public class PrincipalV1 {

    //static RendaVariavel rv = new RendaVariavel();
    //static RendaFixa rf = new RendaFixa();
    //static Criptomoedas cm = new Criptomoedas();
    static Investidor in = new Investidor();
    static Leitura l = new Leitura();

    public static void main(String arg[]) {

        // int tipo = 0;
        // int perfil = 0;

        System.out.println("\n--------------------------------------\n");
        System.out.println("ISHIKAWA INVESTING\n");
        System.out.println("Seus investimentos no seu CMD!\n");
        System.out.println("--------------------------------------\n");

        * CADASTRO INVESTIDOR
        *

        investidor.setNome(l.entDados("\nDigite seu nome: "));
        System.out.println("\nSeja bem-vindo(a) " + investidor.getNome() + "!");
        investidor.setCpf(l.entDados("\nDigite seu CPF (ex.: 000.000.000-00): "));
        investidor.setDataNasc(l.entDados("\nDigite sua data de nascimento (ex.: DD/MM/AAAA): "));

        perfil = Integer.parseInt(l.entDados("\nVocê deseja preencher os dados de seu perfil completo? \n1 - SIM \n2 - NAO"));
        do {
            switch (perfil) {

                case 1:
                    System.out.println("\nOPCAO ESCOLHIDA: SIM\n");
                    investidor.setPatri(Integer.parseInt(l.entDados("\nDigite seu patrimônio atual (ex: 1000000): ")));
                    investidor.setPerfilInvest(l.entDados("\nDigite seu Perfil de Investidor: "));
                    break;
                case 2:
                    System.out.println("\nOPCAO ESCOLHIDA: NAO\n");
                    System.out.println("Sem problemas! Estamos te redirecionando aos próximos passos!\n");
                    break;
                default:
                    System.out.println("\n!!!  Opcao invalida! Tente novamente.  !!!\n");
                    break;

            }

        } while (perfil != 1 && perfil != 2);

        * CADASTRO INVESTIMENTO
		*

        do {
            System.out.println("\nO que gostaria de cadastrar hoje? \n1 - Renda Fixa \n2 - Renda Variável \n3 -  Criptomoedas");
            tipo = Integer.parseInt(l.entDados("\nDigite sua escolha: "));

            switch (tipo) {

                case 1:
                    System.out.println("\nOPCAO ESCOLHIDA: 1 - RENDA FIXA\n");
                    rf.setTipo(l.entDados("\nDigite o tipo da sua Renda Fixa (ex.: Tesouro Direto, CDB, LCI...): "));
					rf.setValor(Double.parseDouble(l.entDados("\nDigite o valor da sua aplicacao: ")));
					rf.setRentab(Double.parseDouble(l.entDados("\nDigite a rentabilidade: ")));
					rf.setLiqui(l.entDados("\nDigite o tipo/data de liquidez: "));
                    rf.setInfla(Double.parseDouble(l.entDados("\nDigite o valor da inflação acumulada no ano: ")));
                    break;
                case 2:
                    System.out.println("\nOPCAO ESCOLHIDA: 2 - RENDA VARIAVEL\n");
                    rv.setTicker(l.entDados("\nDigite o ticker do ativo comprado: "));
					rv.setValor(Double.parseDouble(l.entDados("\nDigite o valor da sua aplicacao: ")));
					rv.setRentab(Double.parseDouble(l.entDados("\nDigite a rentabilidade anual: ")));
					rv.setLiqui(l.entDados("\nDigite o tipo/data de liquidez: "));
                    rv.setPvp(Double.parseDouble(l.entDados("\nDigite o P/VP atual do ativo: ")));
                    rv.setUltRend(Double.parseDouble(l.entDados("\nDigite o último rendimento do ativo (ex.: 1.10): ")));
                    break;
                case 3:
                    System.out.println("\nOPCAO ESCOLHIDA: 3 - CRIPTOMOEDAS\n");
                    cm.setTipo(l.entDados("\nDigite o tipo da moeda comprada: "));
                    cm.setTicker(l.entDados("\nDigite o ticker do ativo comprado: "));
					cm.setValor(Double.parseDouble(l.entDados("\nDigite o valor da sua aplicacao: ")));
					cm.setRentab(Double.parseDouble(l.entDados("\nDigite a ultima rentabilidade anual: ")));
					cm.setLiqui(l.entDados("\nDigite o tipo/data de liquidez: "));
                    cm.setValorAtual(Double.parseDouble(l.entDados("\nDigite o valor atual do criptoativo (ex.: Bitcoin BTC: 179800.00): ")));
                default:
                    System.out.println("\n!!!  Opcao invalida! Tente novamente.  !!!\n");
                    break;

            }

        } while (tipo != 1 && tipo != 2 && tipo != 3);

        * SAÍDA DE DADOS
        *

        System.out.println("\n----------------------------------------------");
        System.out.println("SEUS DADOS");
        System.out.println("----------------------------------------------\n");
        System.out.println("Nome: " + investidor.getNome());
        System.out.println("CPF: " + investidor.getCpf());
        System.out.println("Data de nascimento: " + investidor.getDataNasc());

        if (perfil == 1) {

            System.out.println("\nPatrimônio: R$ " + investidor.getPatri());
            System.out.println("Perfil de Investidor: " + investidor.getPerfilInvest());

        }

        if (tipo == 1) {

			System.out.println("\nValor: R$ " + rf.getValor());
            System.out.println("Tipo de Renda Fixa: " + rf.getTipo());
            System.out.println("Liquidez: " + rf.getLiqui());
			System.out.println("Rentabilidade anual: " + rf.getRentab() + "%");
            System.out.println("Inflação acumulada no ano: " + rf.getInfla() + "%");
			System.out.println("Rentabilidade real c/ desconto da inflacao: " + rf.calcular() + "%");
            System.out.println("Rendimento real: R$ " + rf.calcVal());
			

        } else if (tipo == 2) {

			System.out.println("\nValor: R$ " + rv.getValor() );
            System.out.println("Liquidez: " + rv.getLiqui());
            System.out.println("Ticker do Ativo Comprado: " + rv.getTicker());
            System.out.println("P/VP Atual do Ativo: " + rv.getPvp());
			System.out.println("Rentabilidade anual (D/Y): " + rv.getRentab() + "%");
            System.out.println("Último Rendimento do Ativo: " + rv.getUltRend() + "%");
			System.out.println("Dividendo recebido no ultimo mes: R$ " + rv.calcular());

        } else if (tipo == 3) {

			System.out.println("\nValor: R$ " + cm.getValor() );
            System.out.println("Liquidez: " + cm.getLiqui());
            System.out.println("Tipo do Criptoativo Comprado: " + cm.getTipo());
            System.out.println("Ticker do Ativo Comprado: " + cm.getTicker());
			System.out.println("Rentabilidade anual (D/Y): " + cm.getRentab() + "%");
            System.out.println("Valor atual do Criptoativo: R$ " + cm.getValorAtual());
			System.out.println("Sua fracao/quantidade do criptoativo: " + cm.calcular());

        }

        
    }

    

}


*/