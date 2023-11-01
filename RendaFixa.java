// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class RendaFixa extends Investimento implements Calc {

	Leitura l = new Leitura();

	// Polimorfismo por sobrecarga -Declaração de variáveis
	private String titulo;
	private String garantia;
	private String risco;
	private int id;

	// Construtor
	public RendaFixa() {
	
		super();
		titulo = "";
		garantia = "";
		risco = "";
		id = 0;

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

	public int getId() {
		return id;
	}

	// Setter
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}

	public void setRisco(String risco) {
		this.risco = risco;
	}

	public void setId(int id) {
		this.id = id;
	}

	// Polimorfismo por sobrescrita - Retornará o valor da Rentabilidade real em relação ao Valor e Rentabilidade cadastrados.
	public double calcular() {
		double valor = getValor();
		double mensal = getRentAnual() / 12;
		double rent = Math.pow(valor * (1 + mensal), 12);
		return rent;
	}


}