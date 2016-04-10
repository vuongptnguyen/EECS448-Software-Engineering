import javax.swing.*;

import java.awt.Component;
import java.awt.event.*;
import java.awt.GridLayout;

public class votingSystemDriver {
	
	
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Voting System");
		votingSystem votingSystem = new votingSystem();
		
		frame.getContentPane().add(votingSystem.getContent());
		frame.setLayout(new GridLayout(1,3,5,5));
		frame.pack();
		frame.setSize(500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createAndDisplayGUI();
	}

}
