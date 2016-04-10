import javax.swing.*;
import java.awt.event.KeyEvent; //menu hotkeys

public class MenuIntro {

	private static void createAndShowGUI() {
		//CREATE frame
		JFrame frame = new JFrame("Menu"); //TITLE
		
		//create the GUI
		JMenuBar menuBar;
		JMenu menu, submenu; //a single drop down menu
		JMenuItem menuItem;
		JRadioButtonMenuItem rbMenuItem; //radio button menu item
		JCheckBoxMenuItem cbMenuItem; //checkbox menu item
		
		//create menu bar
		menuBar = new JMenuBar();
		
		
		//build menu.
		menu = new JMenu("Lunch Order");
		menu.setMnemonic(KeyEvent.VK_A); //Allows for hotkeyaccess Alt+a
		menuBar.add(menu); //add to menu bar
		
		//add items
		menuItem = new JMenuItem("Cool Pasta");
		menu.add(menuItem);
		menuItem = new JMenuItem("Awesome Chicken");
		menu.add(menuItem);
		
		//build radio button menu
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		
		rbMenuItem = new JRadioButtonMenuItem("Deliver");
		rbMenuItem.setSelected(true);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		rbMenuItem = new JRadioButtonMenuItem("In store");
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		//build check box menu 
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("Add cheese");
		menu.add(cbMenuItem);
		cbMenuItem = new JCheckBoxMenuItem("Add Onion");
		menu.add(cbMenuItem);
		
		//submenu
		menu.addSeparator();
		submenu = new JMenu("Side dish?");
		submenu.setMnemonic(KeyEvent.VK_S); //Again some option hotkey access

		menuItem = new JMenuItem("Salad");
		submenu.add(menuItem);

		menuItem = new JMenuItem("Fries");
		submenu.add(menuItem);
		menu.add(submenu);
		
		menuItem = new JMenuItem("Onion Rings");
		submenu.add(menuItem);
		menu.add(submenu);
		
		//Build second menu in the menu bar.
		menu = new JMenu("Dinner");
		menuBar.add(menu);
		
		//add items
		menuItem = new JMenuItem("Steak");
		menu.add(menuItem);
		menuItem = new JMenuItem("Banh mi");
		menu.add(menuItem);
		
		//SET MENU BAR
		frame.setJMenuBar(menuBar);
		
		//display window
		frame.pack();
		frame.setSize(350,250);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		createAndShowGUI();

	}

}
