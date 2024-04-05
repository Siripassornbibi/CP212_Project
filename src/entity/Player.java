package entity;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity {

	GamePanel gp;
	KeyHandler keyH;
	
	public final int screenX;
	public final int screenY;
	
	public int hasKey = 0;
	public int medicine = 0;
	
	
	public Player(GamePanel gp, KeyHandler keyH) {
		
		this.gp = gp;
		this.keyH = keyH;
		
		screenX = gp.screenWidth/2 - (gp.tileSize/2);
		screenY = gp.screenHeight/2 - (gp.tileSize/2);
		
		solidArea = new Rectangle();
		solidArea.x = 4;
		solidArea.y = 8;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 32;
		solidArea.height = 32;
		
		setDefaultValues();
		getPlayerImage();
	}
	public void setDefaultValues() {
		
		worldX = gp.tileSize * 16;
		worldY = gp.tileSize * 30;
		speed = 8;
		direction = "down";
	}
	
	public void getPlayerImage() {
		
		try {
			
			up1 = ImageIO.read(getClass().getResourceAsStream("/player/back1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/back2.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/front1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/front2.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/left1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/left2.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/player/right1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/right2.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		
		if(keyH.upPressed == true || keyH.downPressed == true || keyH.leftPressed == true ||keyH.rightPressed == true ) {
			
			if(keyH.upPressed == true) {
				direction = "up";
			}
			else if(keyH.downPressed == true) {
				direction = "down";
			}
			else if(keyH.leftPressed == true) {
				direction = "left";
			}
			else if(keyH.rightPressed == true) {
				direction = "right";
			}
			
			// CHECK TILE COLLSION
			collisionOn = false;
			gp.cChecker.checkTile(this);
			
			// CHECK OBJECT COLLISION
			int objIndex = gp.cChecker.checkObject(this, true);
			pickUpObject(objIndex);
			
			// IF COLLISION FALSE, PLAYER CAN MOVE
			if(collisionOn == false){
				
				switch(direction) {
				
				case "up": worldY -= speed;
					break;
					
				case "down": worldY += speed;
					break;
					
				case "left": worldX -= speed;
					break;
					
				case "right": worldX += speed;
					break;
				}
			}
			
			spriteCounter++;
			if(spriteCounter > 10) {
				if(spriteNum == 1) {
					spriteNum = 2;
				}
				else if(spriteNum == 2) {
					spriteNum = 1;
				}
				spriteCounter = 0;
			}
		}
	}
	
	public void pickUpObject(int i) {
		
		if(i != 999) {
			
			String objectName = gp.obj[i].name;
			
			switch(objectName) {
			
			//GAMEKEY
			case"Mask":
				medicine++;
				gp.obj[i] = null;
				gp.ui.showMessage("You got a Mask!");
				break;
			case"Pill":
				medicine++;
				gp.obj[i] = null;
				gp.ui.showMessage("You got a Pill!");
				break;
			case"Spray":
				medicine++;
				gp.obj[i] = null;
				gp.ui.showMessage("You got a Spray!");
				break;
			case"Vaccine":
				gp.ui.gameFinished = true;
				break;
				
			//ELEVETER KEY
			case"Keycard":
				hasKey++;
				gp.obj[i] = null;
				gp.ui.showMessage("You got a Keycard!");
				
				break;
				
			//Door
			case"Irondoor":
				if(hasKey > 0 ) {
					gp.obj[i] = null;
				}
				break;
				
			//Virus
			case"Virus":
				if(medicine > 2 ) {
					gp.obj[i] = null;
				}
				break;
			}
		}
	}
	
	public void draw(Graphics2D g2) {
		
//		g2.setColor(Color.white);// Sets a color to use for drawing objects
//		g2.fillRect(x, y, gp.titleSize, gp.titleSize);// Draw a rectangle and fills  it with the specified color 
		
		BufferedImage image = null;
		
		switch(direction) {
		
		case "up":
			if(spriteNum == 1) {
				image = up1;
			}
			if(spriteNum ==2) {
				image = up2;
			}
			break;
		case "down":
			if(spriteNum == 1) {
				image = down1;
			}
			if(spriteNum ==2) {
				image = down2;
			}
			break;
		case "left":
			if(spriteNum == 1) {
				image = left1;
			}
			if(spriteNum ==2) {
				image = left2;
			}
			break;
		case "right":
			if(spriteNum == 1) {
				image = right1;
			}
			if(spriteNum ==2) {
				image = right2;
			}
			break;
			
		}
		
		g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null) ;
		
	}
}