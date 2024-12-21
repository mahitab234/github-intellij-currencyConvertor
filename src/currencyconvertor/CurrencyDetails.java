package currencyconvertor;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class CurrencyDetails {
    // frame of the currencies buttons
    public static void createFrame(JButton cf_btn) {
    JFrame choices = new JFrame();
    choices.setTitle("Choose Currency");
    choices.setLocationRelativeTo(null);
    choices.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    choices.setSize(300, 200);
    choices.setVisible(true);
    choices.setResizable(false);
    
    JPanel panel = new JPanel(new GridLayout(3, 3, 20, 10));
    panel.setBackground(Color.white);
    choices.add(panel);
    
    // currencies buttons
    JButton egp = new JButton("EGP");
    egp.setBackground(Color.pink);
    egp.addActionListener((e) -> {
        setCurrency(cf_btn, "EGP");
        choices.dispose();
    });
    JButton usd = new JButton("USD");
    usd.setBackground(Color.pink);
    usd.addActionListener((e) -> {
        setCurrency(cf_btn, "USD");
        choices.dispose();
    });
    JButton gbp = new JButton("GBP");
    gbp.setBackground(Color.pink);
    gbp.addActionListener((e) -> {
        setCurrency(cf_btn, "GBP");
        choices.dispose();
    });
    JButton eur = new JButton("EUR");
    eur.setBackground(Color.pink);
    eur.addActionListener((e) -> {
        setCurrency(cf_btn, "EUR");
        choices.dispose();
    });
    JButton jpy = new JButton("JPY");
    jpy.setBackground(Color.pink);
    jpy.addActionListener((e) -> {
        setCurrency(cf_btn, "JPY");
        choices.dispose();
    });
    JButton sar = new JButton("SAR");
    sar.setBackground(Color.pink);
    sar.addActionListener((e) -> {
        setCurrency(cf_btn, "SAR");
        choices.dispose();
    });
    JButton aed = new JButton("AED");
    aed.setBackground(Color.pink);
    aed.addActionListener((e) -> {
        setCurrency(cf_btn, "AED");
        choices.dispose();
    });
    JButton kwd = new JButton("KWD");
    kwd.setBackground(Color.pink);
    kwd.addActionListener((e) -> {
        setCurrency(cf_btn, "KWD");
        choices.dispose();
    });
    JButton inr = new JButton("INR");
    inr.setBackground(Color.pink);
    inr.addActionListener((e) -> {
        setCurrency(cf_btn, "INR");
        choices.dispose();
    });
    
    panel.add(egp);
    panel.add(usd);
    panel.add(gbp);
    panel.add(eur);
    panel.add(jpy);
    panel.add(sar);
    panel.add(aed);
    panel.add(kwd);
    panel.add(inr);
        
    choices.setVisible(true);
}

public static void setCurrency(JButton button, String currency) {
    button.setText(currency);
}
    
public static String convertCurrency(String fromCurrency, String toCurrency, double amount) {
    if (fromCurrency == null || toCurrency == null || fromCurrency.isEmpty() || toCurrency.isEmpty()) {
        return "Invalid Currency Selection";
    }
    
    double conversionRate = 1.0; // Default conversion rate

    switch (fromCurrency) {
        case "EGP" -> {
            switch (toCurrency) {
                case "USD" -> conversionRate = 0.020;
                case "GBP" -> conversionRate = 0.016;
                case "EUR" -> conversionRate = 0.019;
                case "JPY" -> conversionRate = 3.07;
                case "SAR" -> conversionRate = 0.074;
                case "AED" -> conversionRate = 0.072;
                case "KWD" -> conversionRate = 0.0060;
                case "INR" -> conversionRate = 1.67;
            }
            }

        case "USD" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 50.88;
                case "GBP" -> conversionRate = 0.80;
                case "EUR" -> conversionRate = 0.96;
                case "JPY" -> conversionRate = 156.46;
                case "SAR" -> conversionRate = 3.76;
                case "AED" -> conversionRate = 3.67;
                case "KWD" -> conversionRate = 0.31;
                case "INR" -> conversionRate = 84.95;
            }
            }

        case "GBP" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 63.96;
                case "USD" -> conversionRate = 1.26;
                case "EUR" -> conversionRate = 1.20;
                case "JPY" -> conversionRate = 196.64;
                case "SAR" -> conversionRate = 4.72;
                case "AED" -> conversionRate = 4.61;
                case "KWD" -> conversionRate = 0.39;
                case "INR" -> conversionRate = 106.77;
            }
            }

        case "EUR" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 53.09;
                case "USD" -> conversionRate = 1.04;
                case "GBP" -> conversionRate = 0.83;
                case "JPY" -> conversionRate = 163.22;
                case "SAR" -> conversionRate = 3.92;
                case "AED" -> conversionRate = 3.83;
                case "KWD" -> conversionRate = 0.32;
                case "INR" -> conversionRate = 88.60;
            }
            }

        case "JPY" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 0.33;
                case "USD" -> conversionRate = 0.0064;
                case "GBP" -> conversionRate = 0.0051;
                case "EUR" -> conversionRate = 0.0061;
                case "SAR" -> conversionRate = 0.024;
                case "AED" -> conversionRate = 0.023;
                case "KWD" -> conversionRate = 0.0020;
                case "INR" -> conversionRate = 0.54;
            }
            }

        case "SAR" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 13.55;
                case "USD" -> conversionRate = 0.27;
                case "GBP" -> conversionRate = 0.21;
                case "EUR" -> conversionRate = 0.26;
                case "JPY" -> conversionRate = 41.67;
                case "AED" -> conversionRate = 0.98;
                case "KWD" -> conversionRate = 0.082;
                case "INR" -> conversionRate = 22.61;
            }
            }

        case "AED" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 13.85;
                case "USD" -> conversionRate = 0.27;
                case "GBP" -> conversionRate = 0.22;
                case "EUR" -> conversionRate = 0.26;
                case "JPY" -> conversionRate = 42.62;
                case "SAR" -> conversionRate = 1.02;
                case "KWD" -> conversionRate = 0.084;
                case "INR" -> conversionRate = 23.14;
            }
            }
        case "KWD" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 165.23;
                case "USD" -> conversionRate = 3.25;
                case "GBP" -> conversionRate = 2.58;
                case "EUR" -> conversionRate = 3.11;
                case "JPY" -> conversionRate = 508.05;
                case "SAR" -> conversionRate = 12.20;
                case "AED" -> conversionRate = 11.93;
                case "INR" -> conversionRate = 275.86;
            }
            }
        case "INR" -> {
            switch (toCurrency) {
                case "EGP" -> conversionRate = 0.60;
                case "USD" -> conversionRate = 0.012;
                case "GBP" -> conversionRate = 0.0094;
                case "EUR" -> conversionRate = 0.011;
                case "JPY" -> conversionRate = 1.84;
                case "SAR" -> conversionRate = 0.044;
                case "AED" -> conversionRate = 0.043;
                case "KWD" -> conversionRate = 0.0036;
            }
            }
        default -> {
            return "Invalid Currency Conversion";
            }
    }

    return String.format("%.2f", amount * conversionRate);// Return the converted amount
} 
    
}
