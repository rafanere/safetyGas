package safetyGas;

import java.util.Date;

public class Contrato {
	
	private Integer codContrato;
	private Date dtaIni;
	private Date dtaFim;
	private Float valorContrato;
	private Boolean status;
	
	//Métodos
	
	public void ativarContrato () {
		this.status=true;
	}
	public void desativarContrato () {
		this.status=false;
	}
	
	
	
	
	//Construtor
	public Contrato () {
		this.status = false;
	}
	
	public Integer getCodContrato() {
		return codContrato;
	}
	public void setCodContrato(Integer codContrato) {
		this.codContrato = codContrato;
	}
	public Date getDtaIni() {
		return dtaIni;
	}
	public void setDtaIni(Date dtaIni) {
		this.dtaIni = dtaIni;
	}
	public Date getDtaFim() {
		return dtaFim;
	}
	public void setDtaFim(Date dtaFim) {
		this.dtaFim = dtaFim;
	}
	public Float getValorContrato() {
		return valorContrato;
	}
	public void setValorContrato(Float valorContrato) {
		this.valorContrato = valorContrato;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
		

	
}
	














