package menu;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class User extends JFrame implements ActionListener {
    private JButton nextButton;
    private JButton backButton;
    private JPanel fieldPanel;
    private JFrame frame;
    private JPanel buttonPanel;
    private JLabel label;
    private JTextField inputField;
    private String username;

    public User() {
    	getContentPane().setBackground(new Color(240, 236, 228));
        setTitle("User Input");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(768, 576));
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{768, 0};
        gridBagLayout.rowHeights = new int[]{317, 13, 124, 0};
        gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
        getContentPane().setLayout(gridBagLayout);
        
        fieldPanel = new JPanel();
        fieldPanel.setBackground(new Color(244, 238, 224));
        fieldPanel.setLayout(null);
        GridBagConstraints gbc_fieldPanel = new GridBagConstraints();
        gbc_fieldPanel.fill = GridBagConstraints.BOTH;
        gbc_fieldPanel.insets = new Insets(0, 0, 5, 0);
        gbc_fieldPanel.gridx = 0;
        gbc_fieldPanel.gridy = 0;
        getContentPane().add(fieldPanel, gbc_fieldPanel);
                
                ImageIcon icon = new ImageIcon(User.class.getResource("/button/inputnameTXT.png"));
                Image scaledImage = icon.getImage().getScaledInstance(574, 63, Image.SCALE_SMOOTH);
                
                label = new JLabel("");
                label.setBackground(new Color(244, 238, 224));
                label.setBounds(107, 147, 564, 69);
                fieldPanel.add(label);
                label.setHorizontalAlignment(SwingConstants.TRAILING);
                label.setPreferredSize(new Dimension(574, 63));
                label.setIcon(new ImageIcon(scaledImage));
                
                inputField = new JTextField();
                inputField.setBounds(114, 238, 529, 40);
                fieldPanel.add(inputField);
                inputField.setColumns(10);
                        
        
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(244, 238, 224));
        GridBagConstraints gbc_buttonPanel = new GridBagConstraints();
        gbc_buttonPanel.fill = GridBagConstraints.HORIZONTAL;
        gbc_buttonPanel.insets = new Insets(0, 0, 5, 0);
        gbc_buttonPanel.gridx = 0;
        gbc_buttonPanel.gridy = 1;
        getContentPane().add(buttonPanel, gbc_buttonPanel);
        
                // Create the quit button
                backButton = new JButton("");
                buttonPanel.add(backButton);
                backButton.setIcon(new ImageIcon(User.class.getResource("/button/backButton.png")));
                backButton.setBounds(411, 334, 245, 77);
                backButton.setOpaque(false);
                backButton.setContentAreaFilled(false);
                backButton.setBorderPainted(false);
                
                        // Create the start button
                        nextButton = new JButton("");
                        buttonPanel.add(nextButton);
                        nextButton.setIcon(new ImageIcon(User.class.getResource("/button/nextButton.png")));
                        nextButton.setBounds(112, 334, 245, 77);
                        nextButton.setOpaque(false);
                        nextButton.setContentAreaFilled(false);
                        nextButton.setBorderPainted(false);
                        nextButton.addActionListener(this);
                        backButton.addActionListener(this);
        
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
            User user = (User) SwingUtilities.getWindowAncestor((JButton)e.getSource());
            user.setVisible(false);

			// go to story panel
            username = inputField.getText().trim();
            Story story = new Story(username);
            story.showPanel();
        	
        } else if (e.getSource() == backButton) {
        	// Hide the user panel
            setVisible(false);

            // Create the game menu panel
            GameMenu gameMenu = new GameMenu();
            gameMenu.showPanel();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(User::new);
    }
}