package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_BedsideTable2 extends SuperObject{
public OBJ_BedsideTable2() {
		
		name = "BedsideTable2";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/BedsideTable2.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}


