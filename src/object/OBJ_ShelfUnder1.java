package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_ShelfUnder1 extends SuperObject{
public OBJ_ShelfUnder1() {
		
		name = "ShelfUnder1";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/ShelfUnder1.png"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
