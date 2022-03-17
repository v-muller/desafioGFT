package questao4;

public class Main {
	public static void main(String[] args) {
		Gerente gerente =  new Gerente("Iolanda", 57, 3400.0);
		Supervisor supervisor = new Supervisor("Claudiomiro", 36, 2000.0);
		Vendedor vendedor = new Vendedor("Soraya", 28, 1500.0);
		
		System.out.println("Salário Antigo Gerente: " + gerente.getSalario());
		System.out.println("Salário com bonificação Gerente: " + gerente.bonificacao());
		
		System.out.println("Salário Antigo Supervisor: " + supervisor.getSalario());
		System.out.println("Salário com bonificação Supervisor: " + supervisor.bonificacao());
		
		System.out.println("Salário Antigo Vendedor: " + vendedor.getSalario());
		
		System.out.println("Salário com bonificação Vendedor: " + vendedor.bonificacao());
	}
}
