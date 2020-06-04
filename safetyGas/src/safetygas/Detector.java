package safetyGas;

public class Detector {
	
	private Integer codDetector;
	private Boolean status;
	private Boolean vazamento;


	//Métodos
	
	public void abrir () {
		this.status = true;
			System.out.println("A válvula está aberta");
	}
	public void fechar () {
		this.status = false;
			System.out.println("A válvula está fechada");
	}
	public void notificar() {	
		
		if (this.vazamento = false) {
			System.out.println("Está tudo seguro!");
		}
		else {
			System.out.println("Está ocorrendo um vazamento!");
		}
		
	}
	
	
	//Construtor
	public Detector() {
		this.vazamento = false;
		this.status = false;
		}
	
	//Encap
	public Integer getCodDetector() {
		return codDetector;
	}
	public void setCodDetector(Integer codDetector) {
		this.codDetector = codDetector;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getVazamento() {
		return vazamento;
	}
	public void setVazamento(Boolean vazamento) {
		this.vazamento = vazamento;
	}
	
}

