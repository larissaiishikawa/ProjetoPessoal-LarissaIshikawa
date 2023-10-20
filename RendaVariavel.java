// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class RendaVariavel extends Investimento implements Calc {

	// Declaração de variáveis
	private String ticker;
	private double pvp;
	private double ultRend;

	// Construtor
	public RendaVariavel() {
	
		ticker = "";
		pvp = 0.0;
		ultRend = 0.0;

	}

	// Getter
	public String getTicker() {
		return ticker;
	}

	public double getPvp() {
		return pvp;
	}

	public double getUltRend() {
		return ultRend;
	}

	// Setter
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public void setUltRend(double ultRend) {
		this.ultRend = ultRend;
	}

	// Implementação dos métodos de interface Calc
	public double calcular() {
		double valor = getValor();
		double dividendo = valor * ultRend;
		return dividendo;
	}

	public String calcPvp() {
		if (getPvp() < 0.8) {
			return "O P/VP está abaixo do valor recomendado para compra.";
		}
		else if (getPvp() <= 1.03) {
			return "O P/VP está no valor recomendado para compra.";
		}
		else if (getPvp() > 1.04) {
			return "O P/VP está acima do valor recomendado para compra.";
		}
		// Adicione uma mensagem de retorno padrão caso nenhuma das condições seja atendida.
		return "O P/VP não se enquadra em nenhuma categoria conhecida.";
	}	


}