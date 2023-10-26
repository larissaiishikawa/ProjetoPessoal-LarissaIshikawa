// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class Criptomoedas extends Investimento implements Calc {

    // Declaração de variáveis
    private String tipo;
    private String ticker;
    private double valorAtual;

    // Construtor
    public Criptomoedas() {
        tipo = "";
        ticker = "";
        valorAtual = 0.0;
    }

    // Getter
    public String getTipo() {
        return tipo;
    }

    public String getTicker() {
        return ticker;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    // Setter
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    // Implementação do método de interface Calc
    public double calcular() {
        double valor = getValor();
        double fracao = valor / valorAtual;
        return fracao;
    }
}
