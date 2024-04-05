package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_TableL extends SuperObject {

	public OBJ_TableL() {
		
		name = "TableL";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/TableL.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
