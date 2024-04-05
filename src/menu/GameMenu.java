package menu;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameMenu extends JFrame implements ActionListener {
    private JButton startButton;
    private JButton quitButton;
    private JPanel labelPanel;
    private JLabel startGame;
    private JFrame frame;
    private JPanel panel;
    private JPanel panel_1;

    public GameMenu() {
    	getContentPane().setBackground(new Color(255, 243, 226));
    	
        setTitle("Game Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(768, 576));

        // Create the start button
        startButton = new JButton("");
        startButton.setIcon(new ImageIcon(GameMenu.class.getResource("/button/startbutton.png")));
        startButton.setBounds(112, 334, 245, 77);
        startButton.setOpaque(false);
        startButton.setContentAreaFilled(false);
        startButton.setBorderPainted(false);
        startButton.addActionListener(this);

        // Create the quit button
        quitButton = new JButton("");
        quitButton.setIcon(new ImageIcon(GameMenu.class.getResource("/button/quitbutton.png")));
        quitButton.setBounds(411, 334, 245, 77);
        quitButton.setOpaque(false);
        quitButton.setContentAreaFilled(false);
        quitButton.setBorderPainted(false);
        quitButton.addActionListener(this);
        getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
        
        labelPanel = new JPanel();
        getContentPane().add(labelPanel);
        labelPanel.setSize(768, 112);
        GridBagLayout gbl_labelPanel = new GridBagLayout();
        gbl_labelPanel.columnWidths = new int[]{768, 0};
        gbl_labelPanel.rowHeights = new int[]{120, 137, 0};
        gbl_labelPanel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
        gbl_labelPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
        labelPanel.setLayout(gbl_labelPanel);
        
        panel = new JPanel();
        GridBagConstraints gbc_panel = new GridBagConstraints();
        gbc_panel.fill = GridBagConstraints.BOTH;
        gbc_panel.insets = new Insets(0, 0, 5, 0);
        gbc_panel.gridx = 0;
        gbc_panel.gridy = 0;
        labelPanel.add(panel, gbc_panel);
        
        panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 243, 226));
        GridBagConstraints gbc_panel_1 = new GridBagConstraints();
        gbc_panel_1.fill = GridBagConstraints.BOTH;
        gbc_panel_1.gridx = 0;
        gbc_panel_1.gridy = 1;
        labelPanel.add(panel_1, gbc_panel_1);
        
        startGame = new JLabel("");
        startGame.setPreferredSize(new Dimension(600, 450)); // กำหนดขนาดของ JLabel เป็น 200 x 100 พิกเซล
        
        ImageIcon icon = new ImageIcon(GameMenu.class.getResource("/button/treasuretoveTxt.png"));
        Image scaledImage = icon.getImage().getScaledInstance(600, 450, Image.SCALE_SMOOTH); // ปรับขนาดรูปภาพให้มีขนาด 100 x 50 พิกเซล
        startGame.setIcon(new ImageIcon(scaledImage)); 

        startGame.setHorizontalAlignment(SwingConstants.CENTER);
        panel_1.add(startGame);
        startGame.setFont(new Font("sans serif", Font.PLAIN, 50));
        startGame.setBounds(112, 162, 545, 93);

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(255, 243, 226));
        buttonPanel.setSize(768, 656);
        buttonPanel.add(startButton);
        buttonPanel.add(quitButton);
//        buttonPanel.setLayout(new GridBagLayout());
//        GridBagConstraints gbc = new GridBagConstraints();
//        gbc.gridx = 0;
//        gbc.gridy = 0;
//        gbc.insets = new Insets(10, 0, 10, 0);
//        buttonPanel.add(startButton, gbc);
//        gbc.gridy = 1;
//        buttonPanel.add(quitButton, gbc);
        
        
        
        // Add the button panel to the content pane
        getContentPane().add(buttonPanel);
        
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }

    public void showPanel() {
        setVisible(true); // Show the User panel
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
        	// Hide the game menu
            GameMenu gamemenu = (GameMenu) SwingUtilities.getWindowAncestor((JButton)e.getSource());
            gamemenu.setVisible(false);
//
//            // Create the game panel
//            GamePanel gamePanel = new GamePanel();
//            gamePanel.showPanel();
        	User user = new User();
            user.showPanel();
            
        	
        } else if (e.getSource() == quitButton) {
            System.exit(0); // Terminate the application
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameMenu::new);
    }
}
