package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_BedP_T extends SuperObject{
	public OBJ_BedP_T() {
			
			name = "BedP_T";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/BedP_T.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}
	

}
