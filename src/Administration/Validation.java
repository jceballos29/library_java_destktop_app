/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administration;

/**
 *
 * @author jcebalus
 */
public class Validation {
    public boolean validateUser(String user, String password){
        String u = "jcebalus";
        String p = "ceballos1";
        return user.equals(u) && password.equals(p);
    }
    
    public boolean validateAdmin(String password){
        return "admin123".equals(password);
    }
}
