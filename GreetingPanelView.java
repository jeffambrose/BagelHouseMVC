package bagelhousemvc;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
   The GreetingPanel class displays a greeting in a panel.
*/

public class GreetingPanelView extends JPanel
{
   private JLabel greeting; // To display a greeting

   /**
      Constructor
   */

   public GreetingPanelView()
   {
      // Create the label.
      greeting = new JLabel("Welcome to Brandi's Bagel House");

      // Add the label to this panel.
      add(greeting);
   }
}
