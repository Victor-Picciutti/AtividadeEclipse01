package br.com.fabricaroupa.teste;

import java.sql.Connection;

import javax.swing.JOptionPane;

import br.com.fabricaroupa.conexao.Conexao;
import br.com.fabricaroupa.dao.CalcaDAO;
import br.com.fabricaroupa.model.Calca;

public class CalcaInserir {

	public static void main(String[] args) 
	{
		Connection con = Conexao.abrirConexao();

		Calca calca = new Calca();
		CalcaDAO calcadao = new CalcaDAO(con);////////

		calca.setCor(JOptionPane.showInputDialog("Digite a cor da calca: "));
		calca.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da calca: ")));
		calca.setQuantidadeBotao(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de botaões: ")));
		calca.setTipoTecido(JOptionPane.showInputDialog("Digite o tipo de tecido da calca: "));
		System.out.println(calcadao.inserir(calca));
		Conexao.fecharConexao(con);

	}

}
