package aula_3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//javabeans
public class Cliente {

	// atributos
	private String nomeTitular, cpfTitular, enderecoTitular, senhaTitular;
	private final Date dataNasc; //transforma a variavel em constante

	// construtor
	public Cliente(String nomeTitular, String cpfTitular, String enderecoTitular, String senhaTitular, String dataNasc) throws ParseException {
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.enderecoTitular = enderecoTitular;
		this.senhaTitular = senhaTitular;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		this.dataNasc = formato.parse(dataNasc); 
	}

	// métodos getters(ler) / setters(escrever)
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
