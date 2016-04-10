import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class tempConverter {
	
	//initialize the GUI components
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	//Drop-down menu
	private JMenuBar menuBar;
	private JMenu menu; //a single drop down menu
	private JMenuItem menuItem_FtoC, menuItem_FtoK, menuItem_CtoK, menuItem_CtoF, menuItem_KtoF, menuItem_KtoC;
	
	
	public tempConverter() {
		panel = new JPanel();
		//button = new JButton("Convert");
		text = new JTextField(3);
		label = new JLabel("Enter the temperature: ");
        
		//create menu bar
			menuBar = new JMenuBar();
				
		//build menu
			menu = new JMenu("Choose conversion");
			menu.setMnemonic(KeyEvent.VK_A); //Allows for hotkey access Alt+a
			menuBar.add(menu); //add to menu bar
			
			ButtonGroup group = new ButtonGroup();
			
		//add items
			menuItem_FtoC = new JRadioButtonMenuItem("F to C");
			menuItem_FtoC.setSelected(true);
			group.add(menuItem_FtoC);
			menu.add(menuItem_FtoC);
			
			menuItem_FtoK = new JRadioButtonMenuItem("F to K");
			group.add(menuItem_FtoK);
			menu.add(menuItem_FtoK);
			
			menuItem_CtoK = new JRadioButtonMenuItem("C to K");
			group.add(menuItem_CtoK);
			menu.add(menuItem_CtoK);
			
			menuItem_CtoF = new JRadioButtonMenuItem("C to F");
			group.add(menuItem_CtoF);
			menu.add(menuItem_CtoF);
			
			menuItem_KtoF = new JRadioButtonMenuItem("K to F");
			group.add(menuItem_KtoF);
			menu.add(menuItem_KtoF);
			
			menuItem_KtoC = new JRadioButtonMenuItem("K to C");
			group.add(menuItem_KtoC);
			menu.add(menuItem_KtoC); 
	
		//Load the listener
		//button.addActionListener(buttonListener());	
		menuItem_FtoC.addActionListener( FtoC_Action() );
		menuItem_FtoK.addActionListener( FtoK_Action() );
		menuItem_CtoK.addActionListener( CtoK_Action() );
		menuItem_CtoF.addActionListener( CtoF_Action() );
		menuItem_KtoF.addActionListener( KtoF_Action() );
		menuItem_KtoC.addActionListener( KtoC_Action() ); 
		
		//load the panel
		panel.add(label); 
		panel.add(text);
		//panel.add(button);
		panel.add(menuBar);
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	
	//ActionListener tasks -------------------------------------------------------------------------------------------------
	
	private ActionListener FtoC_Action()
	{
		//Create and define an action listener for conversion F to C
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Validate the input to be double
				try {
					Double.parseDouble(input);
				} catch (NumberFormatException e1) {
					System.out.println("Enter a decimal or integer number.");
					label.setText("Enter a decimal or integer number: ");
				}
            	double tempInF = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC) + ". Enter the temperature: ";//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
            }
        };
        return action;
	}	
	
	private ActionListener FtoK_Action()
	{
		//Create and define an action listener for conversion F to K
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Validate the input to be double
				try {
					Double.parseDouble(input);
				} catch (NumberFormatException e1) {
					System.out.println("Enter a decimal or integer number.");
					label.setText("Enter a decimal or integer number: ");
				}
            	double tempInF = Double.parseDouble(input);//convert String to double
				double tempInK = (tempInF + 459.67)*(5.0/9.0); //convert F to K
				String newText = "Temp in K: " + String.format("%.2f",tempInK) + ". Enter the temperature: ";//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
            }
        };
        return action;
	}	
	
	private ActionListener CtoK_Action()
	{
		//Create and define an action listener for conversion C to K
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Validate the input to be double
				try {
					Double.parseDouble(input);
				} catch (NumberFormatException e1) {
					System.out.println("Enter a decimal or integer number.");
					label.setText("Enter a decimal or integer number: ");
				}
            	double tempInC = Double.parseDouble(input);//convert String to double
				double tempInK = (tempInC + 273.15); //convert C to K
				String newText = "Temp in K: " + String.format("%.2f",tempInK) + ". Enter the temperature: ";//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
            }
        };
        return action;
	}	
	
	private ActionListener CtoF_Action()
	{
		//Create and define an action listener for conversion C to F
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Validate the input to be double
				try {
					Double.parseDouble(input);
				} catch (NumberFormatException e1) {
					System.out.println("Enter a decimal or integer number.");
					label.setText("Enter a decimal or integer number: ");
				}
            	double tempInC = Double.parseDouble(input);//convert String to double
				double tempInF = (tempInC)*9.0/5.0 + 32.0; //convert C to F
				String newText = "Temp in F: " + String.format("%.2f",tempInF) + ". Enter the temperature: ";//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
            }
        };
        return action;
	}	
	
	private ActionListener KtoF_Action()
	{
		//Create and define an action listener for conversion K to F
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Validate the input to be double
				try {
					Double.parseDouble(input);
				} catch (NumberFormatException e1) {
					System.out.println("Enter a decimal or integer number.");
					label.setText("Enter a decimal or integer number: ");
				}
            	double tempInK = Double.parseDouble(input);//convert String to double
				double tempInF = (tempInK)*9.0/5.0 - 459.67; //convert K to F
				String newText = "Temp in F: " + String.format("%.2f",tempInF) + ". Enter the temperature: ";//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
            }
        };
        return action;
	}	
	
	private ActionListener KtoC_Action()
	{
		//Create and define an action listener for conversion K to C
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
            	String input = text.getText();
            	//Validate the input to be double
				try {
					Double.parseDouble(input);
				} catch (NumberFormatException e1) {
					System.out.println("Enter a decimal or integer number.");
					label.setText("Enter a decimal or integer number: ");
				}
            	double tempInK = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInK) - 273.15; //convert K to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC) + ". Enter the temperature: ";//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
            }
        };
        return action;
	}	
	
	//-------------------------------------------------------------------------------------------------------
}
