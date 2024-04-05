package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Picture2 extends SuperObject{
public OBJ_Picture2() {
		
		name = "Picture2";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Picture2.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
