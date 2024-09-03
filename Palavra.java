import javax.swing.JOptionPane;

public class Palavra{
    public static void main(String[] args) {
    
        String palavra = JOptionPane.showInputDialog("Informe uma palavra: ").toLowerCase();

        int contador = 0;
        char caracter ='a';

        for (int i = 0; i< palavra.length(); i++){
            if (palavra.charAt(i) == caracter){
                contador++;
            }
        }
        
        JOptionPane.showMessageDialog(null,"A palavra informada tem: " + contador +" letra(s) 'a' informada.");

    }
}