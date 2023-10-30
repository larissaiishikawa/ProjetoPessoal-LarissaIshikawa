// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class RendaVariavel extends Investimento implements Calc {

	// Declaração de variáveis
	private String codigo;
	private double pvp;
	private double ultRend;
	private int qtdCotas;

	// Construtor
	public RendaVariavel() {
	
		codigo = "";
		pvp = 0.0;
		ultRend = 0.0;
		qtdCotas = 0;

	}

	// Getter
	public String getCodigo() {
		return codigo;
	}

	public double getPvp() {
		return pvp;
	}

	public double getUltRend() {
		return ultRend;
	}

	public int getQtdCotas() {
		return qtdCotas;
	}

	// Setter
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public void setUltRend(double ultRend) {
		this.ultRend = ultRend;
	}

	public void setQtdCotas(int qtdCotas) {
		this.qtdCotas = qtdCotas;
	}

	// Calcula o valor unitario de cotas adquiridas
	public double calcular() {
		double valor = getValor();
		double unit = valor / qtdCotas;
		return unit;
	}

}