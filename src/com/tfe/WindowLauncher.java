package com.tfe;

import javax.swing.JFrame;

public class WindowLauncher {
	
	
		
		
		public static void main(String[] args) { 
		
			
			JFrame window = new JFrame("2048");
			window.setVisible(true);
			window.setResizable(false);
			window.setLocationRelativeTo(null);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.add(new Board());
			window.pack();
			
			
		}
}
