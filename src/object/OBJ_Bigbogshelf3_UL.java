package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Bigbogshelf3_UL extends SuperObject{
public OBJ_Bigbogshelf3_UL() {
		
		name = "Bigbogshelf3_UL";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Bigbogshelf3_UL.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
