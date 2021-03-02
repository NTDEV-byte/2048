package com.tfe;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.Random;

import com.tfe.input.InputHandler;

public class GameLogic implements Runnable{
		
		public static final int EMPTY_CASE = 0;
		public static final int WIDTH = 4;
		public static final int HEIGHT = 4;
		public static int numbers[] = {2,4,8,16,32,64,128,256,512,1024,2048};
		public static InputHandler input = WindowLauncher.inputHandler;
		
		private int grid[];
		private Board board;
		private boolean running = true;
		
					public GameLogic() { 
						grid = new int[WIDTH * HEIGHT];
						board = new Board(grid);
					}
		
					
					public void play() { 
						System.out.println(input.getPressedKey());
						if(input.getPressedKey() == KeyEvent.VK_UP) { 
							pickRandomNumber();
						}
						else if(input.getPressedKey() == KeyEvent.VK_RIGHT) {
							pickRandomNumber();
						}
						else if(input.getPressedKey() == KeyEvent.VK_DOWN) {
							pickRandomNumber();
						}
						else if(input.getPressedKey() == KeyEvent.VK_LEFT) {
							pickRandomNumber();
						}
					}
					
					private void pickRandomNumber() {
						int max = numbers.length;
						int pickedRandIndex = (int)(Math.random() * max);
						int number = numbers[pickedRandIndex];
						Point locations[];
						locations = freeLocations();
						if(locations!=null) { 
							int indexFree = (int)(Math.random() * locations.length);
							Point picked_location = locations[indexFree];
							board.setCellState(picked_location.x, picked_location.y, number);
						}
					}
					
					
					private Point[] freeLocations() { 
						int locations = 0;
						Point locationsCoords[] = null;
						for(int i=0;i<grid.length;i++) {
							  if(grid[i] == EMPTY_CASE) { 
								  locations++;
							  }
						}
						if(locations == 0) return locationsCoords;
						locationsCoords = new Point[locations];
						locations = 0;
						for(int y=0;y<HEIGHT;y++) { 
							 for(int x=0;x<WIDTH;x++) { 
								  if(grid[x + y * WIDTH] == EMPTY_CASE) { 
									    locationsCoords[locations++] = new Point(x,y); 
								  }
							 }
						}
						return locationsCoords;
					}
					
					@Override
					public void run() {
						while(running) { 
							play();
						}
					}
					
					public Board getBoard() {
						return board;
					}

}
