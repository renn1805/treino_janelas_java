import javax.swing.*;

public class Exercicio7 {

    void main() {

        String[] cargos = {"Gerente", "Técnico", "Auxiliar", "Outros"};

        String nome = JOptionPane.showInputDialog(
                null,
                "Digite o nome"
        );

        String cargo = (String) JOptionPane.showInputDialog(
                null,
                "Escolha o cargo",
                "Cargo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                cargos,
                cargos[0]
        );

        String inputSalario = JOptionPane.showInputDialog(
                null,
                "Digite o salário"
        );
        final double salario = Double.parseDouble(inputSalario);

        double percentual = 0;
        if (cargo.equals("Gerente")) {
            percentual = 5;
        }
        if (cargo.equals("Técnico")) {
            percentual = 7.5;
        }
        if (cargo.equals("Auxiliar")) {
            percentual = 10;
        }
        if (cargo.equals("Outros")) {
            percentual = 4;
        }

        double aumento = salario * percentual / 100;
        double total = salario + aumento;

        String resultado = "Nome...:" + nome + "\n"
                + "Cargo...:" + cargo + "\n"
                + "Salario.:" + String.format("%.2f", salario) + "\n"
                + "Aumento de " + percentual + "%\n"
                + "Total..:" + String.format("%.2f", total);

        JOptionPane.showMessageDialog(
                null,
                resultado,
                "Cargos e Salários",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
