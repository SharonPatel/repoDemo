package ca.sheridancollege.project;

import java.util.Scanner;


//liskov substitution principle 
public abstract class SystemManagement extends Game {

	private int playerID;

    public SystemManagement(String givenName, String name) {
        //liskov substitution principle 
        super(givenName, name);
    }

	public int getPlayerID() {
		return this.playerID;
	}

	/**
	 * 
	 * @param playerID
	 */
	

	public abstract void declareWinner();
        
   public static void main(String[] args){
       boolean isvalid = false;
       Scanner in = new Scanner(System.in);
       System.out.println("Enter PlayerID:");
       int playerid = in.nextInt();
      if(setPlayerID(playerid)){
           isvalid =  true;
      }
   }
    public static boolean setPlayerID(int playerId){
        if(playerId >= 5){
            return true;
        }
        return false;
    }
}