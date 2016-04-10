import javax.swing.*;

public class tempConverterDriver {

	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		tempConverter tempConverter = new tempConverter();
		
		frame.getContentPane().add(tempConverter.getContent());
		frame.pack();
		frame.setSize(450, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createAndDisplayGUI();
	}

}
