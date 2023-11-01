// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class Criptomoedas extends Investimento implements Calc {

    // Declaração de variáveis
    private String nomeC;
    private String ticker;
    private double valorAtual;
    private int id;


    // Polimorfismo por sobrecarga - Construtor
    public Criptomoedas() {
        super();
        nomeC = "";
        ticker = "";
        valorAtual = 0.0;
        id = 0;
    }

    // Getter
    public String getNomeC() {
        return nomeC;
    }

    public String getTicker() {
        return ticker;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public int getId() {
		return id;
	}

    // Setter
    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void setId(int id) {
		this.id = id;
	}

    // Polimorfismo por sobrescrita - Implementação do método de interface Calc
    public double calcular() {
        double valor = getValor();
        double fracao = valor / valorAtual;
        return fracao;
    }
}
