package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_ShelfTop2 extends SuperObject{
public OBJ_ShelfTop2() {
		
		name = "ShelfTop2";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ShelfTop2.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
