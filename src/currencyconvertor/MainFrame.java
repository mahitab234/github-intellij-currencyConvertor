package currencyconvertor;
import java.awt.*;
import javax.swing.*;

public final class MainFrame{
    private JFrame mainFrame;
    private double amount;
    private String from = "EGP", to = "USD";
    public MainFrame(){
        initialize();
    }
    // creating the main frame form
    public void initialize(){
        mainFrame = new JFrame();
        this.mainFrame.setTitle("Currency Convertor");
        this.mainFrame.setSize(600,400);
        this.mainFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.mainFrame.setLocationRelativeTo(null);
        this.mainFrame.setResizable(false);
        
        // creating the container holds the components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
        panel.setBackground(Color.white);
        mainFrame.add(panel, BorderLayout.CENTER);
        
        // the container holding app name
        JPanel header = new JPanel();
        header.setLayout(new FlowLayout(FlowLayout.CENTER, 600, 5));
        header.setBackground(Color.PINK);
        panel.add(header);
        
        // the app name
        JLabel headText = new JLabel();
        headText.setText("Currency Convertor");
        headText.setFont(new Font (Font.SERIF,Font.ITALIC,40));
        header.add(headText);
        
        // the container holding the main components
        JPanel body = new JPanel(new GridLayout(3, 2, 60, 10));
        body.setBackground(Color.white);
        panel.add(body);

        // lables to clarify the operation field
        JLabel chooseCurrency = new JLabel("Choose currency:");
        chooseCurrency.setFont(new Font (Font.SERIF,Font.PLAIN,22));        
        JLabel convertTo = new JLabel("Convert to:");
        convertTo.setFont(new Font (Font.SERIF,Font.PLAIN,22));
        body.add(chooseCurrency);
        body.add(convertTo);
        
        // buttons to show the selected currencies
        JButton cf_btn = new JButton("EGP");
        JButton ct_btn = new JButton("USD");
        cf_btn.setFont(new Font (Font.SERIF,Font.PLAIN,20));
        cf_btn.setBackground(Color.pink);
        cf_btn.addActionListener((e) -> {
            CurrencyDetails.createFrame(cf_btn);
            from = cf_btn.getText();
        });
        ct_btn.setFont(new Font (Font.SERIF,Font.PLAIN,20));
        ct_btn.setBackground(Color.pink);
        ct_btn.addActionListener((e) -> {
            CurrencyDetails.createFrame(ct_btn);
            to = ct_btn.getText();
        });
        body.add(cf_btn);
        body.add(ct_btn);
        
        // text fields to show the amounts
        JTextField entry = new JTextField();
        JTextField show = new JTextField();
        entry.setBackground(Color.white);
        entry.setEditable(true);
        entry.setText("00.00");
        entry.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        entry.addActionListener((e) -> {
            try {
                amount = Double.parseDouble(entry.getText());
                show.setText(CurrencyDetails.convertCurrency(from, to, amount));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(mainFrame, "Invalid amount entered!");
            }
        });
        show.setBackground(Color.white);
        show.setEditable(false);
        show.setText("00.00");
        show.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        body.add(entry);
        body.add(show);
        
        // the container holding clear & rate us buttons
        JPanel bottomBody = new JPanel(new GridLayout(1, 2, 60, 10));
        bottomBody.setBackground(Color.white);
        panel.add(bottomBody);
        
        //rate ue & clear buttons
        JButton clear = new JButton("Clear");
        clear.setBackground(Color.pink);
        clear.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        clear.addActionListener((e) -> {
            cf_btn.setText("EGP");
            ct_btn.setText("USD");
            entry.setText("00.00");
            show.setText("00.00");
            JOptionPane.showMessageDialog(mainFrame, "Cleared successfully!");
        });
        JButton rateUs = new JButton("Rate us");
        rateUs.setBackground(Color.pink);
        rateUs.setFont(new Font(Font.SERIF,Font.PLAIN,20));
        rateUs.addActionListener((e) -> {
            RateUsFrame.openRateUsFrame();
        });
        bottomBody.add(clear);
        bottomBody.add(rateUs);
        
        this.mainFrame.setVisible(true);
    }
    
}
