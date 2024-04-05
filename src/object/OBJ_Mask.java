package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Mask extends SuperObject {

	public OBJ_Mask() {
		
		name = "Mask";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/itemMask.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
		}
		//collision = true;
		
	}
}
