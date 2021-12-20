package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestObject {
	public static void main(String[] args) {

		int[] idades = new int[5];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = (i * i) - i;
		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}

		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}
}
