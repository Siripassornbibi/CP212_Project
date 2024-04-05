package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_ChairlongRP extends SuperObject {

	public OBJ_ChairlongRP() {
		
		name = "ChairlongRG";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ChairlongRP.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
