import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class ButtonDemoDriver {

	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Click counter");
		ButtonDemo demo = new ButtonDemo();
		
		frame.getContentPane().add( demo.getContent() );
		
		frame.pack();
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		createAndDisplayGUI();
	}

}
