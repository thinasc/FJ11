package br.com.tn.cap16;

import java.util.*;

public class TestaSort {

	public static void main(String args[]) {
		List<String> lista = new ArrayList<>();

		lista.add("Thiago");
		lista.add("Lucin�ia");

		System.out.println(lista);

		Collections.sort(lista);

		System.out.println(lista);
	}

}