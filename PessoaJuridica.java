package modelo3;

public class PessoaJuridica extends Pessoa{
	
	String cnpj;
	String incricaoEstadual;
	String telefoneFixo;
	
	
	public PessoaJuridica(String cnpj, String incricaoEstadual, String telefoneFixo, Integer id, String nome, String email){
		super(id, nome, email);
		this.cnpj = cnpj;
		this.incricaoEstadual = incricaoEstadual;
		this.telefoneFixo = telefoneFixo;
		
	}
	
	public void imprimirInfo() {
		System.out.println("cnpj: " + this.cnpj);
		System.out.println("incricaoEstadual: " + this.incricaoEstadual);
		System.out.println("telefoneFixo: " + this.telefoneFixo);

}
}
