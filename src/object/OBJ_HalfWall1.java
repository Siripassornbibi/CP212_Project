package object;

import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_HalfWall1 extends SuperObject{
	public OBJ_HalfWall1() {
			
			name = "HalfWall1";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/HalfWall1.PNG"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}
}
