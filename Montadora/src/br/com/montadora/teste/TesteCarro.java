package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setFabricante(JOptionPane.showInputDialog("Digite o fabricante do carro: "));
		carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
		carro.setModeloVolante(JOptionPane.showInputDialog("Digite o modelo do volante do carro: "));
		
		
		System.out.println("O fabricante do carro é: " + carro.getFabricante() + "\nO modelo do carro é: " + carro.getModelo() + "\nO modelo do volante é: " + carro.getModeloVolante());
				

	}

}
