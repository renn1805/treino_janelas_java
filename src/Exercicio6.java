import javax.swing.*;

public class Exercicio6 {


    public static void main(String[] args) {
        class Produto {
            private final String nome;
            private final double preco;
            private int quantidade = 0;

            public Produto(String nome, double preco) {
                this.nome = nome;
                this.preco = preco;
            }

            public String getNome() {
                return nome;
            }

            public double getPreco() {
                return preco;
            }

            public int getQuantidade() {
                return quantidade;
            }

            public void setQuantidade(int quantidade) {
                this.quantidade = quantidade;
            }
        }


        Produto[] produtos = {
                new Produto("Rapadura", 1.50),
                new Produto("Inhame", 3.00),
                new Produto("Cupuaçu", 1.10),
                new Produto("Sandálias", 12.35),
                new Produto("Bolacha", 1.85),
                new Produto("Sabão", 0.80),
                new Produto("Pinico", 11.17)
        };

        for (Produto produto : produtos) {

            int opcao = JOptionPane.showConfirmDialog(
                    null,
                    "Deseja comprar " + produto.getNome()
                            + " (R$ " + String.format("%.2f", produto.getPreco()) + ")?",
                    "Mercadinho do Filhinho",
                    JOptionPane.YES_NO_OPTION
            );

            if (opcao == JOptionPane.YES_OPTION) {
                String inputQuantidade = JOptionPane.showInputDialog(
                        null,
                        "Quantos " + produto.getNome() + " você quer?"
                );
                produto.setQuantidade(Integer.parseInt(inputQuantidade));
            }
        }

        double total = 0;
        String resultado = "Compra:\n\n";

        for (Produto produto : produtos) {
            if (produto.getQuantidade() > 0) {
                double subtotal = produto.getQuantidade() * produto.getPreco();
                total += subtotal;
                resultado += produto.getQuantidade() + " x " + produto.getNome()
                        + " = R$ " + String.format("%.2f", subtotal) + "\n";
            }
        }

        resultado += "\nTotal a pagar: R$ " + String.format("%.2f", total);

        JOptionPane.showMessageDialog(
                null,
                resultado,
                "Mercadinho do Filhinho",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
