package br.com.montadora.teste;

import javax.swing.JOptionPane;

import br.com.montadora.model.Moto;

public class TesteMoto {

	public static void main(String[] args) {
		Moto moto = new Moto();
		
		moto.setFabricante(JOptionPane.showInputDialog("Digite o fabricante da moto: "));
		moto.setModelo(JOptionPane.showInputDialog("Digite o modelo da moto: "));
		moto.setAdesivo(JOptionPane.showInputDialog("Digite o adesivo da moto: "));
		
		
		System.out.println("O fabricante da moto é: " + moto.getFabricante() + "\nO modelo da moto é: " + moto.getModelo() + "\nO adesivo da moto é: " + moto.getAdesivo());

	}

}
