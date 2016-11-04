/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package essayassignment;

/**
 *
 * @author masea3439
 */
public class essay extends document {

    private int MIN_WORDS = 1500;
    private int MAX_WORDS = 3000;
    
    /**
     * This method checks if there is a valid number of words
     * post: returns isValid
     */
    public boolean validLength() {
        boolean isValid = true;
        if (words <= MAX_WORDS && words >= MIN_WORDS) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }
}
