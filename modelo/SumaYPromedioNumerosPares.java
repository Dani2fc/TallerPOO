import javax.swing.JOptionPane;

public class SumaYPromedioNumerosPares {
    public static void main(String[] args) {
        
        // Decalración de variables 
        int k;
        int suma = 0;
        int promedio = 0;

        // Input 
        k = Integer.parseInt(JOptionPane.showInputDialog("Digíta un número: "));

        // Processing
        for(int i=0; i>=k; i++){
            if(i%2==0){
                suma = (i*(i+1)/2);
            }
        } 

        // Output 
        JOptionPane.showMessageDialog(null, "La suma de los numeros pares de "+ k+ " es: "+ suma+ "\n y el promedio es: ");
        System.exit(0);
    }
}