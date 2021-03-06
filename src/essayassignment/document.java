/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package essayassignment;

/**
 * Document class.
 */
public class document {
   int words;


   /**
    * constructor
    * pre: none
    * post: A Document object created. Words initialized to 0.
    */
   public document() {
      words = 0;        //default words
   }


   /** 
    * Changes the number of document words.
    * pre: none
    * post: Words has been changed.
    */
   public void setWords(int numWords) {
      words = numWords;
   }


   /** 
    * Calculates the number of pages.
    * pre: none
    * post: The number of pages has been returned.
    */
   
   public int calculatePages() {
     final int WORDS_PER_PAGE = 300;
     int pages;


     pages = words / WORDS_PER_PAGE;
     if (words % WORDS_PER_PAGE > 0) {
        pages += 1;
     }     
     return(pages);
   }




   /**
    * Returns the number of words in a document.
    * pre: none
    * post: The number of document words has been returned.
    */
    public int getWords() {
      return(words);
    }
}

