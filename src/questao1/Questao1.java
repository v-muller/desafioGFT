package questao1;

public class Questao1 {
	public static void main(String[] args) {
		System.out.println(inverteNumeros(123));
		
	}
	
	public static String inverteNumeros(int valores) {
		String numeros = String.valueOf(valores);
		String numerosInvertidos = "";
		for(int i = numeros.length(); i > 0 ; i--) {
			numerosInvertidos += numeros.charAt(i-1);
		}
		String resposta = numeros + "->" + numerosInvertidos;
		
		return resposta;
	}
}
