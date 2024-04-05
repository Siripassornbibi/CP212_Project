package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BedG_T extends SuperObject{
public OBJ_BedG_T() {
		
		name = "BedG_T";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/BedG_T.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
