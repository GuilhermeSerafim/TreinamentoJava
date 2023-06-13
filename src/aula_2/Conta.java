package aula_2;

import java.sql.Date;

public class Conta {

	// atributos
	int numeroConta, agencia;
	String senha;
	Date dataAbertura;
	double saldo;
	Cliente cliente;

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {

		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.senha = senha;

		System.out.println("Conta criado");
		System.out.println("Data abertura: " + this.dataAbertura);
	}

	// metodos
	// sacar
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// consultar saldo
	public void exibirSaldo() {
		System.out.println(this.cliente.nomeTitular + " - Saldo: " + this.saldo);
	}

	// transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}

	}
}
