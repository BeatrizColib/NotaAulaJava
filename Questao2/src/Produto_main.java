import java.util.Scanner;

public class Produto_main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        //atributos do produto
        System.out.println("----------Dados do produto----------");
        System.out.print("Código: ");
        produto.cod_produto = scanner.nextLine();
        System.out.print("Nome: ");
        produto.nome = scanner.nextLine();
        System.out.print("Peso (em gramas): ");
        produto.peso = sc.nextDouble();
        System.out.print("Cor: ");
        produto.cor = scanner.nextLine();
        System.out.print("Valor unitário: R$ ");
        produto.valor_produto = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        produto.quantidade_estoque = sc.nextInt();

        //venda
        System.out.print("Quantas unidades deseja comprar? ");
        produto.quantidade_compra = sc.nextInt();

        produto.cadastrar_venda();

        System.out.println();
        System.out.print("Qual forma de pagamento prefere? " +
                "\n1 - Pix/Transferência/Débito" +
                "\n2 - Espécie"+
                "\n3 - Crédito (até 3x sem juros)+" +
                "\nDigite o número equivalente a opção desejada: ");
        produto.forma_pagamento = sc.nextInt();

        if (produto.forma_pagamento == 2) {
            System.out.println();
            System.out.print("Quanto você tem em dinheiro? R$ ");
            produto.dinheiro_cliente = sc.nextInt();
        }

        System.out.println();
        produto.pagar_venda();
        System.out.println();
        produto.exibir_relatorio();

        scanner.close();
        sc.close();

        System.out.println();
        System.out.println("----------VOLTE SEMPRE---------");
    }
}