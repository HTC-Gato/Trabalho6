package modelo3;

public class PessoaFisica extends Pessoa{
	
	String CPF;
	String Celular;
	
	public PessoaFisica(String CPF, String Celular, Integer id, String nome, String email){
		super(id, nome, email);
		this.CPF = CPF;
		this.Celular = Celular;
	}

	public void imprimirInfo() {
		System.out.println("CPF: " + this.CPF);
		System.out.println("Celular: " + this.Celular);

}
}
