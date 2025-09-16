package app1e2;

import modelo.Matematica;

public class Principal {
	
	public static void main(String[] args) {
		Matematica soma = new Matematica();
		
		System.out.println(soma.somar(130, 110));
		
		Matematica sub = new Matematica();
		
		System.out.println(sub.subtrair(125, 75));
		
        Matematica multi = new Matematica();
		
		System.out.println(multi.multiplicar(5, 41));
		
        Matematica divi = new Matematica();
		
		System.out.println(divi.dividir(745, 5));
		


}
}
