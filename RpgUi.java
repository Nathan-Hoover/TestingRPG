import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class RpgUi {
	
	RpgUi(){
		createJFrame();
	}
	
	private void createJFrame(){
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(Color.black);
		frame.setTitle("RpgUI");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}