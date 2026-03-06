package br.com.fabricaroupa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricaroupa.model.Calca;

public class CalcaDAO 
{
	private Connection con = null;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public CalcaDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Calca calca) {
		String sql = "insert into calca(tipotecido, cor, peso, quantidadebotao) values (?,?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, calca.getTipoTecido());
			ps.setString(2, calca.getCor());
			ps.setDouble(3, calca.getPeso());
			ps.setInt(4, calca.getQuantidadeBotao());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}
