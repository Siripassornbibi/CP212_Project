package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Liftlowleft extends SuperObject {

public OBJ_Liftlowleft() {
		
		name = "Liftlowleft";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/liftlowleft.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
	}
}
