package br.com.tn.cap16;

import java.util.HashSet;
import java.util.Set;

public class TestaSet {

	public static void main(String args[]) {
		Set<String> cargos = new HashSet<>();
		
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secret�ria");
		cargos.add("Funcion�rio");
		cargos.add("Diretor");

		System.out.println(cargos);
	}

}