package pe.orozco.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.orozco.app.db.AccesoDB;

import pe.orozco.app.dto.ClientesDto;

public class ClientesService {
	public List<ClientesDto> getAll() {
		List<ClientesDto> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select id, nombre, correo from clientes";
			PreparedStatement pstm = cn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				String correo = rs.getString("correo");
				ClientesDto dto = new ClientesDto(id, nombre, correo);
				lista.add(dto);
			}
			rs.close();
			pstm.close();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
		return lista;
	}

	public void grabar(ClientesDto dto) {
		Connection cn = null;
		String sql = "";
		PreparedStatement pstm;
				try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			sql = "insert into clientes(id,nombre,correo) values(?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, dto.getId());
			pstm.setString(2, dto.getNombre());
			pstm.setString(3, dto.getCorreo());
			pstm.executeUpdate();
			pstm.close();
			cn.commit();
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}
	
	public void editar(ClientesDto dto) {
		Connection cn = null;
		String sql = "";
		PreparedStatement pstm;
		
		try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			sql = "update clientes set nombre=?,correo=? where id=?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, dto.getNombre());
			pstm.setString(2, dto.getCorreo ());
			pstm.setInt(3, dto.getId());
			pstm.executeUpdate();
			pstm.close();
			cn.commit();
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}
	
	public void borrar(int id) {
		Connection cn = null;
		String sql = "";
		PreparedStatement pstm;
		
		try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			sql = "delete from  clientes where id=?";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, id);	
			
			pstm.executeUpdate();
			pstm.close();
			cn.commit();
		} catch (Exception e) {
			try {
				cn.rollback();
			} catch (Exception e1) {
			}
			throw new RuntimeException("Error en el proceso. " + e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}
}