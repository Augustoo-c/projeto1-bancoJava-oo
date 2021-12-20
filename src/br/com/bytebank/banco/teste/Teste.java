package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta c1 = new ContaCorrente(4343, 4444444);
		Conta c2 = new ContaCorrente(4353, 5464644);
		guardador.adiciona(c1);
		guardador.adiciona(c2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencias(0);
		System.out.println(ref.getNumero());
	}



}
