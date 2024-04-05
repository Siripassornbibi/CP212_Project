package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BedsideTable1 extends SuperObject{
	public OBJ_BedsideTable1() {
		
		name = "BedsideTable1";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/BedsideTable1.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
