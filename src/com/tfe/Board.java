package com.tfe;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Board extends JPanel{


		public static final int WIDTH = 400;
		public static final int HEIGHT = 400;
		public static final int CELL_WIDTH = 100;
		public static final int CELL_HEIGHT = 100;
		public static final Color BG_COLOR = new Color(187, 173, 160);
		public static final Color BORDER_COLOR = new Color(205, 193, 160);
		
		public static final int TWO  = 2;
		public static final int FOUR  = 4;
		public static final int EIGHT  = 8;
		public static final int SIXTEEN  = 16;
		public static final int THIRTY_TWO  = 32;
		public static final int SIXTYFOUR  = 64;
		public static final int ONE_HUNDRED_TWENTY_EIGHT  = 128;
		public static final int TWO_HUNDRED_FIFTY_SIX  = 256;
		public static final int FIVE_HUNDRED_TWELVE  = 512;
		public static final int ONE_THOUSAND_TWENTY_FOUR  = 1024;
		public static final int TWO_THOUSAND_FORTY_EIGHT  = 2048;
		
		
		public static final Color COLOR_TWO  = new Color(238, 228, 218);
		public static final Color COLOR_FOUR  = new Color(237, 224, 200);
		public static final Color COLOR_EIGHT  = new Color(242, 177, 121);
		public static final Color COLOR_SIXTEEN  = new Color(245, 149, 99);
		public static final Color COLOR_THIRTY_TWO  = new Color(246, 124, 95);
		public static final Color COLOR_SIXTYFOUR  = new Color(246, 94, 59);
		public static final Color COLOR_ONE_HUNDRED_TWENTY_EIGHT  = new Color(237, 207, 114);
		public static final Color COLOR_TWO_HUNDRED_FIFTY_SIX  = new Color(237,204, 97);
		public static final Color COLOR_FIVE_HUNDRED_TWELVE  = new Color(205, 193, 160);
		public static final Color COLOR_ONE_THOUSAND_TWENTY_FOUR  = new Color(205, 193, 160);
		public static final Color COLOR_TWO_THOUSAND_FORTY_EIGHT  = new Color(205, 193, 160);
		
		private int grid[] = new int[4 * 4];
		
		
		
		
			public Board() { 
				setPreferredSize(new Dimension(WIDTH,HEIGHT));
				
				grid[0 + 0 * 4] = 2;
				grid[0 + 1 * 4] = 4;
				grid[0 + 2 * 4] = 8;
				grid[0 + 3 * 4] = 16;
			}
			
		
			
			public void paint(Graphics g) { 
				Graphics2D g2 = (Graphics2D)g; 
				showGrid(g2);
				drawBoard(g2);
				repaint();
			}
			
			private void drawBoard(Graphics2D g2) { 
				g2.setColor(BORDER_COLOR);
				g2.setStroke(new BasicStroke(15.0f));
				for(int y=0;y<totalCellsY();y++) {
					for(int x=0;x<totalCellsX();x++) { 
						g2.drawLine(x * CELL_WIDTH, 0  , x * CELL_WIDTH, HEIGHT);
						}
					g2.drawLine(0, y * CELL_HEIGHT , WIDTH, y * CELL_HEIGHT);
				}
			}
			
			
			private void showGrid(Graphics2D g2)
			{ 
				
				for(int y=0;y<totalCellsY();y++) { 
					for(int x=0;x<totalCellsX();x++) { 
						switch(grid[x + y * totalCellsX()]) { 
						
						
						case TWO:
							
							g2.setColor(COLOR_TWO);
							
							break;
						case FOUR:
							
							g2.setColor(COLOR_FOUR);
							
							break;
							
						case EIGHT:

							g2.setColor(COLOR_EIGHT);

							break;
						case SIXTEEN:
							
							g2.setColor(COLOR_SIXTEEN);
							
							break;
						case THIRTY_TWO:
							g2.setColor(COLOR_THIRTY_TWO);
							
							break;
							
						case SIXTYFOUR:

							g2.setColor(COLOR_SIXTYFOUR);
							break;
							
						case ONE_HUNDRED_TWENTY_EIGHT:
							
							g2.setColor(COLOR_ONE_HUNDRED_TWENTY_EIGHT);
							
							
							break;
						case TWO_HUNDRED_FIFTY_SIX:
							
							g2.setColor(COLOR_TWO_HUNDRED_FIFTY_SIX);
							break;
							
						case FIVE_HUNDRED_TWELVE:
							g2.setColor(COLOR_FIVE_HUNDRED_TWELVE);

							break;
							
						case ONE_THOUSAND_TWENTY_FOUR:
							g2.setColor(COLOR_ONE_THOUSAND_TWENTY_FOUR);
							
							break;
						case TWO_THOUSAND_FORTY_EIGHT:
							g2.setColor(COLOR_TWO_THOUSAND_FORTY_EIGHT);
							break;
						}
						
						g2.fillRect(x * CELL_WIDTH, y * CELL_HEIGHT,CELL_WIDTH, CELL_HEIGHT);
						drawNumbers(x,y,g2);
						g2.setColor(BG_COLOR);
					}
				}
			}
			
			
			
			public void drawNumbers(int x,int y,Graphics2D g) { 
				String labels[] = {"2","4","8","16","32","64","128","256","512","1024","2048"};
				String cell_data = "";
				int xOffset = 0,yOffset = 0;
				Font font = null;
				
				switch(grid[x + y * totalCellsX()]) { 
				
				
				case TWO:
					
					cell_data = labels[0];
					
					xOffset = 25;
					yOffset = 70;
					font = new Font("Verdana",Font.BOLD,65);
					
					break;
				case FOUR:
					
					cell_data = labels[1];
					xOffset = 25;
					yOffset = 70;
					font = new Font("Verdana",Font.BOLD,65);
					break;
					
				case EIGHT:

					cell_data = labels[2];
					xOffset = 25;
					yOffset = 70;
					font = new Font("Verdana",Font.BOLD,65);
					
					break;
				case SIXTEEN:
					
					cell_data = labels[3];
					xOffset = 10;
					yOffset = 75;
					font = new Font("Verdana",Font.BOLD,55);
					
					break;
				case THIRTY_TWO:

					cell_data = labels[4];
					
					break;
					
				case SIXTYFOUR:

					cell_data = labels[5];
					
					break;
					
				case ONE_HUNDRED_TWENTY_EIGHT:
					
					cell_data = labels[6];					
					
					break;
				case TWO_HUNDRED_FIFTY_SIX:

					cell_data = labels[7];
					break;
					
				case FIVE_HUNDRED_TWELVE:

					cell_data = labels[8];
					break;
					
				case ONE_THOUSAND_TWENTY_FOUR:
					cell_data = labels[9];
						
					break;
				case TWO_THOUSAND_FORTY_EIGHT:
					cell_data = labels[10];
					break;
				}
				
				if(font != null) { 
					g.setColor(new Color(119,110,101));
					g.setFont(font);
					g.drawString(cell_data, x * CELL_WIDTH + xOffset, y * CELL_HEIGHT + yOffset);
				}
			}
				
			public void setCellState(int x,int y,int value) { 
				 grid[x + y * totalCellsX()] = value;
			}
			
			
			public int totalCellsX() { 
				return WIDTH / CELL_WIDTH;
			}
			
			public int totalCellsY() { 
				return HEIGHT / CELL_HEIGHT;
			}
		
		
}
