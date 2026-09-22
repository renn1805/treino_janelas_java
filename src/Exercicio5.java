import javax.swing.*;

public class Exercicio5 {

    void main() {

        String[] moedas = {"Real", "Dólar"};

        String inputValor = JOptionPane.showInputDialog(
                null,
                "Digite o valor inicial"
        );
        final double valorInicial = Double.parseDouble(inputValor);

        String inputCotacao = JOptionPane.showInputDialog(
                null,
                "Digite a cotação do dólar"
        );
        final double cotacao = Double.parseDouble(inputCotacao);

        String moedaDe = (String) JOptionPane.showInputDialog(
                null,
                "Moeda de origem",
                "Moeda",
                JOptionPane.QUESTION_MESSAGE,
                null,
                moedas,
                moedas[0]
        );

        String moedaPara = (String) JOptionPane.showInputDialog(
                null,
                "Converter para",
                "Converte p/",
                JOptionPane.QUESTION_MESSAGE,
                null,
                moedas,
                moedas[1]
        );

        double resultado = valorInicial;

        if (moedaDe.equals("Real") && moedaPara.equals("Dólar")) {
            resultado = valorInicial / cotacao;
        }
        if (moedaDe.equals("Dólar") && moedaPara.equals("Real")) {
            resultado = valorInicial * cotacao;
        }

        JOptionPane.showMessageDialog(
                null,
                "Resultado: " + String.format("%.2f", resultado),
                "Conversão de Moeda",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
