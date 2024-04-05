package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Tissues extends SuperObject{
	public OBJ_Tissues() {
			
			name = "Tissues";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/Tissues.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}

}
