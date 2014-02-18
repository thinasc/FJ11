package Cap04;

public class Empresa {
	Funcionario[] empregados;
	String cnpj;

	void adiciona (int i, Funcionario f) {
		this.empregados[i] = f;
	}

	void mostraEmpregados () {
		for (int i = 0; i < this.empregados.length; i++) {
			System.out.println(empregados[i].salario);
		}
	}

}