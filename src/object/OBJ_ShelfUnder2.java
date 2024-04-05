package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_ShelfUnder2 extends SuperObject{
public OBJ_ShelfUnder2() {
		
		name = "ShelfUnder2";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ShelfUnder2.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
