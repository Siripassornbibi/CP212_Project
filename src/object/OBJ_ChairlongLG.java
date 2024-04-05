package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_ChairlongLG extends SuperObject {

	public OBJ_ChairlongLG() {
		
		name = "ChairlongLG";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ChairlongLG.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
