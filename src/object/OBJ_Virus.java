package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Virus extends SuperObject {
	
		public OBJ_Virus() {
			
			name = "Virus";
			try {
				 image = ImageIO.read(getClass().getResourceAsStream("/objects/virus.png"));
				 
			}catch(IOException e) {
				e.printStackTrace();
				
				}
			collision = true;
			}
}


