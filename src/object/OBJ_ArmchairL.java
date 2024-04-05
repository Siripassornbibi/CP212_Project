package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_ArmchairL extends SuperObject {
	
	public OBJ_ArmchairL() {
		
		name = "ArmchairL";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ArmchairL.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
