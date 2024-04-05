package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Keycard extends SuperObject {
	
	public OBJ_Keycard() {
		
		name = "Keycard";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/keycard.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
	}
}
