/**
 * Author: Hamza Khan 
 * Date: 9/11/2023
 * Description; Program will display all the possible outputs for all teams playing each other in the tournament
 *              Without repeating a game already which has been displayed by having a continue statement.  
 * 
 */
public class teamsTournament {


	public static void main(String[] args) {

		//for loop to run teamA to play with all teams 
		for (int teamA = 1; teamA < 7; teamA++) {
			
			//for loop to run teamB to play with all possible teams 
            for (int teamB = 1; teamB < 7; teamB++) {
                
            	//if both teams have the same value then the program will continue and print 
            	if (teamA == teamB) {
                    continue;
                }
            	
            	// print the output which is met each time from the for loop 
                System.out.println("Team "+ teamA + " plays Team "+ teamB + "\n");
            }
        }
			
		}
		
		
		
		
	}


