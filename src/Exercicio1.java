import javax.swing.*;

public class Exercicio1 {

    private class Numerario {
        private final int valorCentavos;
        private int quantidadeContada = 0;

        public Numerario(int valorCentavos) {
            this.valorCentavos = valorCentavos;
        }

        public int getValorCentavos() {
            return valorCentavos;
        }

        public int getQuantidadeContada() {
            return quantidadeContada;
        }

        public void setQuantidadeContada(int quantidadeContada) {
            this.quantidadeContada = quantidadeContada;
        }
    }

    void main() {

        Numerario[] numerarios = {
                new Numerario(10000),
                new Numerario(5000),
                new Numerario(2000),
                new Numerario(1000),
                new Numerario(500),
                new Numerario(200),
                new Numerario(100),
                new Numerario(50),
                new Numerario(25),
                new Numerario(10),
                new Numerario(5),
                new Numerario(1)
        };

        String input = JOptionPane.showInputDialog(
                null,
                "Digite o valor do troco"
        );

        final double valorTroco = Double.parseDouble(input);
        int valorRestante = (int) Math.round(valorTroco * 100);

        for (Numerario numerario : numerarios) {
            int qntUsada =
                    valorRestante / numerario.getValorCentavos();

            numerario.setQuantidadeContada(qntUsada);

            valorRestante %= numerario.getValorCentavos();
        }

        String resultado = "Troco: " + valorTroco + "\n\nNumerários:\n";

        for (Numerario numerario : numerarios) {

            if (numerario.getQuantidadeContada() > 0) {
                resultado +=
                        numerario.getQuantidadeContada()
                                + " - R$ "
                                + String.format(
                                "%.2f",
                                (double) numerario.getValorCentavos() / 100
                        )
                                + "\n";
            }
        }

        JOptionPane.showMessageDialog(
                null,
                resultado,
                "Troco",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
