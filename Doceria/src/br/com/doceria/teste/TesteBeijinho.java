package br.com.doceria.teste;

import javax.swing.JOptionPane;

import br.com.doceria.model.Beijinho;

public class TesteBeijinho {

	public static void main(String[] args) {
		
		Beijinho beijinho = new Beijinho();
		
		beijinho.setNomeDoce(JOptionPane.showInputDialog("Digite o nome do beijinho: "));
		beijinho.setPesoCoco(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do coco usado: ")));
		beijinho.setValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do beijinho: ")));
		
		System.out.println("Nome do beijinho: " + beijinho.getNomeDoce()
							+ "\nPeso do coco usado: " + beijinho.getPesoCoco() + " gramas" 
							+ "\nValor do beijinho: R$" + String.format("%.2f", beijinho.getValor()));

	}

}
