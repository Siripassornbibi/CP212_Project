package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

import entity.Player;
import object.SuperObject;
import tile.TileManager;

public class GamePanel extends JPanel implements Runnable{
	
	//GAME MENU
	public void showPanel() {
	    JFrame frame = new JFrame("Game Panel");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(this);
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    
	    // Set up the game
	    setupGame();
	    
	    // Start the game thread
	    startGameThread();
	}
	
	// SCREEN STTINGS 
	final int originalTitleSize = 16; // 16x16 tile
	final int scale = 3;
	
	public int tileSize = originalTitleSize * scale; // 48x48 tile
	public	final int maxScreenCol = 16;
	public	final int maxScreenRow = 12;
	public	final int screenWidth = tileSize * maxScreenCol; // 768 pixels
	public	final int screenHeight = tileSize * maxScreenRow;// 576 pixels
	
	// WORLD SETTING
	public final int maxWorldCol = 34;
	public final int maxWorldRow = 33;
	public final int worldWidth = tileSize * maxWorldCol;
	public final int worldHeight = tileSize * maxWorldRow;
	
	// FPS
	int FPS = 60;
	
	TileManager tileM = new TileManager(this);
	KeyHandler keyH = new KeyHandler();
	public UI ui = new UI(this);
	Thread gameThread;
	public CollisionChecker cChecker = new CollisionChecker(this);
	public AssetSetter aSetter = new AssetSetter(this);
	public Player player = new Player(this,keyH);
	public SuperObject obj[] = new SuperObject[200];// 	CAN CHANGE
	
 	
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));// Set the size of this class
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);/* if set true, all the drawing from this component will be done in an off screen painting buffer
									    enabling this can improve game's rendering performance */
		this.addKeyListener(keyH);
		this.setFocusable(true); // With this, this GamePanel can be focused to receive key input
	}
	
	public void setupGame() {
		
		aSetter.setObject();
	}
	
	
	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}

	public void run() {
		
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0;
		int drawCount = 0;
		
		while(gameThread != null) {
			
			currentTime = System.nanoTime();
			
			delta +=(currentTime - lastTime) / drawInterval;
			timer += (currentTime - lastTime);
			lastTime = currentTime;
			
			if(delta >= 1 ) {
				update();
				repaint();
				delta--;
				drawCount++;
			}
			
			if(timer >=1000000000) {
				System.out.println("FPS:" + drawCount);
				drawCount = 0;
				timer = 0;
			}
			
		}
	}
	public void update() {
		
		player.update();
		
	}
	
	
	public void paintComponent(Graphics g) { // Graphics a class that has many functions to draw objects on the screen
		 
		super.paintComponent(g);
		
		Graphics2D g2 =(Graphics2D)g; // Graphics2D class extends the Graphics class to provide more sophisticated control over geometry, coordinate transformation,color management, and text layout
		
		//TILE
		tileM.draw(g2);
		
		//OBJECT
		for(int i = 0; i < obj.length; i++) {
			if(obj[i] != null) {
				obj[i].draw(g2, this);
			}
		}
		
		//PLAYER
		player.draw(g2);
		
		//UI
		ui.draw(g2);
		
		g2.dispose();// Dispose of this graphics context and release any system resources that it is using
		
	}
}