package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_Tree3T extends SuperObject{
	public OBJ_Tree3T() {
			
			name = "Tree3T";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/Tree3T.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}
	

}
