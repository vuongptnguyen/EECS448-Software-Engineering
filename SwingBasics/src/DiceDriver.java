import javax.swing.*;


public class DiceDriver {
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Dice");
		Dice dice = new Dice();
		
		frame.getContentPane().add(dice.getContent());
		frame.pack();
		frame.setSize(400, 100);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createAndDisplayGUI();
	}

}
