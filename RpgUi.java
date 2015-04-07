import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class RpgUi {
	JFrame frame;
	JPanel optionPanel, mainPanel, statusPanel;
	
	RpgUi(){
		createJFrame();
	}
	
	private void createJFrame(){
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.black);
		frame.setTitle("RpgUI");
		frame.setLocationRelativeTo(null);
		frame.setMinimumSize(new Dimension(1280 , 720));		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	private void createPanels(){
		optionPanel = new JPanel();
		optionPanel.setOpaque(false);
		optionPanel.setBackground(Color.red);
		mainPanel = new JPanel();
		mainPanel.setOpaque(false);
		statusPanel = new JPanel();
		statusPanel.setOpaque(false);
		
		GridBagConstraints panelConstraints = new GridBagConstraints();
		
		panelConstraints.weightx = 1;
		panelConstraints.weighty = 1;
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 0;
		panelConstraints.anchor = GridBagConstraints.CENTER;
		
		frame.add(optionPanel, panelConstraints);
		frame.add(mainPanel, panelConstraints);
		frame.add(statusPanel, panelConstraints);
	}
	
}