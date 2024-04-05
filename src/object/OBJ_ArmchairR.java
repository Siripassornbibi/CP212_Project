package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_ArmchairR extends SuperObject {
	
	public OBJ_ArmchairR() {
		
		name = "ArmchairR";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ArmchairR.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
