import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;

import java.io.*;

public class votingSystem {
	//initialize the GUI components
		private JPanel panel;
		private JTextField firstName_text, lastName_text;
		private JLabel input_label, choose_label, firstName_label, lastName_label;
		
		//Drop-down menu
		private JMenuBar menuBar;
		private JMenu menu; //a single drop down menu
		private JMenuItem HillaryClinton, BernieSanders, DonaldTrump, TedCruz;
		
	public votingSystem() {
		//initial the panel and text fields
		panel = new JPanel();
		firstName_text = new JTextField(8);
		lastName_text = new JTextField(8);
		
		//create the labels
		input_label = new JLabel("Your name: ");
		choose_label = new JLabel("Choose a candidate: ");
		firstName_label = new JLabel("First Name: ");
		lastName_label = new JLabel("Last Name: ");
		
		//create menu bar
			menuBar = new JMenuBar();
				
		//build menu
			menu = new JMenu("I vote for...");
			menu.setMnemonic(KeyEvent.VK_A); //Allows for hotkey access Alt+a
			menuBar.add(menu); //add to menu bar
			
			ButtonGroup group = new ButtonGroup();
			
		//add items
			HillaryClinton = new JRadioButtonMenuItem("Hillary Clinton");
			//HillaryClinton.setSelected(true);
			group.add(HillaryClinton);
			menu.add(HillaryClinton);
			
			BernieSanders = new JRadioButtonMenuItem("Bernie Sanders");
			group.add(BernieSanders);
			menu.add(BernieSanders);
			
			DonaldTrump = new JRadioButtonMenuItem("Donald Trump");
			group.add(DonaldTrump);
			menu.add(DonaldTrump);
			
			TedCruz = new JRadioButtonMenuItem("Ted Cruz");
			group.add(TedCruz);
			menu.add(TedCruz);
			
			//load the action listeners
			HillaryClinton.addActionListener( HillaryClinton_Action() );
			BernieSanders.addActionListener( BernieSanders_Action() );
			DonaldTrump.addActionListener( DonaldTrump_Action() );
			TedCruz.addActionListener( TedCruz_Action() );
			
			//load the panel
			panel.add(input_label);
			panel.add(firstName_label);
			panel.add(firstName_text);
			panel.add(lastName_label);
			panel.add(lastName_text);
			panel.add(choose_label); 
			panel.add(menuBar);
	}
	
	public Component getContent() 
	{
		return (panel);
	}
			
	//ActionListener tasks ---------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------------
	private ActionListener HillaryClinton_Action() 
	{
		//Create and define an action listener for conversion F to C
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(firstName_text.getText().isEmpty() ) {
            		input_label.setText("Enter first name:");
            	} else if (lastName_text.getText().isEmpty()) {
            		input_label.setText("Enter last name:");
            	} else {
            		try {
                		String first_name = firstName_text.getText();
                    	String last_name = lastName_text.getText();
                    	
                    	//create file lastname_firstname_ballot.txt
                    	String file_name = last_name + "_" + first_name + "_" + "ballot.txt";
                    	File file = new File(file_name);
                    	
                    	//check if file exists/user already voted
                    	if(!file.exists()) {
                    		//the user hasn't voted
                    		file.createNewFile();
                    		
                    		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
                    		BufferedWriter bwriter = new BufferedWriter(fwriter);
                    		
                    		bwriter.write(first_name + " " + last_name +" voted for Hillary Clinton!");
                    		bwriter.close();
                    		System.out.println(first_name + " " + last_name + " voted for Hillary Clinton!");
                    	}
                    	else {
                    		System.out.println("You already voted. Cannot vote again.");
                    		choose_label.setText("You already voted");
                    	}
                    	
                    	
                	} catch (IOException error) {
                		error.printStackTrace();
                	}
            	}
	            	
            	
            }
        };
        return action;
	}	
	
	private ActionListener BernieSanders_Action() 
	{
		//Create and define an action listener for conversion F to C
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(firstName_text.getText().isEmpty() ) {
            		input_label.setText("Enter first name:");
            	} else if (lastName_text.getText().isEmpty()) {
            		input_label.setText("Enter last name:");
            	} else {
            		try {
                		String first_name = firstName_text.getText();
                    	String last_name = lastName_text.getText();
                    	
                    	//create file lastname_firstname_ballot.txt
                    	String file_name = last_name + "_" + first_name + "_" + "ballot.txt";
                    	File file = new File(file_name);
                    	
                    	//check if file exists/user already voted
                    	if(!file.exists()) {
                    		//the user hasn't voted
                    		file.createNewFile();
                    		
                    		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
                    		BufferedWriter bwriter = new BufferedWriter(fwriter);
                    		
                    		bwriter.write(first_name + " " + last_name +" voted for Bernie Sanders!");
                    		bwriter.close();
                    		System.out.println(first_name + " " + last_name + " voted for Bernie Sanders!");
                    	}
                    	else {
                    		System.out.println("You already voted. Cannot vote again.");
                    		choose_label.setText("You already voted");
                    	}
                    	
                    	
                	} catch (IOException error) {
                		error.printStackTrace();
                	}
            	}
	            	
            	
            }
        };
        return action;
	}	
	
	private ActionListener DonaldTrump_Action() 
	{
		//Create and define an action listener for conversion F to C
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(firstName_text.getText().isEmpty() ) {
            		input_label.setText("Enter first name:");
            	} else if (lastName_text.getText().isEmpty()) {
            		input_label.setText("Enter last name:");
            	} else {
            		try {
                		String first_name = firstName_text.getText();
                    	String last_name = lastName_text.getText();
                    	
                    	//create file lastname_firstname_ballot.txt
                    	String file_name = last_name + "_" + first_name + "_" + "ballot.txt";
                    	File file = new File(file_name);
                    	
                    	//check if file exists/user already voted
                    	if(!file.exists()) {
                    		//the user hasn't voted
                    		file.createNewFile();
                    		
                    		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
                    		BufferedWriter bwriter = new BufferedWriter(fwriter);
                    		
                    		bwriter.write(first_name + " " + last_name +" voted for Donald Trump!");
                    		bwriter.close();
                    		System.out.println(first_name + " " + last_name + " voted for Donald Trump!");
                    	}
                    	else {
                    		System.out.println("You already voted. Cannot vote again.");
                    		choose_label.setText("You already voted");
                    	}
                    	
                    	
                	} catch (IOException error) {
                		error.printStackTrace();
                	}
            	}
	            	
            	
            }
        };
        return action;
	}
	
	private ActionListener TedCruz_Action() 
	{
		//Create and define an action listener for conversion F to C
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if(firstName_text.getText().isEmpty() ) {
            		input_label.setText("Enter first name:");
            	} else if (lastName_text.getText().isEmpty()) {
            		input_label.setText("Enter last name:");
            	} else {
            		try {
                		String first_name = firstName_text.getText();
                    	String last_name = lastName_text.getText();
                    	
                    	//create file lastname_firstname_ballot.txt
                    	String file_name = last_name + "_" + first_name + "_" + "ballot.txt";
                    	File file = new File(file_name);
                    	
                    	//check if file exists/user already voted
                    	if(!file.exists()) {
                    		//the user hasn't voted
                    		file.createNewFile();
                    		
                    		FileWriter fwriter = new FileWriter(file.getAbsoluteFile());
                    		BufferedWriter bwriter = new BufferedWriter(fwriter);
                    		
                    		bwriter.write(first_name + " " + last_name +" voted for Ted Cruz!");
                    		bwriter.close();
                    		System.out.println(first_name + " " + last_name + " voted for Ted Cruz!");
                    	}
                    	else {
                    		System.out.println("You already voted. Cannot vote again.");
                    		choose_label.setText("You already voted");
                    	}
                    	
                    	
                	} catch (IOException error) {
                		error.printStackTrace();
                	}
            	}
	            	
            	
            }
        };
        return action;
	}
	//----------------------------------------------------------------------------------------------
}
