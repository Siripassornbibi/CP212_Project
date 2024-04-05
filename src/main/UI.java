package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import object.OBJ_Keycard;
import object.OBJ_Mask;
import object.OBJ_Pill;
import object.OBJ_Spray;
import object.OBJ_Vaccine;

public class UI {

	GamePanel gp;
	Font arial_40A ,arial_80B;
	BufferedImage keyImage;
	public boolean messageOn = false;
	public String message = "";
	int messageCounter = 0;
	public boolean gameFinished = false;
	
	public UI(GamePanel gp) {
		this.gp = gp;
		
		arial_40A = new Font("Arial", Font.ITALIC, 30);
		arial_80B = new Font("Arial", Font.BOLD, 45);
		
	}

	public void showMessage(String text) {
		
		message = text;
		messageOn = true;
	}
	public void draw(Graphics2D g2) {
		
		if(gameFinished == true) {
			
			g2.setFont(arial_80B);
			g2.setColor(Color.GREEN);
			
			
			String text;
			int textLength;
			int x;
			int y;
			
			text = "You found all of medicine you want";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth/2 - textLength/2;
			y = gp.screenHeight/2 - (gp.tileSize*3);
			g2.drawString(text, x, y);
			
			
			g2.setFont(arial_80B);
			g2.setColor(Color.GREEN);
			text = "Takecare your self! ";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth/2 - textLength/2;
			y = gp.screenHeight/2 + (gp.tileSize*1);
			g2.drawString(text, x, y);
			
			gp.gameThread = null;
			
		}
		else {
			
			//MESSAGE
			if(messageOn == true) {
				
				g2.setFont(g2.getFont().deriveFont(30F));
				g2.drawString(message, gp.tileSize/2, gp.tileSize*10);
				
				messageCounter++;
				
				if(messageCounter > 120) {
					messageCounter = 0;
					messageOn = false;
		}

		
			}
		}
	}
}
