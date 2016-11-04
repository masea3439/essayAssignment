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
public class EssayAssignment {

    /**
     * This method creates an essay and sets its words 
     * pre: args 
     * post: prints info on essay
     */
    public static void main(String[] args) {
        essay theOne = new essay();
        theOne.setWords(1700);
        System.out.println("There are "+theOne.calculatePages()+" pages and "+theOne.getWords()+" words");
        System.out.println("Is valid: "+theOne.validLength());
    }
    
}
