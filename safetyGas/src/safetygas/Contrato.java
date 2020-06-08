package safetyGas;


public class Contrato {
	//Variáveis da classe
	private Integer codContrato;
	private String dtaIni;
	private String dtaFim;
	private Float valorContrato;
	private Boolean statusContrato;
	

	//Métodos
	
        //Ativa o contrato
	public void ativarContrato () {
		this.statusContrato=true;
		System.out.println("O contrato foi ativado");
		
	}
        
	//Desativa o contrato em caso de cancelamento ou término
	public void desativarContrato () {
		this.statusContrato=false;
		System.out.println("O contrato foi desativado");
		
	}
	
	
	//Construtor
	public Contrato (Integer codContrato,String dtaIni, Float valorContrato){
		this.codContrato = codContrato;
		this.dtaIni=dtaIni;
		this.valorContrato = valorContrato;
		
		
	}
	
        
        //Encapsulamento
        
	public Integer getCodContrato() {
		return codContrato;
	}
	public void setCodContrato(Integer codContrato) {
		this.codContrato = codContrato;
	}
	public String getDtaIni() {
		return dtaIni;
	}
	public void setdtaIni(String dtaIni) {
		
		this.dtaIni = dtaIni;
	}
	
	public String getDtaFim() {
		return dtaFim;
	}
	public void setDtaFim(String dtaFim) {
		this.dtaFim = dtaFim;
	}
	public Float getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(Float valorContrato) {
		this.valorContrato = valorContrato;
	}
	public Boolean getStatusContrato() {
		return statusContrato;
	}
	public void setStatusContrato(Boolean statusContrato) {
		this.statusContrato = statusContrato;
	}


	
}
	














