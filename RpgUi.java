import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class RpgUi {
	JFrame frame;
	JPanel topPanel, bottomPanel, sidePanel1, sidePanel2;
	JTextArea textPanel;
	
	RpgUi(){
		createJFrame();
		createPanels();
		createTextArea();
	}
	
	private void createJFrame(){
		frame = new JFrame();
		frame.setTitle("RpgUI");
		frame.setLayout(new GridBagLayout());
		frame.setLocationRelativeTo(null);
		frame.setMinimumSize(new Dimension(1280 , 720));
		frame.setMaximumSize(new Dimension(1280 , 720));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void createPanels(){
		topPanel = new JPanel();
		topPanel.setBackground(Color.green);
		
		bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.yellow);
		
		sidePanel1 = new JPanel();
		sidePanel1.setBackground(Color.red);
		
		sidePanel2 = new JPanel();
		sidePanel2.setBackground(Color.red);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.PAGE_START;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		frame.add(topPanel, gbc);
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridy = 1;
		gbc.weighty = 0.65;
		
		frame.add(bottomPanel, gbc);
		
		gbc.anchor = GridBagConstraints.PAGE_END;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 0.3;
		
		frame.add(sidePanel1, gbc);
		
		gbc.anchor = GridBagConstraints.PAGE_END;
		gbc.gridy = 1;
		frame.add(sidePanel2, gbc);
		/*
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.anchor = GridBagConstraints.PAGE_END;
		gbc2.fill = GridBagConstraints.BOTH;
		gbc2.gridx = 0;
		gbc2.gridy = 0;
		gbc2.weightx = 1.0;
		gbc2.weighty = 1.0;
		
		frame.add(sidePanel, gbc2);
		*/
		frame.pack();
	}
	
	private void createTextArea(){
		textPanel = new JTextArea(600, 800);
		textPanel.insert("Test", 4);
		
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.anchor = GridBagConstraints.PAGE_END;
		gbc3.fill = GridBagConstraints.BOTH;
		gbc3.gridx = 0;
		gbc3.gridy = 1;
		gbc3.weightx = 1.0;
		gbc3.weighty = 1.0;
		
		frame.add(textPanel, gbc3);
	}
	
}