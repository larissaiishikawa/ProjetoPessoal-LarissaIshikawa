// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public abstract class Investimento {

	// Declaração de variáveis
	private double valor;
	private int rentAnual;
	private String liquidez;

	// Instanciações
	Investidor investidor = new Investidor();

	// Construtores
	public Investimento() {
	
		valor = 0.0;
		rentAnual = 0;
		liquidez = "";

	}

	// Getters
	public double getValor() {
		return valor;
	}

	public int getRentAnual() {
		return rentAnual;
	}

	public String getLiqui() {
		return liquidez;
	}

	public Investidor getInvest() {
		return investidor;
	}

	// Setters
	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setRentAnual(int rentAnual) {
		this.rentAnual = rentAnual;
	}

	public void setLiqui(String liquidez) {
		this.liquidez = liquidez;
	}


}