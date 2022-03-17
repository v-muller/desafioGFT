package questao4;

public class Supervisor extends Funcionario{
	
	public Supervisor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	@Override
	public Double bonificacao() {
		return super.getSalario() + 5000.0;
	}

	@Override
	public String toString() {
		return super.toString() + "Supervisor [bonificacao()=" + bonificacao() + "]";
	}
	
	
}
