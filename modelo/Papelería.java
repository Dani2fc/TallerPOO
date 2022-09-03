import javax.swing.JOptionPane;

public class Papelería {
    public static void main(String[] args) {
        // Declaración de variables 
        int precioCosto;
        int ganancia;
        int precioTotal = 0;

        // Input 
        precioCosto = Integer.parseInt(JOptionPane.showInputDialog("Digite el costo del producto: "));

        // Processing 
        if(precioCosto<3000){
            ganancia = (int) (precioCosto*0.15);
            precioTotal = precioCosto + ganancia;      
        }else{
            ganancia = 500;
                precioTotal = precioCosto + ganancia;
        }
        if(precioCosto>6000){
            ganancia = (int) (precioCosto*0.25);
            precioTotal = precioCosto + ganancia;
        }

        // Output 
        JOptionPane.showMessageDialog(null, "El costo total a vender por el producto es de: "+ precioTotal);
        System.exit(0);
    }
}
