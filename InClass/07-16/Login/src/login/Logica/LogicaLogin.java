/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Logica;

public class LogicaLogin {

    private String txtUser;
    private String txtPass;
    
   public boolean isValid(String user, String pass) {
       this.txtUser = user;
       this.txtPass = pass;
       String userEnd = "@gmail.com";
       boolean valid = false;
       if (user.contains(userEnd)){
           valid = true;
       }
        return valid;
    }
}
