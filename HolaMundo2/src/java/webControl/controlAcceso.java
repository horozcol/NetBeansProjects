/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webControl;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author hol
 */
@Named(value = "controlAcceso")
@RequestScoped
public class controlAcceso {

    String login = "";

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Creates a new instance of controlAcceso
     */
    public controlAcceso() {
    }
}
