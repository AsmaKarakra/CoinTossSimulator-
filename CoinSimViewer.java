// Name: Asma Karakra
// USC NetID: Karakra
// CS 455 PA1
// Fall 2021
import java.util.Scanner;
import javax.swing.JFrame;

public class CoinSimViewer {

    public static void main (String[] args) {

        System.out.print("Enter Number of Trials for Coin Toss: ");
        Scanner coinTossScanner = new Scanner(System.in);
        int numberofTrials = coinTossScanner.nextInt();

        if (numberofTrials < 0 || numberofTrials == 0) {
            while (numberofTrials < 0 || numberofTrials == 0) {
                System.out.print("ERROR - Number of trials must be greater than zero. Try again! ");
                System.out.print("Please re-enter number of trails for coin toss: ");
                numberofTrials = coinTossScanner.nextInt();
            }
        }


        //Creating a new JFrame Object

        JFrame coinTossFrame = new JFrame(); // Creates a new window to hold graph object

        coinTossFrame.setSize(800, 500);
        coinTossFrame.setTitle("Coin Toss Simulator");
        coinTossFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating new componentSim Object
        coinSimComponent componentSim = new coinSimComponent(numberofTrials);

        //Adding componentSim object to Frame
        coinTossFrame.add(componentSim);

        coinTossFrame.setVisible(true);
    }
}
