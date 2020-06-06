/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safetygas;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Rafaela
 */
public class Usuario {
    
    private Integer Cod_Usuario;
    private String Email_Usuario;
    private String Nome_Usuario;
    private String CPF_Usuario;
    private Integer Identidade_Usuario;
    private Integer CEP_Usuario;
    private Integer Telefone_Usuario;
    private String Endereco_Usuario;
    private Integer Cod_Login;
    private String Login_Usuario;
    private String Senha_Usuario;
    private Integer Cod_Usuario_Favorito;
    public List <Usuario> usuarios;
    

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

    //Métodos

    public Usuario (int Cod_Usuario, String Email_Usuario, String Nome_Usuario, String CPF_Usuario, 
                int Identidade_Usuario, int CEP_Usuario, int Telefone_Usuario, String Endereco_Usuario,
                int Cod_Login, String Login_Usuario, String Senha_Usuario)
                {
        this.Cod_Usuario = Cod_Usuario;
        this.Email_Usuario = Email_Usuario;
        this.Nome_Usuario = Nome_Usuario;
        this.CPF_Usuario = CPF_Usuario;
        this.Identidade_Usuario = Identidade_Usuario;
        this.CEP_Usuario = CEP_Usuario;
        this.Telefone_Usuario = Telefone_Usuario;
        this.Endereco_Usuario = Endereco_Usuario;   
        this.Cod_Login = Cod_Login;
        this.Login_Usuario = Login_Usuario;
        this.Senha_Usuario = Senha_Usuario;
                
    }

    public void atualizarUsuario (){
    
    }
            
    public void acrescentarFavorito (int Cod_Usuario_Favorito){
    
    }
    
    public void removerFavorito (int Cod_Usuario_Favorito){
    
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
    public String getCPF_Usuario() {
        return CPF_Usuario;
    }

    /**
     * @param CPF_Usuario the CPF_Usuario to set
     */
    public void setCPF_Usuario(String CPF_Usuario) {
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

    /**
     * @return the Cod_Login
     */
    public Integer getCod_Login() {
        return Cod_Login;
    }

    /**
     * @param Cod_Login the Cod_Login to set
     */
    public void setCod_Login(Integer Cod_Login) {
        this.Cod_Login = Cod_Login;
    }

    /**
     * @return the Login_Usuario
     */
    public String getLogin_Usuario() {
        return Login_Usuario;
    }

    /**
     * @param Login_Usuario the Login_Usuario to set
     */
    public void setLogin_Usuario(String Login_Usuario) {
        this.Login_Usuario = Login_Usuario;
    }

    /**
     * @return the Senha_Usuario
     */
    public String getSenha_Usuario() {
        return Senha_Usuario;
    }

    /**
     * @param Senha_Usuario the Senha_Usuario to set
     */
    public void setSenha_Usuario(String Senha_Usuario) {
        this.Senha_Usuario = Senha_Usuario;
    }

    /**
     * @return the Cod_Usuario_Favorito
     */
    public Integer getCod_Usuario_Favorito() {
        return Cod_Usuario_Favorito;
    }

    /**
     * @param Cod_Usuario_Favorito the Cod_Usuario_Favorito to set
     */
    public void setCod_Usuario_Favorito(Integer Cod_Usuario_Favorito) {
        this.Cod_Usuario_Favorito = Cod_Usuario_Favorito;
    }
        
}
