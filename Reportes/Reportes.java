try {

	// Usando el archivo JRXML y el objeto Connection
	Connection cn = DSMySQL.getConnection();
	Map pars = new HashMap();
	JasperReport rep = JasperCompileManager.compileReport(MainView.class.getResourceAsStream("reports/ListaClientes.jrxml"));
	JasperPrint print = JasperFillManager.fillReport(rep, pars, cn);

	// Visualizando el Reporte
	JasperViewer viewer = new JasperViewer(print, false);
	viewer.setTitle("Mi Reporte");
	viewer.setVisible(true);

	//JasperViewer.viewReport(print);
	
} catch (Exception ex) {
	JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRORE", JOptionPane.ERROR_MESSAGE);
}




try {

	// Usando una colección de datos
	IClienteDAO dao = DAOFactory.getDAOFactory().getClienteDAO();
	List lista = dao.consultarTodos();
	JRBeanCollectionDataSource data = new JRBeanCollectionDataSource(lista);
	Map pars = new HashMap();
	JasperReport rep = JasperCompileManager.compileReport(MainView.class.getResourceAsStream("reports/report1.jrxml"));
	JasperPrint print = JasperFillManager.fillReport(rep, pars, data);

	// Visualizando el Reporte
	JasperViewer viewer = new JasperViewer(print, false);
	viewer.setTitle("Mi Reporte");
	viewer.setVisible(true);

	//JasperViewer.viewReport(print);
	
} catch (Exception ex) {
	JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
}


try {
  
  // Cuenta
  String cuenta = txtCuenta.getText();
  // Usando una colección de datos
  RepoController control = new RepoController();
  List<Map<String, ?>> lista = control.traerMovimientos(cuenta);
  JRMapCollectionDataSource data = new JRMapCollectionDataSource(lista);
  Map pars = new HashMap();
  String reporte = "/pe/uni/eurekaapp/reports/RepoMovimientos.jrxml";
  InputStream is = FormMain.class.getResourceAsStream(reporte);
  JasperReport rep = JasperCompileManager.compileReport(is);
  JasperPrint print = JasperFillManager.fillReport(rep, pars, data);

  // Se crea el visor del reporte
  JRViewer jRViewer = new JRViewer(print);
  //se elimina elementos del contenedor JPanel
  panelRepo.removeAll();
  //para el tamaño de l reporte se agrega un BorderLayout
  panelRepo.setLayout(new BorderLayout());
  panelRepo.add(jRViewer, BorderLayout.CENTER);
  jRViewer.setVisible(true);
  panelRepo.repaint();
  panelRepo.revalidate();
  
} catch (Exception ex) {
  Mensaje.showError(rootPane, ex.getMessage());
}