package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_FloorLampU extends SuperObject {

	public OBJ_FloorLampU() {
		
		name = "FloorLampU";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/FloorLampU.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
