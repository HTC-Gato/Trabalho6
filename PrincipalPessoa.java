package app3;

import modelo3.Pessoa;
import modelo3.PessoaJuridica;
import modelo3.PessoaFisica;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("--> Pessoa");
		Pessoa p = new Pessoa(123456, "Ana", "analinda@gmail.com");
		p.imprimirInfo();
		
		System.out.println("--> Pessoa juridica");
		PessoaJuridica pj = new PessoaJuridica("009988", "24961", "5764-0875", 654321, "Ana", "analinda@gmail.com");
		pj.imprimirInfo();
		
		System.out.println("--> Pessoa Fisica");
		PessoaFisica pf = new PessoaFisica("24961", "5764-0875", 654321, "Ana", "analinda@gmail.com");
		pf.imprimirInfo();
	}

}
