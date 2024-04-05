package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Sink2R extends SuperObject{
	public OBJ_Sink2R() {
		
		name = "Sink2R";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Sink2R.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}

}
