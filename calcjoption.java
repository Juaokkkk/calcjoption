import javax.swing.JOptionPane;

public class arquivoaula {
    public static void main(String args[]) {

        String num = JOptionPane.showInputDialog(null, "Digite um numero:");
        String num2 = JOptionPane.showInputDialog(null, "Digite outro numero:");
        String operacao = JOptionPane.showInputDialog(null, "Que operação deseja fazer");

        int number = Integer.parseInt(num);
        int number2 = Integer.parseInt(num2);
        int resultado;

        switch (operacao) {
            case "+":
                resultado = number + number2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
                break;

            case "-":
                resultado = number - number2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
                break;

            case "*":
                resultado = number * number2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
                break;

            case "/":
                resultado = number / number2;
                JOptionPane.showMessageDialog(null, "o resultado é: " + resultado);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Digite um caracter valido.");
        }

        int message = JOptionPane.showConfirmDialog(null, "gostou?");

        if (message == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "obrigado");
        } else {
            JOptionPane.showMessageDialog(null, "affs");
        }
    }
}
