import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int escolha;
        Scanner input = new Scanner(System.in);

        System.out.println("Qual exercicio você deseja?: ");
        escolha = input.nextInt();

        switch (escolha){
        case 1 -> {
            System.out.println("EXERCICIO 1");
            double valorVenda = 0, valorComissao;
            boolean repeticao;
            do{
                try{
                    do {
                        System.out.println("Valor das vendas: ");
                        valorVenda = input.nextDouble();
                        repeticao = true;
                    }while(valorVenda < 0);
                }catch(InputMismatchException ime){
                    System.out.println("Digite números");
                    repeticao = false;
                    input.next();
                }
                }while(repeticao == false);
            if (valorVenda > 999) {
                if (valorVenda > 9999) {
                    if (valorVenda < 99999){
                        valorComissao = (((valorVenda - 9999) * 0.1) + 9000 * 0.05) + 999 * 0.01;
                    }
                    else {
                        valorComissao = ((90000 * 0.1) + 9000 * 0.05) + 999 * 0.01;
                    }
                }
                else {
                    valorComissao = ((valorVenda - 999) * 0.05) + 999 * 0.01;
                }
            }
            else {
                valorComissao = valorVenda * 0.01;
            }
            System.out.printf("Valor da comissão: R$%.2f", valorComissao);

        }
        case 2 ->{
            double lado1= 0, lado2 = 0,lado3 = 0;
            boolean repeticao1;
            do {
                try {
                    do{
                        System.out.println("Digite o Valor do lado1: ");
                        lado1 = input.nextDouble();}
                    while(lado1<0);
                    do{
                        System.out.println("Digite o Valor do lado2: ");
                        lado2 = input.nextDouble();}
                    while(lado2<0);
                    do{
                        System.out.println("Digite o Valor do lado3: ");
                        lado3 = input.nextDouble();}
                    while(lado3<0);
                    repeticao1 = true;
                } catch (InputMismatchException ime) {
                    System.out.println("Digite um número!");
                    repeticao1 = false;
                    input.next();
                }
            }while (repeticao1 == false);
            if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
                if (lado1 == lado2 && lado1 == lado3) {
                    System.out.println("Esse triângulo é equilátero");
                }
                else if (lado1 == lado2 && lado1 != lado3 || lado2 != lado1 && lado2 == lado3 || lado2 != lado3 && lado1 == lado3) {
                    System.out.println("Esse triângulo é isósceles");
                }
                else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
                    System.out.println("Esse triãngulo é escaleno");
                }
            }
            else{
                System.out.println("Não é triângulo");
            }
        }
        case 3 -> {
            System.out.println("Exercicio 3");
            int tempoCliente = 0, comprasMes = 0;
            double valorCompra, valorCompraInicial = 0, valorDesconto = 0, valorParaDescontar;
            boolean repeticao2;
            do{
                try{
                    do{
                        System.out.println("Tempo como cliente (em anos): ");
                        tempoCliente = input.nextInt();}
                    while(tempoCliente < 0);
                    do{
                        System.out.println("Valor da compra: ");
                        valorCompraInicial = input.nextDouble();}
                    while(valorCompraInicial < 0);
                    do{
                        System.out.println("Compras no mês: ");
                        comprasMes = input.nextInt();}
                    while(comprasMes < 0);
                    repeticao2 = true;
                }
                catch (InputMismatchException ime){
                    System.out.println("Digite um número");
                    repeticao2 = false;
                    input.next();
                }
            }while (repeticao2 == false);
            if (tempoCliente > 10){
                valorDesconto = valorDesconto + 15;
            }
            if (valorCompraInicial > 1500){
                valorDesconto = valorDesconto + 17;
            }
            if (comprasMes > 5){
                valorDesconto = valorDesconto + 13;
            }
            valorParaDescontar = valorCompraInicial * (valorDesconto/100);
            valorCompra = valorCompraInicial - valorParaDescontar;
            if (valorCompra == valorCompraInicial){
                System.out.printf("A compra de R$%.2f não teve descontos", valorCompraInicial);
            }
            else {
                System.out.printf("Porcentagem de desconto: " + valorDesconto + "\nValor do desconto: R$%.2f\nValor final da compra: R$%.2f",valorParaDescontar,valorCompra);
            }
        }
        }
    }
}
