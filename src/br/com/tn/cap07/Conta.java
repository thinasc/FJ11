package br.com.tn.cap07;

public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	abstract void atualiza(double taxa);

}