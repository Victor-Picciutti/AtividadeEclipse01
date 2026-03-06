package br.com.zoologico.teste;

import javax.swing.JOptionPane;

import br.com.zoologico.model.Felino;

public class TesteFelino {

	public static void main(String[] args) {
		
		Felino felino = new Felino();
		
		felino.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do felino:")));
		felino.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do felino:")));
		felino.setTamanho(Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do felino:")));
		felino.setTempoGestacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de gestação do felino:")));
		
		System.out.println("A idade do felino é: " + felino.getIdade() + " anos"
							+ "\nO peso do felino é: " + felino.getPeso() + " KG"
							+ "\nO tamanho do felino é: " + felino.getTamanho() + " centimetro" 
							+ "\nO tempo de gestação do felino é de: " + felino.getTempoGestacao() + " semanas");

	}

}
