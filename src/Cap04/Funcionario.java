package Cap04;

public class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada;
	String rg;

	void recebeAumento (double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salário Atual: " + this.salario);
		System.out.println("Ganho Anual: " + this.calculaGanhoAnual());
	}

}