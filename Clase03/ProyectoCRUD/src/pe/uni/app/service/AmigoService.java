package pe.uni.app.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pe.uni.app.db.AccesoDB;
import pe.uni.app.dto.AmigoDto;

public class AmigoService {
	
	public List<AmigoDto> getAll(){
		List<AmigoDto> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select id, nombre, edad from amigos";
			PreparedStatement pstm = cn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				int edad = rs.getInt("edad");
				AmigoDto dto = new AmigoDto(id, nombre, edad);
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
	
	
	public void grabar(AmigoDto dto){
		Connection cn = null;
		String sql = "";
		PreparedStatement pstm;
		ResultSet rs = null;
		try {
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(false);
			sql = "insert into amigos(id,nombre,edad) values(?,?,?)";
			pstm = cn.prepareStatement(sql);
			pstm.setInt(1, dto.getId());
			pstm.setString(2, dto.getNombre());
			pstm.setInt(3,dto.getEdad());
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
