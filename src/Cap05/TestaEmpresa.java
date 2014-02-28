package Cap05;

import Cap04.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(10);

		for (int i = 0; i < 10; i++) {
			Funcionario f = new Funcionario();
			f.setSalario(100 + 100 * i);
			empresa.adiciona(i, f);
		}
		
		empresa.mostraEmpregados();
	}

}