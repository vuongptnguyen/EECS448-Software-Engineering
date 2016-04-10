import javax.swing.*;

public class MultiButtonDemoDriver {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Multi-button");
		MultiButtonDemo demo = new MultiButtonDemo();
		
		frame.add(demo.getContent());
		frame.pack();
		frame.setSize(400, 300);
		frame.setVisible(true);

	}

}
