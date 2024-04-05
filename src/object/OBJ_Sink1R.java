package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Sink1R extends SuperObject{
	public OBJ_Sink1R() {
		
		name = "Sink1R";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Sink1R.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
