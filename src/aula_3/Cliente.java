package aula_3;

//javabeans
public class Cliente {

	// atributos
	private String nomeTitular, cpfTitular, enderecoTitular, senhaTitular;

	// construtor vazio
	public Cliente() {

	}

	// construtor
	public Cliente(String nomeTitular, String cpfTitular, String enderecoTitular, String senhaTitular) {
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.enderecoTitular = enderecoTitular;
		this.senhaTitular = senhaTitular;
	}

	// getters / setters
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getEnderecoTitular() {
		return enderecoTitular;
	}

	public void setEnderecoTitular(String enderecoTitular) {
		this.enderecoTitular = enderecoTitular;
	}

	public String getSenhaTitular() {
		return senhaTitular;
	}

	public void setSenhaTitular(String senhaTitular) {
		this.senhaTitular = senhaTitular;
	}

}
