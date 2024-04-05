package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_FloorLampT extends SuperObject {

	public OBJ_FloorLampT() {
		
		name = "FloorLampT";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/FloorLampT.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
