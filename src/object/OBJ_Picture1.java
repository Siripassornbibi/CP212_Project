package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Picture1 extends SuperObject{
public OBJ_Picture1() {
		
		name = "Picture1";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Picture1.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
