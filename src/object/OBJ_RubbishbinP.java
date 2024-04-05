package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_RubbishbinP extends SuperObject {

	public OBJ_RubbishbinP() {
		
		name = "RubbishbinP";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/rubbishbinP.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
