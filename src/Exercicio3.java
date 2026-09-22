import javax.swing.*;

public class Exercicio3 {

    public static void main(String[] args) {

        String[] unidades = {"Celsius", "Kelvin", "Fahrenheit"};

        String input = JOptionPane.showInputDialog(
                null,
                "Digite a temperatura"
        );
        final double valor = Double.parseDouble(input);

        String unidadeDe = (String) JOptionPane.showInputDialog(
                null,
                "A temperatura digitada está em:",
                "Temperatura",
                JOptionPane.QUESTION_MESSAGE,
                null,
                unidades,
                unidades[0]
        );

        String unidadePara = (String) JOptionPane.showInputDialog(
                null,
                "Converter para:",
                "Converte p/",
                JOptionPane.QUESTION_MESSAGE,
                null,
                unidades,
                unidades[0]
        );

        double celsius = 0;
        if (unidadeDe.equals("Celsius")) {
            celsius = valor;
        }
        if (unidadeDe.equals("Kelvin")) {
            celsius = valor - 273.15;
        }
        if (unidadeDe.equals("Fahrenheit")) {
            celsius = (valor - 32) / 1.8;
        }

        double resultado = 0;
        if (unidadePara.equals("Celsius")) {
            resultado = celsius;
        }
        if (unidadePara.equals("Kelvin")) {
            resultado = celsius + 273.15;
        }
        if (unidadePara.equals("Fahrenheit")) {
            resultado = celsius * 1.8 + 32;
        }

        JOptionPane.showMessageDialog(
                null,
                "Resposta: " + String.format("%.2f", resultado),
                "Conversão de Temperatura",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
