package br.com.fabricaroupa.teste;

import javax.swing.JOptionPane;

import br.com.fabricaroupa.model.Calca;

public class TesteCalca {

	public static void main(String[] args) {
		
		Calca calca = new Calca();
		
		calca.setCor(JOptionPane.showInputDialog("Digite a cor da calca: "));
		calca.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da calca: ")));
		calca.setQuantidadeBotao(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de botaões: ")));
		calca.setTipoTecido(JOptionPane.showInputDialog("Digite o tipo de tecido da calca: "));
		
		System.out.println("A cor da calça é: " + calca.getCor() + "\nO peso da cala é: " + calca.getPeso() + " gramas"
				+ "\nA quantidade de botões da calça é: " + calca.getQuantidadeBotao() + "\nO tipo de tecido é: " + calca.getTipoTecido());


	}

}
