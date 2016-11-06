package bagelhousemvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BagelHouseController {

	private BagelHouseModel model;
	private BagelHouseView view;
	
	public BagelHouseController(BagelHouseModel m, BagelHouseView v)
	{
		model = m;
		view = v;
		view.AddCalcListener(new AddCalcListener());
	}
}

class AddCalcListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
