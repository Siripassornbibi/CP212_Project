package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Sink2L extends SuperObject{
	public OBJ_Sink2L() {
		
		name = "Sink2L";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Sink2L.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
