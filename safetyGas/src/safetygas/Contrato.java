package safetyGas;

import java.util.Date;

public class Contrato {
	
	private Integer codContrato;
	private Date dtaIni;
	private Date dtaFim;
	private Float valorContrato;
		
		
	public Integer getcodContrato(){
		return codContrato;
}	

	public Date getdtaIni() {
		return dtaIni;
	}
	
	public Date getdtaFim() {
		return dtaFim;
	}
	
	public Float getvalorContrato() {
		return valorContrato;
	}
	
	public void setcodContrato (Integer codContrato) {
		this.codContrato = codContrato;
	}
	public void setdtaIni (Date dtaIni) {
		this.dtaIni = dtaIni;
	}
	public void setdtaFim (Date dtaFim) {
		this.dtaIni = dtaFim;
	}
	public void setvalorContrato (Float valorContrato) {
		this.valorContrato = valorContrato;		
	}	
}
