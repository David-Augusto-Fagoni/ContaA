package principal;

import javax.swing.JOptionPane;

public class Verifica {
	public static void main(String[] args) {
		String menssagem = JOptionPane.showInputDialog(null,"Escreva uma frase:");
		System.out.println("'"+menssagem+"' possuí "+contador(menssagem.toLowerCase())+" 'a'");
	}
	
	private static int contador(String frase) {
		int tamanho=frase.length();
		int cont = 0;
		for(int J=0;J<tamanho;J++) {
			if (frase.charAt(J) == 'a') {
				cont++;
			}
		}
		return cont;
	}

}
