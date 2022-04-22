/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import java.io.Serializable;
import java.util.Random;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author casa
 */
@ManagedBean
@SessionScoped
public class UserNumberBean implements Serializable {

    Integer randomInt = null;        
    private int maximum = 10;
    private int minimum = 0;
    Integer userNumber = null;
    String response = null;

    /**
     * random.nextInt: devuelve un entero aleatorio (int) mayor o igual a 0 pero menor que n
     */
    public UserNumberBean() {
        Random randomGR = new Random();
        randomInt = new Integer(randomGR.nextInt(maximum + 1));
        // Print number to server log
        System.out.println("Duke's number: " + randomInt);
    }
    
  

    public String getResponse() {
         if((userNumber == null) || (userNumber.compareTo(randomInt) != 0)){
            return "Lo siento, "+userNumber+" es incorresto";
        }else{
            return "¡Yay! ¡Lo tienes!";
        }
    }
    
    
    

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }
    

}
