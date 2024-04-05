package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Bigbogshelf3_TR extends SuperObject{
public OBJ_Bigbogshelf3_TR() {
		
		name = "Bigbogshelf3_TR";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Bigbogshelf3_TR.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		
		}
}
