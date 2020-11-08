package pe.eureka.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRMapCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import pe.eureka.dto.Mensaje;
import pe.eureka.dto.UsuarioDto;
import pe.eureka.service.EurekaService;

/**
 * Servlet implementation class EurekaController
 */
@WebServlet({ "/Deposito", "/Retiro", "/Consulta","/RepoMovimientos" })
public class EurekaController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		switch (path) {
		case "/Deposito":
			deposito(request, response);
			break;
		case "/Retiro":
			retiro(request, response);
			break;
		case "/RepoMovimientos":
			repoMovimientos(request, response);
			break;
		}
	}


	private void repoMovimientos(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		try {
			// Datos
			String cuenta = request.getParameter("cuenta");
			// Proceso
			EurekaService service = new EurekaService();
			List<Map<String, ?>> lista = service.getMovimientos(cuenta);
			// Preparar reporte
			ServletConfig config = getServletConfig();
			ServletContext sc = config.getServletContext();
			JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
			Map pars = new HashMap<>();
			//String reporte = "/pe/eureka/reportes/repoMovimientos.jasper";
			String reporte = "/reportes/repoMovimientos.jasper";
			InputStream is = sc.getResourceAsStream(reporte);
			if(is == null){
				throw new Exception("Reporte no existe.");
			}
			JasperReport rep = (JasperReport) JRLoader.loadObject(is);
			byte[] bytes = JasperRunManager.runReportToPdf(rep, null, data);
			// Preparar el reporte
			response.setContentType("application/pdf");
			response.setContentLengthLong(bytes.length);
			ServletOutputStream out = response.getOutputStream();
			out.write(bytes, 0, bytes.length);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.println("Error: " + e.getMessage());
			out.close();
		}
		
		
	}


	private void retiro(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}


	private void deposito(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		Mensaje mensaje = new Mensaje();
		
		try {
			// Datos
			String cuenta = request.getParameter("cuenta");
			double importe = Double.parseDouble(request.getParameter("importe"));
			// El empleado
			HttpSession session = request.getSession();
			UsuarioDto dto = (UsuarioDto) session.getAttribute("usuario");
			// Proceso
			EurekaService service = new EurekaService();
			service.registrarDeposito(cuenta, importe, dto.getCodigo());
			// Reporte
			mensaje.setCode(1);
			mensaje.setMessage("Proceso ok.");
		} catch (Exception e) {
			mensaje.setCode(-1);
			mensaje.setMessage("Error en el proceso.");
			mensaje.setError(e.getMessage());
		}
		
		// Envio del reporte
		UtilController.enviar(request, response, mensaje);
		
	}

	
	
}
