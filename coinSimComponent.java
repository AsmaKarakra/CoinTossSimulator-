// Name: Asma Karakra
// USC NetID: Karakra
// CS 455 PA1
// Fall 2021
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class coinSimComponent extends JComponent {

        // Instance variable
        private final int BAR_WIDTH = 20;               // Set barwidth to 20
        private final int VERTICAL_BOUNDARY = 20;       // set Vertical boundary to 20
        private int viewerHeight;                       // var displays window height
        private int ViewerWidth;                        // var displays windows width
        private int barSpaceBuffer;                     // Space between bars determined by viewer width
        private double barScale;                        // Scale is Height of Viewer / Total Number of Trials
        private CoinTossSimulator CoinTossComponent;    // Object used to simulate coin toss


        /**
         * This is the constructor of CoinSimComponent class. Input is number of trails
         *
         * @param numTrails is number of trails
         */

    public coinSimComponent(int numTrails) {
        this.CoinTossComponent = new CoinTossSimulator();
        CoinTossComponent.run(numTrails);
    }


    public void paintComponent(Graphics g) {
            barScale = (getHeight() * 0.7) / CoinTossComponent.getNumTrials();  // Scale is 70% : Height of Viewer / Total Number of Trials
            barSpaceBuffer = getWidth() / 4;
            viewerHeight = getHeight();
            ViewerWidth = getWidth();

            // Calculate lefttop position of bars
            int left_bar1 = ViewerWidth / 2 - barSpaceBuffer - BAR_WIDTH / 2;
            int left_bar2 = ViewerWidth / 2 - BAR_WIDTH / 2;
            int left_bar3 = ViewerWidth / 2 + barSpaceBuffer - BAR_WIDTH / 2;



            // System.out.println("Scale: " + barScale);
            Graphics2D g2 = (Graphics2D) g;

            // Calculate Bar height = barScale * number of two heads
            double barHeight_bar1 = barScale * CoinTossComponent.getTwoHeads();
            double barHeight_bar2 = barScale * CoinTossComponent.getHeadTails();
            double barHeight_bar3 = barScale * CoinTossComponent.getTwoTails();



            // String label of bars
            String barLabel1 = "Two Heads: " + CoinTossComponent.getTwoHeads()
                    + " (" + Math.round((double) CoinTossComponent.getTwoHeads() * 100 / CoinTossComponent.getNumTrials()) + "%)";
            String barLabel2 = "A Tail and a Head: " + CoinTossComponent.getHeadTails()
                    + " (" + Math.round((double) CoinTossComponent.getHeadTails() * 100 / CoinTossComponent.getNumTrials()) + "%)";
            String barLabel3 = "Two Tails: " + CoinTossComponent.getTwoTails()
                    + " (" + Math.round((double) CoinTossComponent.getTwoTails() * 100 / CoinTossComponent.getNumTrials()) + "%)";


            // left bar: Two head
            Bar bar1 = new Bar(viewerHeight - VERTICAL_BOUNDARY, left_bar1, BAR_WIDTH, (int) barHeight_bar1, barScale, new Color(255, 0, 0), barLabel1);
            // middle bar: A head and a tail
            Bar bar2 = new Bar(viewerHeight - VERTICAL_BOUNDARY, left_bar2, BAR_WIDTH, (int) barHeight_bar2, barScale, new Color(0, 255, 0), barLabel2);
            // right bar: Two Tails
            Bar bar3 = new Bar(viewerHeight - VERTICAL_BOUNDARY, left_bar3, BAR_WIDTH, (int) barHeight_bar3, barScale, new Color(0, 0, 255), barLabel3);

            // Draw bars
            bar1.draw(g2);
            bar2.draw(g2);
            bar3.draw(g2);
        }
    }
