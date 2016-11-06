package bagelhousemvc;

import javax.swing.*;
import java.awt.*;

/**
The BagelPanel class allows the user to select either
a white or whole wheat bagel.
*/

public class BagelPanelView extends JPanel
{
	// The following constants are used to indicate
	// the cost of each type of bagel.
	public final double WHITE_BAGEL = 1.25;
	public final double WHEAT_BAGEL = 1.50;

	private JRadioButton whiteBagel;  // To select white
	private JRadioButton wheatBagel;  // To select wheat
	private ButtonGroup bg;           // Radio button group

	/**
   		Constructor
   	*/

	public BagelPanelView()
	{
		// Create a GridLayout manager with 
		// two rows and one column.
		setLayout(new GridLayout(2, 1));

		// Create the radio buttons.
		whiteBagel = new JRadioButton("White", true);
		wheatBagel = new JRadioButton("Wheat");

		// Group the radio buttons.
		bg = new ButtonGroup();
		bg.add(whiteBagel);
		bg.add(wheatBagel);

		// Add a border around the panel.
		setBorder(BorderFactory.createTitledBorder("Bagel"));

		// Add the radio buttons to the panel.
		add(whiteBagel);
		add(wheatBagel);
	}	

	public String getType()
	{
		if(whiteBagel.isSelected())
			return "white";
		else
			return "wheat";
	}
}