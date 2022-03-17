package questao4;

public class Vendedor extends Funcionario{
	
	public Vendedor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public Double bonificacao() {
		return super.getSalario() + 3000.0;
	}

	@Override
	public String toString() {
		return super.toString() + "Vendedor [bonificacao()=" + bonificacao() + "]";
	}
	
	
}
