import javax.swing.*;

public class Exercicio2 {

    public static void main(String[] args) {
        String[] tipos = {"Física", "Jurídica"};

        String tipoPessoa = (String) JOptionPane.showInputDialog(
                null,
                "Escolha o tipo de pessoa",
                "Tipo de Pessoa",
                JOptionPane.QUESTION_MESSAGE,
                null,
                tipos,
                tipos[0]
        );

        String rotulo = "CPF";
        if (tipoPessoa.equals("Jurídica")) {
            rotulo = "CNPJ";
        }

        String valorDocumento = JOptionPane.showInputDialog(
                null,
                "Digite o " + rotulo
        );

        String resultado = "Tipo de Pessoa: " + tipoPessoa
                + "\n" + rotulo + ": " + valorDocumento;

        JOptionPane.showMessageDialog(
                null,
                resultado,
                "Cadastro",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
