import javax.swing.JOptionPane;

public class SumaYPromedioParesDe5 {
    public static void main(String[] args) {
        double M, N, O, P, Suma = 0, Contador = 0;
        double Promedio;
        M = Integer.parseInt(JOptionPane.showInputDialog("Digite el número inicial: "));
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite el número final: "));
        O = N - M;
        P = O;

        while (0 <= O) 
        {
            if (M % 5 == 0) 
            {
                Suma += M;
                Contador++;
            }
            M++;
            O -= 1;
        }

        M -= P + 1;
        Promedio = Suma / Contador;
        JOptionPane.showMessageDialog(null, "La suma de los múltiplos de 5 en el rango indicado " + "[" + M + " , " + N
                + "]" + "\nEs: " + Suma + "\nEl promedio es: " + Promedio);
        System.exit(0);
    }
}
