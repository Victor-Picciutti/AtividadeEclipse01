package br.com.doceria.teste;

import javax.swing.JOptionPane;

import br.com.doceria.model.Brigadeiro;

public class TesteBrigadeiro {

	public static void main(String[] args) {
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do brigadeiro: "));
		brigadeiro.setPesoChocolate(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do chocolate usado: ")));
		brigadeiro.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do brigadeiro: ")));
		
		System.out.println("Nome do brigadeiro: " + brigadeiro.getNomeDoce()
							+ "\nPeso do chocolate usado: " + brigadeiro.getPesoChocolate() + " gramas" 
							+ "\nValor do brigadeiro: R$" + String.format("%.2f", brigadeiro.getValor()));

	}

}
