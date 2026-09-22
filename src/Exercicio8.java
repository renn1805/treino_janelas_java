import javax.swing.*;

public class Exercicio8 {

    void main() {

        String[] sexos = {"Mulher", "Homem"};

        String sexo = (String) JOptionPane.showInputDialog(
                null,
                "Escolha o sexo",
                "Sexo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                sexos,
                sexos[0]
        );

        String inputAltura = JOptionPane.showInputDialog(
                null,
                "Digite a altura em cm"
        );
        final double alturaCm = Double.parseDouble(inputAltura);

        String inputPeso = JOptionPane.showInputDialog(
                null,
                "Digite o peso em Kg"
        );
        final double peso = Double.parseDouble(inputPeso);

        double alturaM = alturaCm / 100;
        double imc = peso / (alturaM * alturaM);

        String situacao = "";
        if (imc < 17) {
            situacao = "Muito abaixo do peso";
        }
        if (imc >= 17 && imc < 18.5) {
            situacao = "Abaixo do peso";
        }
        if (imc >= 18.5 && imc < 25) {
            situacao = "Peso normal";
        }
        if (imc >= 25 && imc < 30) {
            situacao = "Acima do peso";
        }
        if (imc >= 30 && imc < 35) {
            situacao = "Obesidade I";
        }
        if (imc >= 35 && imc < 40) {
            situacao = "Obesidade II (severa)";
        }
        if (imc >= 40) {
            situacao = "Obesidade III (mórbida)";
        }

        String aviso = "";
        if (imc < 18.5 || imc >= 25) {
            aviso = "CUIDADO!!! ";
        }

        JOptionPane.showMessageDialog(
                null,
                aviso + "Você está: " + situacao + "\nIMC: " + String.format("%.2f", imc),
                "Cálculo do IMC",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
