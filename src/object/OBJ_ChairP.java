package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_ChairP extends SuperObject{
	public OBJ_ChairP() {
		
		name = "ChairP";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ChairP.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}

}
