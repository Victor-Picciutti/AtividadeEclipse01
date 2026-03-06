package br.com.setimoprojeto.teste;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		//System.out.println("oi");
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
		System.out.println("o nome digitado foi: "+ nome + " e a idade foi: " +idade);
		

	}

}
