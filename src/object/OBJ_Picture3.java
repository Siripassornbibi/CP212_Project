package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Picture3 extends SuperObject{
public OBJ_Picture3() {
		
		name = "Picture3";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Picture3.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
