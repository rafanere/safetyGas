/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safetygas;

import java.util.Objects;

/**
 *
 * @author Rafaela
 */
public class Usuario {
    
    private Integer Cod_Usuario;
    private String Email_Usuario;
    private String Nome_Usuario;
    private Integer CPF_Usuario;
    private Integer Identidade_Usuario;
    private Integer CEP_Usuario;
    private Integer Telefone_Usuario;
    private String Endereco_Usuario;

    @Override
    public String toString() {
        return "Usuario{" + "Cod_Usuario=" + Cod_Usuario + ", Email_Usuario=" + Email_Usuario + ", Nome_Usuario=" + Nome_Usuario + ", CPF_Usuario=" + CPF_Usuario + ", Identidade_Usuario=" + Identidade_Usuario + ", CEP_Usuario=" + CEP_Usuario + ", Telefone_Usuario=" + Telefone_Usuario + ", Endereco_Usuario=" + Endereco_Usuario + '}';
    }
    
    
   
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.CPF_Usuario);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.CPF_Usuario, other.CPF_Usuario)) {
            return false;
        }
        return true;
    }


    /**
     * @return the Cod_Usuario
     */
    public Integer getCod_Usuario() {
        return Cod_Usuario;
    }

    /**
     * @param Cod_Usuario the Cod_Usuario to set
     */
    public void setCod_Usuario(Integer Cod_Usuario) {
        this.Cod_Usuario = Cod_Usuario;
    }

    /**
     * @return the Email_Usuario
     */
    public String getEmail_Usuario() {
        return Email_Usuario;
    }

    /**
     * @param Email_Usuario the Email_Usuario to set
     */
    public void setEmail_Usuario(String Email_Usuario) {
        this.Email_Usuario = Email_Usuario;
    }

    /**
     * @return the Nome_Usuario
     */
    public String getNome_Usuario() {
        return Nome_Usuario;
    }

    /**
     * @param Nome_Usuario the Nome_Usuario to set
     */
    public void setNome_Usuario(String Nome_Usuario) {
        this.Nome_Usuario = Nome_Usuario;
    }

    /**
     * @return the CPF_Usuario
     */
    public Integer getCPF_Usuario() {
        return CPF_Usuario;
    }

    /**
     * @param CPF_Usuario the CPF_Usuario to set
     */
    public void setCPF_Usuario(Integer CPF_Usuario) {
        this.CPF_Usuario = CPF_Usuario;
    }

    /**
     * @return the Identidade_Usuario
     */
    public Integer getIdentidade_Usuario() {
        return Identidade_Usuario;
    }

    /**
     * @param Identidade_Usuario the Identidade_Usuario to set
     */
    public void setIdentidade_Usuario(Integer Identidade_Usuario) {
        this.Identidade_Usuario = Identidade_Usuario;
    }

    /**
     * @return the CEP_Usuario
     */
    public Integer getCEP_Usuario() {
        return CEP_Usuario;
    }

    /**
     * @param CEP_Usuario the CEP_Usuario to set
     */
    public void setCEP_Usuario(Integer CEP_Usuario) {
        this.CEP_Usuario = CEP_Usuario;
    }

    /**
     * @return the Telefone_Usuario
     */
    public Integer getTelefone_Usuario() {
        return Telefone_Usuario;
    }

    /**
     * @param Telefone_Usuario the Telefone_Usuario to set
     */
    public void setTelefone_Usuario(Integer Telefone_Usuario) {
        this.Telefone_Usuario = Telefone_Usuario;
    }

    /**
     * @return the Endereco_Usuario
     */
    public String getEndereco_Usuario() {
        return Endereco_Usuario;
    }

    /**
     * @param Endereco_Usuario the Endereco_Usuario to set
     */
    public void setEndereco_Usuario(String Endereco_Usuario) {
        this.Endereco_Usuario = Endereco_Usuario;
    }
        
}
