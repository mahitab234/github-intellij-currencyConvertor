package currencyconvertor;

import javax.swing.*;
import java.awt.*;


public class RateUsFrame {

    public static void openRateUsFrame() {
        JFrame rateFrame = new JFrame("Rate Us");
        rateFrame.setSize(300, 150);
        rateFrame.setLayout(new GridLayout(3, 1));
        rateFrame.setLocationRelativeTo(null);

        JLabel rateLabel = new JLabel("Rate us");
        rateLabel.setFont(new Font(Font.SERIF,Font.PLAIN,22));
        JPanel ratePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 300, 5));
        ratePanel.setBackground(Color.white);
        rateLabel.setBackground(Color.white);
        JPanel starPanel = new JPanel(new FlowLayout());
        starPanel.setBackground(Color.white);
        JButton[] stars = new JButton[5];
        for (int i = 0; i < 5; i++) {
            stars[i] = new JButton("\u2605"); // Unicode for star
            stars[i].setForeground(Color.GRAY);
            stars[i].setBackground(Color.white);
            final int index = i;
            stars[i].addActionListener(e -> {
                for (int j = 0; j < 5; j++) {
                    stars[j].setForeground(j <= index ? Color.PINK : Color.GRAY);
                }
            });
            starPanel.add(stars[i]);
        }

        JButton submitButton = new JButton("Submit");
        submitButton.setBackground(Color.pink);
        submitButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(rateFrame, "Your feedback is sent successfully!");
            rateFrame.dispose();
        });

        ratePanel.add(rateLabel);
        rateFrame.add(ratePanel);
        rateFrame.add(starPanel);
        rateFrame.add(submitButton);
        rateFrame.setVisible(true);
    }
}
