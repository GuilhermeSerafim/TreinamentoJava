package aula_3;

import java.util.Date;

public abstract class Conta {

	// atributos
	protected int numeroConta, agencia;
	protected String senha;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente; // composição
	private static long contador; // "visualização dos objetos que somem"

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senha) {

		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.dataAbertura = new Date(System.currentTimeMillis());
		this.senha = senha;
		contador++;
		System.out.println("Conta criado");
		System.out.println("Data abertura: " + this.dataAbertura);
	}

	// metodos
	// sacar
	public boolean sacar(double valor) {
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		}
		return false;
	}

	// depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}

	// consultar saldo
	public abstract void exibirSaldo();
	// abstract no método força a reescrita.

	// transferir
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}

	}
	public static void exibirContador() {
		System.out.println("Contas: " + contador);
	}
}
