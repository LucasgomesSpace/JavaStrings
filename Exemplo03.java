package atividades;

public class Exemplo03 {
	public static void main(String[] args) {

		String cidade = "São Paulo";
		int tamanho = cidade.length();
		String bairro = cidade.substring(0, 9);
		System.out.println("Bairro:" + bairro);
		System.out.println("Qual o tamnho do negocios:  " + tamanho); 

	}
}
