package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_RubbishbinG extends SuperObject {

	public OBJ_RubbishbinG() {
		
		name = "RubbishbinG";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/rubbishbinG.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
