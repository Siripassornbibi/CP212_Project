package menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import main.GamePanel;

public class Story extends JFrame implements ActionListener {
    private JButton nextButton;
    private JPanel storyPanel;
    private JFrame frame;
    private JPanel buttonPanel;
    private JLabel storyLabel1;
    private JLabel storyLabel2;
    private JLabel storyLabel3;
    private JLabel storyLabel4;
    private JLabel item1;
    private JLabel item2;
    private JLabel item3;
    private JLabel item4;
    private JLabel picture;

    public Story(String username) {
    	getContentPane().setBackground(new Color(240, 236, 228));
        setTitle("Story");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(768, 576));
        getContentPane().setLayout(null);
        
        storyPanel = new JPanel();
        storyPanel.setBounds(0, 0, 760, 537);
        storyPanel.setBackground(new Color(244, 238, 224));
        storyPanel.setLayout(null);
        getContentPane().add(storyPanel);
                
        ImageIcon icon = new ImageIcon(User.class.getResource("/button/inputnameTXT.png"));
        Image scaledImage = icon.getImage().getScaledInstance(574, 63, Image.SCALE_SMOOTH);
        
        storyLabel1 = new JLabel("Hello " + username + ". In a town filled with an epidemic, where " + username + " and your younger sister live, ");
        storyLabel1.setBounds(75, 92, 675, 43);
        storyLabel1.setFont(new Font("Arial", Font.PLAIN, 17));
        storyPanel.add(storyLabel1);
        
        storyLabel2 = new JLabel("your sister has contracted the disease. Therefore, you need to go to a hospital to search ");
        storyLabel2.setBounds(42, 146, 675, 43);
        storyLabel2.setFont(new Font("Arial", Font.PLAIN, 17));
        storyPanel.add(storyLabel2);
        
        storyLabel3 = new JLabel("for the four essential items: hand sanitizer spray, vaccine syringe, pills, and face mask, ");
        storyLabel3.setBounds(42, 200, 675, 43);
        storyLabel3.setFont(new Font("Arial", Font.PLAIN, 17));
        storyPanel.add(storyLabel3);
        
        storyLabel4 = new JLabel("to provide them to your sister and yourself for protection.");
        storyLabel4.setBounds(42, 254, 675, 43);
        storyLabel4.setFont(new Font("Arial", Font.PLAIN, 17));
        storyPanel.add(storyLabel4);
                        
//        buttonPanel = new JPanel();
//        buttonPanel.setBounds(0, 315, 760, 95);
//        buttonPanel.setBackground(new Color(244, 238, 224));
//        getContentPane().add(buttonPanel);
                
        // Create the start button
        nextButton = new JButton("");
        storyPanel.add(nextButton);
        nextButton.setIcon(new ImageIcon(User.class.getResource("/button/nextButton.png")));
        nextButton.setBounds(92, 344, 245, 77);
        nextButton.setOpaque(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setBorderPainted(false);
        
        item1 = new JLabel("");
        item1.setIcon(new ImageIcon(Story.class.getResource("/objects/itemMask.PNG")));
        item1.setBounds(158, 462, 40, 43);
        storyPanel.add(item1);
        
        item2 = new JLabel("");
        item2.setIcon(new ImageIcon(Story.class.getResource("/objects/itemPill.PNG")));
        item2.setBounds(75, 462, 32, 35);
        storyPanel.add(item2);
        
        item3 = new JLabel("");
        item3.setIcon(new ImageIcon(Story.class.getResource("/objects/itemSpray.PNG")));
        item3.setBounds(248, 462, 32, 32);
        storyPanel.add(item3);
        
        item4 = new JLabel("");
        item4.setIcon(new ImageIcon(Story.class.getResource("/objects/itemVaccine.PNG")));
        item4.setBounds(323, 462, 32, 32);
        storyPanel.add(item4);
        
        picture = new JLabel("");
        picture.setIcon(new ImageIcon(Story.class.getResource("/button/Hospital.png")));
        picture.setBounds(316, 241, 456, 368);
        storyPanel.add(picture);
        nextButton.addActionListener(this);
        
        pack();
        setLocationRelativeTo(null); // Center the window on the screen
        setVisible(true);
    }
    
    public void showPanel() {
        setVisible(true); // Show the User panel
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
        	// Hide the game menu
            Story story = (Story) SwingUtilities.getWindowAncestor((JButton)e.getSource());
            story.setVisible(false);

            // Create the game panel
            GamePanel gamePanel = new GamePanel();
            gamePanel.showPanel();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(User::new);
    }

}