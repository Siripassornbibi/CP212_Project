package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Irondoor extends SuperObject {
	public OBJ_Irondoor() {
		
		name = "Irondoor";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/irondoor.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
