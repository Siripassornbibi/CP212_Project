package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Tree4 extends SuperObject {
	public OBJ_Tree4() {
		
		name = "Tree4";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/tree4.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}

}
