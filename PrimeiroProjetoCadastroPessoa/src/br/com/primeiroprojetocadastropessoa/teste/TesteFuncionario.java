package br.com.primeiroprojetocadastropessoa.teste;

import javax.swing.JOptionPane;

import br.com.primeiroprojetocadastropessoa.model.Funcionario;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcionario: "));
		funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do funcionario: ")));
		funcionario.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario: ")));
		
		System.out.println("O nome do funcionario é: " + funcionario.getNome() + "\nA idade do funcionario é: " + funcionario.getIdade() + "\nO salario do funcionario é: R$" + funcionario.getSalario());
		
		

		

	}

}
