package model;

public class JavaBeans {
	private String idcon;
	private String nomePaciente;
	private String nomeExame;
	private String dataExame;
	private String obs;
	private String resultado;
	private String createData;
	private String updateData;
	
	public JavaBeans() {
		super();
		
	}
	
	public JavaBeans(String idcon, String nomePaciente, String nomeExame, String dataExame, String obs,
			String resultado, String createData, String updateData) {
		super();
		this.idcon = idcon;
		this.nomePaciente = nomePaciente;
		this.nomeExame = nomeExame;
		this.dataExame = dataExame;
		this.obs = obs;
		this.resultado = resultado;
		this.createData = createData;
		this.updateData = updateData;
	}

	public String getIdcon() {
		return idcon;
	}
	public void setIdcon(String idcon) {
		this.idcon = idcon;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	public String getNomeExame() {
		return nomeExame;
	}
	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}
	public String getDataExame() {
		return dataExame;
	}
	public void setDataExame(String dataExame) {
		this.dataExame = dataExame;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getCreateData() {
		return createData;
	}
	public void setCreateData(String createData) {
		this.createData = createData;
	}
	public String getUpdateData() {
		return updateData;
	}
	public void setUpdateData(String updateData) {
		this.updateData = updateData;
	}

}
