import javax.swing.*;
import java.awt.*;

public class HelloWorld {
	
	//create GUI
	private static void createAndShowGUI() {
		//Create and set it the window
		JFrame frame = new JFrame("Hello World!"); //title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit when closed
		
		//create panel.
		JPanel content = new JPanel();
		
		//create buttons
		JButton leftButton = new JButton("LEFT");
		JButton rightButton = new JButton("RIGHT");
		JButton middleButton = new JButton("MIDDLE");
		
		//create label
		JLabel label = new JLabel("Hello world");
		
		//Add buttons and label to panel
		content.add(leftButton);
		content.add(rightButton);
		content.add(middleButton);
		content.add(label);
		
		//add content  to the main pane
		frame.getContentPane().add(content);
		
		//display window
		frame.pack(); //put everything together
		frame.setVisible(true); //make it visible
		
	}
	
	public static void main(String[] args) {
		createAndShowGUI();

	}

}
