import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class MultiButtonDemo {
	
	//create GUI
	private JButton button1;
	private JButton button2;
	private JPanel content;
	private JLabel label;
	
	//constructor
	public MultiButtonDemo()
	{
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		label = new JLabel("No button pressed yet");
		
		//Add the listeners to their respective buttons
		button1.addActionListener( button1Action() );
		button2.addActionListener( button2Action() );
						
		content = new JPanel();
		content.add(button1);
		content.add(button2);
		content.add(label);		
	}
	
	public Component getContent()
	{
		return(content);
	}
	
	private ActionListener button1Action() 
	{
		//Create and define an action listener for button1
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("button 1 pressed");
            }
        };
        return action;
    }
	
	private ActionListener button2Action() 
	{
		//Create and define an action listener for button2
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                label.setText("button 2 pressed");
            }
        };
        return action;
    }
}
