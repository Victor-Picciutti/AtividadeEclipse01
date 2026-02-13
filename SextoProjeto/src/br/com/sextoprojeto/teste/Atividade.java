package br.com.sextoprojeto.teste;

import javax.swing.JOptionPane;

public class Atividade {

	public static void main(String[] args) {
		
		int idadeProfessor = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do professor: "));
		int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do Aluno: "));
		int diferencaIdade = idadeProfessor - idadeAluno;
		System.out.println("A diferenca entre a idade do professor e do aluno é de: "+diferencaIdade);
		
		

	}

}
