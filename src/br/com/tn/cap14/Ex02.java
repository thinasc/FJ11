package br.com.tn.cap14;

public class Ex02 {

	public static void main(String[] args) {
		String s = " String 01 ";   // String com espa�os na frente e atr�s
		String sVazia = "";

		// Descobrir se uma string se encontra dentro de outra
		if (s.contains("01")){
			System.out.println("A String cont�m o que pesquisei!");
		} else {
			System.out.println("A String n�o cont�m o que pesquisei!");
		}

		// Tirar espa�os em branco das pontas de uma String
		System.out.println("String com espa�os: " + s);
		System.out.println("String sem espa�os: " + s.trim());

		// Descobrir se uma String est� vazia
		if (sVazia.isEmpty()) {
			System.out.println("String Vazia");
		} else {
			System.out.println("String n�o est� Vazia");
		}

		// Conta quantos caracteres a String possui
		System.out.println("String possui: " + s.length());
	}

}
