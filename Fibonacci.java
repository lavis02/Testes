import javax.swing.JOptionPane;
public class Fibonacci {
    public static void main(String[] args) {
  
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro por favor:"));

        if (pertenceAFibonacci(numero)) {
            JOptionPane.showMessageDialog(null, "O número " + numero + " pertence a sequência de Fibonacci!");
        } else {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não pertence a sequência de Fibonacci!");
        }
        
    }

    public static boolean pertenceAFibonacci(int numero) {
        int a = 0, b = 1;
        
        if (numero == a || numero == b) {
            return true;
        }
        
        while (b < numero) {
            int sequencia = a + b;
            a = b;
            b = sequencia;
        }
        
        return b == numero;
        
    }
    
}
