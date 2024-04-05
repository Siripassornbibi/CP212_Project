package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Shelf extends SuperObject{
	
	public OBJ_Shelf() {
		
		name = "shelf";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/shelf.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
