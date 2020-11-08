package pe.eureka.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pe.eureka.db.AccesoDB;

public class EurekaService {

	public void registrarDeposito(String cuenta, double importe, String empleado) {
		Connection cn = null;
		try {
			// Conexión
			cn = AccesoDB.getConnection();
			cn.setAutoCommit(true);
			// Proceso
			String sql = "{call eureka.usp_egcc_deposito(?,?,?)}";
			CallableStatement cstm = cn.prepareCall(sql);
			cstm.setString(1, cuenta);
			cstm.setDouble(2, importe);
			cstm.setString(3, empleado);
			cstm.executeUpdate();
			cstm.close();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e) {
			}
		}
	}
	
	public List<Map<String, ?>> getMovimientos(String cuenta) {
		List<Map<String, ?>> lista = new ArrayList<>();
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select cuencodigo, monenombre, cuensaldo, cuenestado, "
					  + "movinumero, movifecha, moviimporte, tipocodigo, tiponombre "
					  + "from EUREKA.v_movimientos where cuencodigo = ?";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, cuenta);
			ResultSet rs = pstm.executeQuery();
			lista = JdbcUtil.rsToList(rs);
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

}
