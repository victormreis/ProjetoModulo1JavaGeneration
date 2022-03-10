public class Cliente extends Pessoa {

	private String codCliente;

	public Cliente(String cod, String nome) {
		this.codCliente = cod;
		super.setNome(nome);
	}

	@Override
	public void falar() {
		System.out.println("Bom dia poderia me ajudar?");
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public void comprar() {
		System.out.println("Compra efetuada!");
	}
	
}