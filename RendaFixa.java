// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class RendaFixa extends Investimento implements Calc {

	Leitura l = new Leitura();

	// Declaração de variáveis
	private String titulo;
	private String garantia;
	private String risco;

	// Construtor
	public RendaFixa() {
	
		titulo = "";
		garantia = "";
		risco = "";

	}

	// Getter
	public String getTitulo() {
		return titulo;
	}

	public String getGarantia() {
		return garantia;
	}

	public String getRisco() {
		return risco;
	}

	// Setter
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public void getRisco(String risco) {
		this.risco = risco;
	}

	// Retornará o valor da Rentabilidade mensal em relação ao Valor e Rentabilidade cadastrados.
	public double calcular() {
		double valor = getValor();
		double mensal = getRentAnual() / 12;
		double rent = Math.pow(valor * (1 + mensal), 12);
		return rent;
	}


}