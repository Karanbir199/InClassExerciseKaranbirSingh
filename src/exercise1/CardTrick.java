package exercise1;


import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Karanbir Singh
 * @author Jan 31, 2024
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
       
     
        Card[] hand = new Card[7];
        hand[0] = new Card("Diamond",1);
        hand[1] = new Card("Spades",3);
        hand[2] = new Card("Clubs",12);
        hand[3] = new Card("Hearts",13);
        hand[4]= new Card("Hearts",3);
        hand[5]= new Card("Clubs",12);
        hand[6]= new Card("Diamond",11);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your guess for Suit");
        String usersuit=input.nextLine();
        
        Scanner iiut= new Scanner(System.in);
        System.out.println("Enter your guess for number");
        int uservalue = iiut.nextInt();
        
        
        
        
        for (int i = 0; i < hand.length; i++) {
            if (( hand[i].getValue() == uservalue) &&( hand[i].getSuit()==usersuit)){
               
               printInfo();
               break;
}
            else {
                    System.out.println("sorry wrong guess");
                    break;
                    }
            
        }

        
        

}//end of main
        
        
   
    
 
    public static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Karanbir Singh");
        System.out.println();
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Sleeping");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
    }}
