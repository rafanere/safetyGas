/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safetyGas;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Rafaela
 */
public class Login {
    //Variáveis da classe
    private Integer Cod_Login;
    private String Login_Usuario;
    private String Senha_Usuario;
    public List <Usuario> usuarios;

//O login do usuário é único, não podendo ser o mesmo para outro usuário
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.Login_Usuario);
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
        final Login other = (Login) obj;
        if (!Objects.equals(this.Login_Usuario, other.Login_Usuario)) {
            return false;
        }
        return true;
    }
     //Conversão para String, bons métodos de Java     
    @Override
    public String toString() {
        return "Login{" + "Cod_Login=" + Cod_Login + ", Login_Usuario=" + Login_Usuario + ", Senha_Usuario=" + Senha_Usuario + '}';
    }

    //Métodos
    
    //Verificação de senha
    public String verificaSenha (String Senha_Usuario){
        if(Senha_Usuario == null){
            return "Preencha o campo da senha";
        }
        if(Senha_Usuario.length() < 6){
            return "Senha inválida";
        }
        if(!Senha_Usuario.equals(Senha_Usuario)){
            return "Senha incorreta. Tente novamente";
        }
        return null;
    }

    //Cadastro de um novo usuário
    public void cadastraUsuario (int Cod_Usuario, String Email_Usuario, String Nome_Usuario, String CPF_Usuario,
         int Identidade_Usuario, int CEP_Usuario, int Telefone_Usuario, String Endereco_Usuario,
         int Cod_Login, String Login_Usuario, String Senha_Usuario) 
    {
        Usuario usuario = new Usuario(Cod_Usuario, Email_Usuario, Nome_Usuario, CPF_Usuario,
         Identidade_Usuario, CEP_Usuario, Telefone_Usuario, Endereco_Usuario,
         Cod_Login, Login_Usuario, Senha_Usuario);
        this.usuarios.add(usuario);
    }
    
    //Redefinição de senha
    public void esqueciSenha(){
    }
    
    //Encapsulamento
    
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
    
}
