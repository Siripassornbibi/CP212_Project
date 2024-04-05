package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Chair extends SuperObject{
	public OBJ_Chair() {
		
		name = "Chair";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Chair.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}

}
