package Cap04;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];

		for (int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.salario = 100 + 100 * i;
			empresa.adiciona(i, f);
		}
		
		empresa.mostraEmpregados();
	}

}