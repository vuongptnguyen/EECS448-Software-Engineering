import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class TextDemo {

	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public TextDemo()
	{
		panel = new JPanel();
		button = new JButton("Convert");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Enter a temperature from F to C");
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
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
				String input = text.getText();
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
}
