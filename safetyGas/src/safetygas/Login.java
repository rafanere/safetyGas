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
public class Login {
    
    private Integer Cod_Login;
    private String Login_Usuario;
    private String Senha_Usuario;

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
