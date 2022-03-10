public class Funcionario extends Pessoa {

	private String codFunc;
	private String cargo;

	public Funcionario(String codigo, String cargo, String nome) {
		this.cargo = cargo;
		this.codFunc = codigo;
		super.setNome(nome);
	}

	public void atendender() {
		System.out.println(" está atendendo o cliente!");
	}

	public String getCodFunc() {
		return codFunc;
	}

	public void setCodFunc(String codFunc) {
		this.codFunc = codFunc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}