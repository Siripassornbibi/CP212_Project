package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Bigbogshelf3_TL extends SuperObject{
public OBJ_Bigbogshelf3_TL() {
		
		name = "Bigbogshelf3_TL";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Bigbogshelf3_TL.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
