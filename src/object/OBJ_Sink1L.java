package object;
import java.io.IOException;
import javax.imageio.ImageIO;

public class OBJ_Sink1L extends SuperObject{
	public OBJ_Sink1L() {
		
		name = "Sink1L";
		try {
			 image = ImageIO.read(getClass().getResourceAsStream("/objects/Sink1L.PNG"));
			 
		}catch(IOException e) {
			e.printStackTrace();
			
			}
		collision = true;
		}
}
