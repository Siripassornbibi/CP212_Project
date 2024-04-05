package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Vaccine extends SuperObject {
	
public OBJ_Vaccine() {
		
		name = "Vaccine";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/itemVaccine.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		//collision = true;
	}

}
