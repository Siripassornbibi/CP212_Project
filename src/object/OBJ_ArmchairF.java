package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_ArmchairF extends SuperObject {

	public OBJ_ArmchairF() {
		
		name = "ArmchairF";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ArmchairF.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		collision = true;
		}
}
