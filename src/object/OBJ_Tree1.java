package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Tree1 extends SuperObject{

	public OBJ_Tree1() {
		
		name = "Tree";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Tree2.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
