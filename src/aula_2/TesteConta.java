package aula_2;

public class TesteConta {

	public static void main(String[] args) {
		
		Cliente gui = new Cliente("Gui", "123456789", "123456789", "Rua 1234");
		Cliente gaby = new Cliente("Gaby", "987654321", "987654321", "Rua 4321");
		Conta contaGui = new Conta(gui, 1, 1, "teste");
		Conta contaGaby = new Conta(gaby, 2, 1, "teste");
		
		//simulações
		contaGui.depositar(100);
		contaGaby.depositar(2000);
		
		contaGui.exibirSaldo();
		contaGaby.exibirSaldo();
		
		contaGui.sacar(50);
		contaGaby.sacar(1000);
		
		contaGui.exibirSaldo();
		contaGaby.exibirSaldo();
		
		contaGui.transferir(contaGaby, 20);
		
		contaGui.exibirSaldo();
		contaGaby.exibirSaldo();
		
		contaGaby.transferir(contaGui, 200);
		
		contaGui.exibirSaldo();
		contaGaby.exibirSaldo();
	}

}
