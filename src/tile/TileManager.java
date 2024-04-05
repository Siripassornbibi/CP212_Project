package tile;

import java.awt.Graphics2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;

import main.GamePanel;

public class TileManager {

	GamePanel gp;
	public Tile[] tile;
	public int mapTileNum [] [];
	
	public TileManager(GamePanel gp) {
		
		this.gp = gp;
		
		tile =new Tile[50];//เพิ่มได้
		mapTileNum = new int [gp.maxWorldCol] [gp.maxWorldRow];
		
		getTileimage();
		loadMap("/maps/map03.txt"); //เรียกmethod ภายในคลาสให้ทำงาน
		
	}
	
	public void getTileimage() {
		
		try {
			
			tile[0] = new Tile();
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall0.png"));
			tile[0].collision = true;
			
			tile[1] = new Tile();
			tile[1].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall1.png"));
			tile[1].collision = true;
			
			tile[2] = new Tile();
			tile[2].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall2.png"));
			tile[2].collision = true;

			tile[3] = new Tile();
			tile[3].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall3.png"));
			tile[3].collision = true;
			
			tile[4] = new Tile();
			tile[4].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall4.png"));
			tile[4].collision = true;
			
			tile[5] = new Tile();
			tile[5].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor5.png"));
			
			tile[6] = new Tile();
			tile[6].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor6.png"));
			
			tile[7] = new Tile();
			tile[7].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall7.png"));
			tile[7].collision = true;
			
			tile[8] = new Tile();
			tile[8].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall8.png"));
			tile[8].collision = true;
			
			tile[9] = new Tile();
			tile[9].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor9.png"));
			
			tile[10] = new Tile();
			tile[10].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall10.png"));
			tile[10].collision = true;
			
			tile[11] = new Tile();
			tile[11].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor11.png"));
			
			tile[12] = new Tile();
			tile[12].image = ImageIO.read(getClass().getResourceAsStream("/tiles/wall12.png"));
			tile[12].collision = true;
			
			tile[13] = new Tile();
			tile[13].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor13.png"));
			
			tile[14] = new Tile();
			tile[14].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor14.png"));
			
			tile[15] = new Tile();
			tile[15].image = ImageIO.read(getClass().getResourceAsStream("/tiles/floor15.png"));
			
			tile[16] = new Tile();
			tile[16].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/0CLwall16.png"));
			tile[16].collision = true;
			
			tile[17] = new Tile();
			tile[17].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/0CRwall17.png"));
			tile[17].collision = true;
			
			tile[18] = new Tile();
			tile[18].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/1CL18.png"));
			tile[18].collision = true;
			
			tile[19] = new Tile();
			tile[19].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/1CR19.png"));
			tile[19].collision = true;
			
			tile[20] = new Tile();
			tile[20].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/2CL20.png"));
			tile[20].collision = true;
			
			tile[21] = new Tile();
			tile[21].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/2CR21.png"));
			tile[21].collision = true;
			
			tile[22] = new Tile();
			tile[22].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/3C22.png"));
			tile[22].collision = true;
			
			tile[23] = new Tile();
			tile[23].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/4LC23.png"));
			tile[23].collision = true;
			
			tile[24] = new Tile();
			tile[24].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/4RC24.png"));
			tile[24].collision = true;
			
			tile[25] = new Tile();
			tile[25].image = ImageIO.read(getClass().getResourceAsStream("/tiles/couter/5C25.png"));
			tile[25].collision = true;
			
			tile[26] = new Tile();
			tile[26].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shadow/shadowFloor26.png"));
			
			tile[27] = new Tile();
			tile[27].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shadow/shadowFloor27.png"));
			
			tile[28] = new Tile();
			tile[28].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shadow/shadowFloor28.png"));
			
			tile[29] = new Tile();
			tile[29].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shadow/shadowFloor29.png"));
			
			tile[30] = new Tile();
			tile[30].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shadow/shadowBL_Partition30.png"));
			tile[30].collision = true;
			
			tile[31] = new Tile();
			tile[31].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shadow/shadowBR_Partition31.png"));
			tile[31].collision = true;
			
			tile[32] = new Tile();
			tile[32].image = ImageIO.read(getClass().getResourceAsStream("/tiles/shadow/shadowFloor32.png"));
			
			tile[33] = new Tile();
			tile[33].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/A_Partition33.png"));
			tile[33].collision = true;
			
			tile[34] = new Tile();
			tile[34].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/BL_Partition34.png"));
			tile[34].collision = true;
			
			tile[35] = new Tile();
			tile[35].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/BR_Partition35.png"));
			tile[35].collision = true;
			
			tile[36] = new Tile();
			tile[36].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/CL_Partition36.png"));
			tile[36].collision = true;
			
			tile[37] = new Tile();
			tile[37].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/CR_Partition37.png"));
			tile[37].collision = true;
			
			tile[38] = new Tile();
			tile[38].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/DL_Partition38.png"));
			tile[38].collision = true;
			
			tile[39] = new Tile();
			tile[39].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/DR_Partition39.png"));
			tile[39].collision = true;
			
			tile[42] = new Tile();
			tile[42].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/ET_Partition42.png"));
			tile[42].collision = true;
			
			tile[43] = new Tile();
			tile[43].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/EU_Partition43.png"));
			tile[43].collision = true;
			
			tile[44] = new Tile();
			tile[44].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/FT_Partition44.png"));
			tile[44].collision = true;
			
			tile[45] = new Tile();
			tile[45].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/FU_Partition45.png"));
			tile[45].collision = true;
			
			tile[46] = new Tile();
			tile[46].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/AR_Partition46.png"));
			tile[46].collision = true;
			
			tile[47] = new Tile();
			tile[47].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/ETR_Partition46.png"));
			tile[47].collision = true;
			
			tile[48] = new Tile();
			tile[48].image = ImageIO.read(getClass().getResourceAsStream("/tiles/partition/EUR_Partition47.png"));
			tile[48].collision = true;
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void loadMap(String filePath) {
		
		try {
			
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			int col = 0;
			int row = 0;
			
			while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
				
				String line = br.readLine();
				
				while(col < gp.maxWorldCol) {
					
					String numbers[] =line.split(" ");
					
					int num = Integer.parseInt(numbers[col]);
					
					mapTileNum[col][row]=num;
					col++;
				}
				if(col == gp.maxWorldCol) {
					col = 0;
					row++;
				}
			} 
			br.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void draw(Graphics2D g2) {
		
		int worldCol = 0;
		int worldRow = 0;
		
		
		while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
			
			int tileNum = mapTileNum[worldCol][worldRow];
			
			int worldX = worldCol * gp.tileSize;
			int worldY = worldRow * gp.tileSize;
			int screenX = worldX - gp.player.worldX + gp.player.screenX;
			int screenY = worldY - gp.player.worldY + gp.player.screenY;
			
			//ในส่วนนี้คือการทำเงื่อนไขเพื่อเช็คว่าแผนที่ (tile) ตัวนี้อยู่ในขอบเขตที่จะถูกวาดบนหน้าจอหรือไม่ โดยใช้ค่าตำแหน่งของแผนที่และผู้เล่นในโลก (world) และค่าตำแหน่งของผู้เล่นบนหน้าจอ (screen)
			if(worldX + gp.tileSize > gp.player.worldX - gp.player.screenX &&
			   worldX - gp.tileSize < gp.player.worldX + gp.player.screenX &&
			   worldY + gp.tileSize > gp.player.worldY - gp.player.screenY &&
			   worldY - gp.tileSize < gp.player.worldY + gp.player.screenY) {
				
				g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
			}
			
			
			
			worldCol++;
			
			
			if(worldCol == gp.maxWorldCol) {
				worldCol = 0;
				worldRow++;
				
			}
			
		}
		
	}
	
}