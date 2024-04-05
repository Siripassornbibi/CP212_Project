package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_ChairlongLP extends SuperObject {

	public OBJ_ChairlongLP() {
		
		name = "ChairlongLP";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ChairlongLP.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
