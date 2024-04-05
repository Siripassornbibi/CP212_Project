package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_ToiletTop extends SuperObject{
	public OBJ_ToiletTop() {
			
			name = "ToiletTop";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/ToiletTop.PNG"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}
}
