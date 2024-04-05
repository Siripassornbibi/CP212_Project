package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Bigbogshelf3_UR extends SuperObject{
public OBJ_Bigbogshelf3_UR() {
		
		name = "Bigbogshelf3_UR";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Bigbogshelf3_UR.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
