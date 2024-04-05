package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BedP_U extends SuperObject{
	
	public OBJ_BedP_U() {
			
			name = "BedP_U";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/BedP_U.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}

}
