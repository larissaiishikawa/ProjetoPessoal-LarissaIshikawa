// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class RendaFixa extends Investimento implements Calc {

	// Declaração de variáveis
	private String tipo;
	private double inflacao;

	// Construtor
	public RendaFixa() {
	
		tipo = "";
		inflacao = 0.0;

	}

	// Getter
	public String getTipo() {
		return tipo;
	}

	public double getInfla() {
		return inflacao;
	}

	// Setter
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setInfla(double inflacao) {
		this.inflacao = inflacao;
	}

	// Implementação dos métodos de interface Calc
	public double calcular() {
		double rentab = getRentab();
		double real = rentab - inflacao;
		return real;
	}

	public double calcVal() {
		return getValor() * calcular();
	}


}