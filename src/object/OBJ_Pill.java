package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Pill extends SuperObject {
	
public OBJ_Pill() {
		
		name = "Pill";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/itemPill.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		//collision = true;
	}

}
