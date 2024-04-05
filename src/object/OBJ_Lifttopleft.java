package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Lifttopleft extends SuperObject {

public OBJ_Lifttopleft() {
		
		name = "Lifttopleft";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/lifttopleft.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
	}
}
