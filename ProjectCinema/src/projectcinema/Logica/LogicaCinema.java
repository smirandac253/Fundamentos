
package projectcinema.Logica;


public class LogicaCinema {
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
