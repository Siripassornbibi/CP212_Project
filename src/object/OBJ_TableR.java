package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_TableR extends SuperObject {

	public OBJ_TableR() {
		
		name = "TableR";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/TableR.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
