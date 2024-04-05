package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_RubbishbinO extends SuperObject {

	public OBJ_RubbishbinO() {
		
		name = "RubbishbinO";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/rubbishbinO.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
