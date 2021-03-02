package com.tfe.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener{
	
	private int pressedKey = KeyEvent.KEY_RELEASED;

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) { 
		case KeyEvent.VK_UP:
			pressedKey  = KeyEvent.VK_UP;
			break;
		case KeyEvent.VK_RIGHT:
			pressedKey  = KeyEvent.VK_RIGHT;
			break;
			
		case KeyEvent.VK_DOWN:
			pressedKey  = KeyEvent.VK_DOWN;
			break;
	
		case KeyEvent.VK_LEFT:
			pressedKey  = KeyEvent.VK_LEFT;
			break;
			
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		pressedKey = KeyEvent.KEY_RELEASED;
	}
	
	public int getPressedKey() { 
		return pressedKey;
	}

}
