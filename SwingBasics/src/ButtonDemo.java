import javax.swing.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;

public class ButtonDemo implements ActionListener{
	
	private int counter = 0;
	JPanel content;
	JButton button;
	JLabel label;
	
	public ButtonDemo() {
		
		content = new JPanel(new GridLayout(0,1)); //Create with a grid layout of a single column
		button = new JButton("Click me!"); //make the button
		label = new JLabel(counterMessage(counter)); //make the label for writing text to
		
		//Set up the Action Listener
		button.addActionListener(this);//this instance will handle the actions
		
		content.add(button);
		content.add(label);		
	}
	
	public Component getContent()
	{
		return(content);
	}
	
	private String counterMessage(int num)
	{
		//Create a message based on current counter number
		return (new String("Click ounter:  " + num + " "));
	}

	public void actionPerformed(ActionEvent e) {
		
        //When the button is pressed...
		String msg  = counterMessage(counter) ; 
		counter++;
		label.setText(msg);	//update label
		System.out.println(msg); //update 
	}
}
