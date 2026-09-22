import javax.swing.*;

public class Exercicio4 {

    void main() {

        String nome = JOptionPane.showInputDialog(
                null,
                "Digite o nome"
        );

        String[] sexos = {"Masculino", "Feminino"};

        String sexo = (String) JOptionPane.showInputDialog(
                null,
                "Escolha o sexo",
                "Sexo",
                JOptionPane.QUESTION_MESSAGE,
                null,
                sexos,
                sexos[0]
        );

        String tratamento = "Senhor";
        if (sexo.equals("Feminino")) {
            tratamento = "Senhora";
        }

        JOptionPane.showMessageDialog(
                null,
                "Sejas bem vindo " + tratamento + " " + nome,
                "Apresentação",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
