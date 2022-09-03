import javax.swing.JOptionPane;

public class Capital {
    public static void main(String[] args) {
        int capital1;
        int capital2;
        int capital3;
        int meses;

        capital1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad: "));
        capital2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad: "));
        capital3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad: "));
        meses = 0;

        while (capital1 + capital2 < capital3) {
            capital1 += (capital1 * 0.03);
            capital2 += (capital2 * 0.04);
            meses++;
        }

        JOptionPane.showMessageDialog(null,
                "Para alcanzar el capital deseado de " + capital3 + " pesos, se tardarían un total de " + meses + " meses.");
        System.exit(0);
    }
}
