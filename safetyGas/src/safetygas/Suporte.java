/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safetygas;

/**
 *
 * @author Rafaela
 */
public class Suporte {
    
    private int Cod_Atendimento;
    private int Cod_Usuario;

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

    @Override
    public String toString() {
        return "Suporte{" + "Cod_Atendimento=" + Cod_Atendimento + ", Cod_Usuario=" + Cod_Usuario + '}';
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
    
}
