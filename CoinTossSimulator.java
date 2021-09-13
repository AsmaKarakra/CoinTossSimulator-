/// Name: Asma Karakra
// USC NetID: Karakra
// CS 455 PA1
// Fall 2021

/**
 * class CoinTossSimulator
 * 
 * Simulates trials of repeatedly tossing two coins and allows the user to access the
 * cumulative results.
 * 
 * NOTE: we have provided the public interface for this class.  Do not change
 * the public interface.  You can add private instance variables, constants, 
 * and private methods to the class.  You will also be completing the 
 * implementation of the methods given. 
 * 
 * Invariant: getNumTrials() = getTwoHeads() + getTwoTails() + getHeadTails()
 * 
 */

import java.util.Random;

public class CoinTossSimulator {

   //Initialize vars for CoinTossSimulator

   private int twoHeadsToss;
   private int twoTailsToss;
   private int oneHeadOneTailToss;
   private int numberOfTrials;

   /**
      Creates a coin toss simulator with no trials done yet.
   */
   public CoinTossSimulator() {

      // Add data to vars initialized

      twoHeadsToss = 0;
      twoTailsToss = 0;
      oneHeadOneTailToss = 0;
      numberOfTrials = 0;

   }


   /**
      Runs the simulation for numTrials more trials. Multiple calls to this method
      without a reset() between them *add* these trials to the current simulation.
      
      @param numTrials  number of trials to for simulation; must be >= 1
    */
   public void run(int numTrials) {

      // Number of Trials is current simulation + trials before last rest
      numberOfTrials = numTrials + numberOfTrials;

      int coin1 = 0;
      int coin2 = 0;

      Random coinOneFlip = new Random();
      Random coinTwoFlip = new Random();


      for (int trialIndex = 1; trialIndex < numTrials + 1; trialIndex++) {

         /*

         Assume:
           Head = 1
           Tail = 0

          */

         // Generate random number from 0 to 1
         coin1 = coinOneFlip.nextInt(2);
         coin2 = coinTwoFlip.nextInt(2);


         //Case 1: One head and one tail
         if (coin1 == 1 && coin2 == 0) {
            oneHeadOneTailToss++;
         } // Case 2: one tail and one head (flipped)
         if (coin1 == 0 && coin2 == 1) {
            oneHeadOneTailToss++;
         } // Case 3: two tails
         if (coin1 == 0 && coin2 == 0) {
            twoTailsToss++;
         } // Case 4: two heads
         if (coin1 == 1 && coin2 == 1) {
            twoHeadsToss++;
         }
      }
   }




   /**
      Get number of trials performed since last reset.
   */
   public int getNumTrials() {
      return  numberOfTrials;
   }


   /**
      Get number of trials that came up two heads since last reset.
   */
   public int getTwoHeads() {
      return twoHeadsToss;
   }


   /**
     Get number of trials that came up two tails since last reset.
   */  
   public int getTwoTails() {
      return twoTailsToss;
   }


   /**
     Get number of trials that came up one head and one tail since last reset.
   */
   public int getHeadTails() {
       return oneHeadOneTailToss;
   }


   /**
      Resets the simulation, so that subsequent runs start from 0 trials done.
    */
   public void reset() {

      twoHeadsToss = 0;
      twoTailsToss = 0;
      oneHeadOneTailToss = 0;
      numberOfTrials = 0;

   }

}
