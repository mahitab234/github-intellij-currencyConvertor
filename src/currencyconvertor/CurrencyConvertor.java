package currencyconvertor;

import javax.swing.SwingUtilities;

public class CurrencyConvertor {
    public static void main(String[] args) {      
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
            }
        });
    }
    
}
