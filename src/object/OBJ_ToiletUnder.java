package object;

import java.io.IOException;

import javax.imageio.ImageIO;


public class OBJ_ToiletUnder extends SuperObject{
	public OBJ_ToiletUnder() {
		
		name = "ToiletUnder";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ToiletUnder.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
