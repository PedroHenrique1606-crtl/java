package br.com.fiap.banco;

public class ContaCorrente extends Conta {

	private double saldoInvestimento;

	public ContaCorrente(Cliente cliente, long numeroConta, double saldo, String aberturaConta) {
		super(cliente, numeroConta, saldo, aberturaConta);
	}

	// metodo investir
	public void investir(String produto, double valor) {
		if (produto.equalsIgnoreCase("CDB")) {
			this.saldoInvestimento = valor + (valor * 0.01);
		} else if (produto.equalsIgnoreCase("LCI")) {
			this.saldoInvestimento = valor + (valor * 0.09);
		} else if (produto.equalsIgnoreCase("LCA")) {
			this.saldoInvestimento = valor + (valor * 0.08);
		}
		
	}

	@Override
	public void exibirSaldo() {
//		double saldoTotal = this.saldo + this.saldoInvestimento;
		System.out.println("=========================");
		System.out.println("Nome: " + this.cliente.getNomeCliente());
		System.out.println("Numero da conta: " + this.numeroConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Data de abertura da conta: " + this.aberturaConta);
		System.out.println("=========================");
	}

}
