package bagelhousemvc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class BagelHouseView extends JFrame {

	private BagelPanelView bagels;     // Bagel panel
	private ToppingPanelView toppings; // Topping panel
	private CoffeePanelView coffee;    // Coffee panel
	private GreetingPanelView banner;  // To display a greeting
	private JPanel buttonPanel;    // To hold the buttons
	private JButton calcButton;    // To calculate the cost
	private JButton exitButton;    // To exit the application 
	private JButton button;
	private BagelHouseModel bill;

	/**
      Constructor
	 */

	public BagelHouseView()
	{
		// Display a title.
		setTitle("Order Calculator");

		// Specify an action for the close button.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a BorderLayout manager.
		setLayout(new BorderLayout());

		// Create the custom panels.
		banner = new GreetingPanelView();
		bagels = new BagelPanelView();
		toppings = new ToppingPanelView();
		coffee = new CoffeePanelView();

		// Create the button panel.
		buildButtonPanel();

		// Add the components to the content pane.
		add(banner, BorderLayout.NORTH);
		add(bagels, BorderLayout.WEST);
		add(toppings, BorderLayout.CENTER);
		add(coffee, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);

		// Pack the contents of the window and display it.
		pack();
		setVisible(true);
	}

	/**
      	The buildButtonPanel method builds the button panel.
	 */

	private void buildButtonPanel()
	{
		// Create a panel for the buttons.
		buttonPanel = new JPanel();

		// Create the buttons.
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");

		// Register the action listeners.
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());

		// Add the buttons to the button panel.
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}

	/**
      	Private inner class that handles the event when
      	the user clicks the Calculate button.
	 */

	public class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// Variables to hold the subtotal, tax, and total
			double subtotal;
			bill = new BagelHouseModel();
       
			// Calculate the subtotal.
			double bills[] = new double[3];
			bills = bill.gettheBill(bagels.getType(), coffee.selection(), toppings.getToppingType());
			subtotal = bills[0] +  bills[1] +  bills[2];
         
			// Create a DecimalFormat object to format output.
			DecimalFormat dollar = new DecimalFormat("0.00");

			// Display the charges.
			JOptionPane.showMessageDialog(null, "Subtotal: $" +
					dollar.format(subtotal) + "\n" +
					"Tax: $" + dollar.format(bills[3]) + "\n" +
					"Total: $" + dollar.format(bills[4]));         
		}	
	}

	/**
      	Private inner class that handles the event when
      	the user clicks the Exit button.
	 */

	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	public void AddCalcListener(ActionListener addCalcListener) {
		// TODO Auto-generated method stub
		button.addActionListener(addCalcListener);
	}
}
