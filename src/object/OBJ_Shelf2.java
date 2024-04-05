package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Shelf2 extends SuperObject{
	
	public OBJ_Shelf2() {
		
		name = "shelf2";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/shelf1.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
