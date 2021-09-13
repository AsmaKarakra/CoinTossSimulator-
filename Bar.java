// Name: Asma Karakra
// USC NetID: Karakra
// CS 455 PA1
// Fall 2021
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;

/**
 * Bar class
 * A labeled bar that can serve as a single bar in a bar graph.
 * The text for the barLabel is centered under the bar.
 * 
 * NOTE: we have provided the public interface for this class. Do not change
 * the public interface. You can add private instance variables, constants,
 * and private methods to the class. You will also be completing the
 * implementation of the methods given.
 * 
 */

public class Bar {

   // Private instance variables define here

   private int barHeight;
   private double scale;
   private Color barColor;
   private String barLabel;
   private int barBottom;
   private int yLeft;
   private int barWidth;


   /**
    Creates a labeled bar.  You give the height of the bar in application
    units (e.g., population of a particular state), and then a scale for how
    tall to display it on the screen (parameter scale).

    @param bottom  location of the bottom of the barLabel
    @param left  location of the left side of the bar
    @param barWidth  barWidth of the bar (in pixels)
    @param barHeight  height of the bar in application units
    @param scale  how many pixels per application unit
    @param barColor  the barColor of the bar
    @param barLabel  the barLabel at the bottom of the bar
    */
   public Bar(int bottom, int left, int barWidth, int barHeight,
              double scale, Color barColor, String barLabel) {
      this.barBottom = bottom;
      this.yLeft = left;
      this.barWidth = barWidth;
      this.barHeight = barHeight;
      this.scale = scale;
      this.barColor = barColor;
      this.barLabel = barLabel;
   }

   /**
    Draw the labeled bar.
    @param g2  the graphics context
    */
   public void draw(Graphics2D g2) {

      // Obtain label height and label width
      Font barFont = g2.getFont();
      FontRenderContext barContext = g2.getFontRenderContext();
      Rectangle2D labelBounds = barFont.getStringBounds(barLabel,barContext);
      int labelBarHeight = (int)labelBounds.getHeight();
      int labelBarWidth = (int)labelBounds.getWidth();


      // Create a bar
      Rectangle bar = new Rectangle(yLeft, barBottom - labelBarHeight * 2, barWidth, barHeight);
      g2.setColor(barColor);                                    // Set bar color
      g2.fill(bar);                                            // Draw bar element
      g2.drawString(barLabel,(yLeft+ barWidth /2)-labelBarWidth/2,barBottom-labelBarHeight); // Draw barLabel element
   }
}
