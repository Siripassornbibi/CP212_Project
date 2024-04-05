package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Lifttopright extends SuperObject {

public OBJ_Lifttopright() {
		
		name = "Lifttopright";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/lifttopright.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
	}
	
}
