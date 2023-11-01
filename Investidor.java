// NOME: LARISSA DE FATIMA ISHIKAWA CUNHA - RA: 2564203

public class Investidor {

	

	// Declaração de variáveis
	private String cpf;
	private String nome;
	private String email;
	private String dataNasc;
	private int patrimonio;
	private int codPerfilInvest;
	private String perfil;

	// Construtores
	public Investidor() {
	
		cpf = "";
		nome = "";
		email = "";
		dataNasc = "";
		patrimonio = 0;
		codPerfilInvest = 0;
		perfil = "";

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

	public int getCodPerfilInvest() {
		return codPerfilInvest;
	}

	public String getPerfil() {
		switch (getCodPerfilInvest()) {
			case 0:
				setPerfil("INDEFINIDO. Por favor, preencha.");
				return perfil;
			case 1:
				setPerfil("CONSERVADOR");
				return perfil;
			case 2:
				setPerfil("MODERADO");
				return perfil;
			case 3:
				setPerfil("ARROJADO");
				return perfil;
			default:
				return perfil;
		}
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

	public void setCodPerfilInvest(int codPerfilInvest) {
		this.codPerfilInvest = codPerfilInvest;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}