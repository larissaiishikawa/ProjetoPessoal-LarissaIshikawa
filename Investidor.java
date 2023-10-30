// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class Investidor {

	

	// Declaração de variáveis
	private String cpf;
	private String nome;
	private String email;
	private String dataNasc;
	private int patrimonio;
	private String perfilInvestidor;

	// Construtores
	public Investidor() {
	
		cpf = "";
		nome = "";
		email = "";
		dataNasc = "";
		patrimonio = 0;
		perfilInvestidor = "";

	}

	// Getters
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public int getPatri() {
		return patrimonio;
	}

	public String getPerfilInvest() {
		return perfilInvestidor;
	}

	// Setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setPatri(int patrimonio) {
		this.patrimonio = patrimonio;
	}

	public void setPerfilInvest(String perfilInvestidor) {
		this.perfilInvestidor = perfilInvestidor;
	}


}