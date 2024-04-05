package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_ShelfTop1 extends SuperObject{
public OBJ_ShelfTop1() {
		
		name = "ShelfTop1";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ShelfTop1.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
