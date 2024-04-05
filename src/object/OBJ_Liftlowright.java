package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Liftlowright extends SuperObject {

public OBJ_Liftlowright() {
		
		name = "Liftlowright";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/liftlowright.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
	}
}
