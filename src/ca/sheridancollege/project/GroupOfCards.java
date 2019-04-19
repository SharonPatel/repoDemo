/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
{

   
   
    //The group of cards, stored in an ArrayList
    private Card cards;
    
    private int size;//the size of the grouping
    
    public GroupOfCards(int givenSize)
    {
        size = givenSize;
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public static void main(String[] args){
        boolean isvalid = false;
        
         Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of cards");
        int noofCards = in.nextInt();
        if(showCard(noofCards)){
            isvalid = true;
        }
       
    }
    public  Card showCards()
    {
       return cards;
    }
    public static boolean showCard(int no){
         boolean isvalid = false;
       
        if(no <= 5){
         return true;
        }
        return false;
        
    }
    
    public  void shuffle()
    {
        Collections.shuffle((List<?>) cards);
        
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    
}//end class
