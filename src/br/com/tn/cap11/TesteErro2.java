package br.com.tn.cap11;

// C�digo com try/catch em volta do for
public class TesteErro2 {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");
		metodo1();
		System.out.println("Fim do Main");
	}

	static void metodo1() {
		System.out.println("Inicio do M�todo1");
		metodo2();
		System.out.println("Fim do M�todo1");
	}

	static void metodo2() {
		System.out.println("Inicio do M�todo2");
		int[] array = new int[10];
		try {
			for (int i = 0; i <= 15; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e);
		}
		System.out.println("Fim do M�todo2");
	}
}