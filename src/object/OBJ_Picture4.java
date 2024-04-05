package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Picture4 extends SuperObject{
public OBJ_Picture4() {
		
		name = "Picture4";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Picture4.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
