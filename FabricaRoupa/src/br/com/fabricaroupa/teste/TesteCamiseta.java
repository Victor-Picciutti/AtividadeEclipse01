package br.com.fabricaroupa.teste;

import javax.swing.JOptionPane;

import br.com.fabricaroupa.model.Camiseta;

public class TesteCamiseta {

	public static void main(String[] args) {
		
		Camiseta camiseta = new Camiseta();
		
		camiseta.setCor(JOptionPane.showInputDialog("Digite a cor da camiseta: "));
		camiseta.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da camiseta: ")));
		camiseta.setTipoManga(JOptionPane.showInputDialog("Digite o tipo de manga da camiseta: "));
		camiseta.setTipoTecido(JOptionPane.showInputDialog("Digite o tipo de tecido da camiseta: "));
		
		System.out.println("A cor da camiseta é: " + camiseta.getCor() + "\nO peso da camiseta é: " + camiseta.getPeso() + " gramas"
				+ "\nO tipo de manga da camiseta é: " + camiseta.getTipoManga() + "\nO tipo de tecido da manga é: " + camiseta.getTipoTecido());

	}

}
