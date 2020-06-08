/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safetyGas;

/**
 *
 * @author Rafaela
 */
public class Suporte {
    
    private int Cod_Atendimento;
    private int Cod_Usuario;
    private boolean status;

    @Override
    public String toString() {
        return "Suporte{" + "Cod_Atendimento=" + Cod_Atendimento + ", Cod_Usuario=" + Cod_Usuario + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.Cod_Atendimento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Suporte other = (Suporte) obj;
        if (this.Cod_Atendimento != other.Cod_Atendimento) {
            return false;
        }
        return true;
    }

    
    public void contato_Suporte_Tecnico(){
    }
    
    public void responder_Duvidas(){
    }
    
    public void fechar () {
        this.setStatus((Boolean) false);
			System.out.println("A válvula está fechada");
	}
    
    /**
     * @return the Cod_Atendimento
     */
    public int getCod_Atendimento() {
        return Cod_Atendimento;
    }

    /**
     * @param Cod_Atendimento the Cod_Atendimento to set
     */
    public void setCod_Atendimento(int Cod_Atendimento) {
        this.Cod_Atendimento = Cod_Atendimento;
    }

    /**
     * @return the Cod_Usuario
     */
    public int getCod_Usuario() {
        return Cod_Usuario;
    }

    /**
     * @param Cod_Usuario the Cod_Usuario to set
     */
    public void setCod_Usuario(int Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    /**
     * @return the status
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
    
}