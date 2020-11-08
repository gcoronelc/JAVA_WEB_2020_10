package pe.eureka.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pe.eureka.db.AccesoDB;
import pe.eureka.dto.UsuarioDto;

public class LogonService {

	public UsuarioDto validar( String usuario, String clave ){
		UsuarioDto usuarioDto = null;
		Connection cn = null;
		try {
			cn = AccesoDB.getConnection();
			String sql = "select chr_emplcodigo, vch_emplpaterno,vch_emplmaterno,"
					+ "vch_emplnombre,vch_emplciudad,vch_empldireccion,vch_emplusuario "
					+ "from empleado where vch_emplusuario = ? and vch_emplclave = ?";
			PreparedStatement pstm = cn.prepareStatement(sql);
			pstm.setString(1, usuario);
			pstm.setString(2, clave);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				usuarioDto = new UsuarioDto();
				usuarioDto.setCodigo(rs.getString("CHR_EMPLCODIGO"));
				usuarioDto.setPaterno(rs.getString("VCH_EMPLPATERNO"));
				usuarioDto.setMaterno(rs.getString("VCH_EMPLMATERNO"));
				usuarioDto.setNombre(rs.getString("VCH_EMPLNOMBRE"));
				usuarioDto.setCiudad(rs.getString("VCH_EMPLCIUDAD"));
				usuarioDto.setDireccion(rs.getString("VCH_EMPLDIRECCION"));
				usuarioDto.setUsuario(rs.getString("VCH_EMPLUSUARIO"));
				usuarioDto.setClave("*****");
			}
			rs.close();
			pstm.close();
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			try {
				cn.close();
			} catch (Exception e2) {
			}
		}
		return usuarioDto;
	}

}
