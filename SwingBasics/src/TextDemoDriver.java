import javax.swing.*;

public class TextDemoDriver {
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		TextDemo demo = new TextDemo();
		
		frame.getContentPane().add(demo.getContent());
		frame.pack();
		frame.setSize(400, 100);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		createAndDisplayGUI();
	}

}
