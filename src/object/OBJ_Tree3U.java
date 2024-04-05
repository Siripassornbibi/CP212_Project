package object;

import java.io.IOException;
import javax.imageio.ImageIO;


public class OBJ_Tree3U extends SuperObject{
	public OBJ_Tree3U() {
			
			name = "Tree3U";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/Tree3U.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}
	

}
