public abstract class Pessoa {

	private String nome;
	//private String contato;

	public void falar() {
		System.out.println("Bom dia tudo bem?");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//public String getContato() {
		//return contato;
	//}

	//public void setContato(String contato) {
		//this.contato = contato;
	//}

}
