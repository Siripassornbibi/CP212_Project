package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_ChairlongRG extends SuperObject {

	public OBJ_ChairlongRG() {
		
		name = "ChairlongRG";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ChairlongRG.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
