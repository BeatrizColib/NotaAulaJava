public class Produto {
    //atributos produto
    String cod_produto;
    String nome;
    double peso;
    String cor;
    double valor_produto;
    int quantidade_estoque;
    //venda
    int quantidade_compra;
    double valor_venda;
    int forma_pagamento;
    int dinheiro_cliente;
    double valor_final;

    public void cadastrar_venda() {
        valor_venda = quantidade_compra * valor_produto;
        quantidade_estoque -= quantidade_compra;
    }

    public void pagar_venda() {
        switch (forma_pagamento) {
            case 1:
                valor_final = valor_venda * 0.95;
                System.out.println("O valor final com 5% de desconto é: R$ " + valor_final);
                break;
            case 2:
                valor_final = valor_venda * 0.95;
                System.out.println("O valor final com 5% de desconto é R$ " + valor_final);
                if (dinheiro_cliente > valor_final) {
                    double troco = dinheiro_cliente - valor_final;
                    System.out.println("O troco será de: R$ " + troco);
                } else if (dinheiro_cliente < valor_final) {
                    System.out.println("Compra inválida! Valor abaixo do valor final.");
                } else if (dinheiro_cliente == valor_final) {
                    System.out.println("Neste caso, não precisa de troco.");
                }
                break;
            case 3:
                System.out.println("O valor de R$ " + valor_venda + " pode ser parcelado em " +
                        "até 3x sem juros: " +
                        "\nVencimento: R$ " + valor_venda +
                        "\n2x de R$ " + valor_venda/2 +
                        "\n3x de R$ " + valor_venda/3);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    public void exibir_relatorio() {
        System.out.println("----------Resumo da venda----------"+
                "\nProduto: "+nome+ " / " + cod_produto + " / " + cor +
                "\nQuantidade: "+quantidade_compra+
                "\nPeso final em gramas: "+ (peso*quantidade_compra)+
                "\nQuantidade restante em estoque: "+quantidade_estoque);
    }
}