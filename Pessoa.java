package modelo3;

public class Pessoa {
	
	Integer id;
	String nome;
	String email;
	
	public Pessoa (Integer id, String nome, String email){
		this.id = id;
		this.nome = nome;
		this.email = email;
	}
public void imprimirInfo() {
	System.out.println("id: " + this.id);
	System.out.println("nome: " + this.nome);
	System.out.println("email: " + this.email);

}
}
