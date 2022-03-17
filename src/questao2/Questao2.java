package questao2;

import java.util.ArrayList;
import java.util.List;

public class Questao2 {
	public static void main(String[] args) {

		operacoesString("1 2 3 44 5");
		System.out.println();
		operacoesString("55 2 1 854 963 520 1 0 98 8");
		System.out.println();
		operacoesString("");
		System.out.println();
		operacoesString("2 3 5 44 8 99 6 55 72 3 01 25");
		System.out.println();
		operacoesString("98 99 100 101 102 103 105 105");
		System.out.println();
		operacoesString("1");

	}

	public static void operacoesString(String valores) {
		try {
		if (valores != null) {
			String[] fields = valores.split(" ");
			List<Integer> numeros = new ArrayList<>();
			int soma = 0;
			int maior = 0;

			for (String s : fields) {
				numeros.add(Integer.parseInt(s));
			}

			for (int i = 0; i < numeros.size(); i++) {
				soma += numeros.get(i);
				if (maior < numeros.get(i)) {
					maior = numeros.get(i);
				}

			}

			System.out.printf("O maior número é: %d\n", maior);
			System.out.printf("A soma dos valores é: %d\n", soma);
		}
		else {
			System.out.println("Sem valores informados.");
		}
		}catch(NumberFormatException e) {
			System.out.println("Valor inválido");
		}
	}
}
