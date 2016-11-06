package bagelhousemvc;

import javax.swing.JFrame;

public class BagelHouseMVC {

	public static void main(String[] args)
	   {
	      BagelHouseView frame = new BagelHouseView();
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      BagelHouseModel model = new BagelHouseModel();
	      BagelHouseController controller = new BagelHouseController(model, frame);
	      frame.setVisible(true);
	   }
}
