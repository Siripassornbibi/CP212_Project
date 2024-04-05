package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_ChairG extends SuperObject{
	public OBJ_ChairG() {
			
			name = "ChairG";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/ChairG.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}

}
