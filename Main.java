import javax.swing.JOptionPane;

/**
 * Main
 */
public class Main {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static void mostrarResultado(double resultado) {
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {

        int opcion;
        double num1, num2;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Sumar\n2.- Restar\n3.- Multiplicar", "Menú", JOptionPane.INFORMATION_MESSAGE)); 
        
        switch(opcion) {
            case 1:
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un número para sumar: ", "Suma", JOptionPane.INFORMATION_MESSAGE));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un número para sumar: ", "Suma", JOptionPane.INFORMATION_MESSAGE));

                mostrarResultado(sumar(num1, num2));
                break;

            case 2:
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un número para restar: ", "Resta", JOptionPane.INFORMATION_MESSAGE));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un número para restar: ", "Resta", JOptionPane.INFORMATION_MESSAGE));

                mostrarResultado(restar(num1, num2));
                break;

            case 3:
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un número para multiplicar: ", "Multiplicación", JOptionPane.INFORMATION_MESSAGE));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce un número para multiplicar: ", "Multiplicación", JOptionPane.INFORMATION_MESSAGE));

                mostrarResultado(multiplicar(num1, num2));
                break;

        }
    
    }
}