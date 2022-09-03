import javax.swing.JOptionPane;

public class Cifras{
    public static void main(String[] args) {
        // Declaración de variables e input 
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));

        // Processing and Output 
        String x = Integer.toString(numero);
        JOptionPane.showMessageDialog(null, numero + " tiene "+ x.length()+ " dígitos.");
        System.exit(0);
    }
}