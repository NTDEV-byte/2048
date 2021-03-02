package com.tfe;

import javax.swing.JFrame;

import com.tfe.input.InputHandler;

public class WindowLauncher {

	public static InputHandler inputHandler = new InputHandler();
		
		public static void main(String[] args) { 
		
			GameLogic logic = new GameLogic();
			JFrame window = new JFrame("2048");
			window.setVisible(true);
			window.setResizable(false);
			window.setLocationRelativeTo(null);
			window.addKeyListener(inputHandler);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			window.add(logic.getBoard());
			window.pack();
			
			Thread threadLogic = new Thread(logic,"Game-Logic");
			threadLogic.start();
			
			
			
			
		}
}
