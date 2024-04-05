package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BedG_U extends SuperObject{
	public OBJ_BedG_U() {
			
			name = "BedG_U";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/BedG_U.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}
}
