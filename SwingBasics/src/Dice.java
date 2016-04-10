import javax.swing.*;

import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Random;

public class Dice {
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public Dice() {
		
		panel = new JPanel();
		label = new JLabel("Enter a number of sides for the Dice: ");
		button = new JButton("Roll!");
		text = new JTextField(3);
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(label);
		panel.add(text);
		panel.add(button);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//get the input
				String input = text.getText();
				
				//Validate the input to be int
				try {
					Integer.parseInt(input);
				} catch (NumberFormatException e1) {
					System.out.println("Enter a number.");
					label.setText("Enter a number: ");
				}
				
				//convert String to Int
				int sideNum = Integer.parseInt(input);
				
				//Pick a side randomly from 1 to sideNum
				Random randomGenerator = new Random();
				int rollDice = randomGenerator.nextInt(sideNum) + 1;
				
				//Output the roll
				System.out.println(Integer.toString(rollDice));
				label.setText("You rolled a " + Integer.toString(rollDice) + " dice. Number of side: ");
				button.setText("Roll again");
				
			}
		};
		
		return listener;
	}	
}
