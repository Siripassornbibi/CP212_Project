package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Spray extends SuperObject{
	
	public OBJ_Spray() {
		
		name = "Spray";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/itemSpray.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();		
		}
		//collision = true;
	}
}
