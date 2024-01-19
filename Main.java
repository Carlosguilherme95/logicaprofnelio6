import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("Valor recebido por hora:");
        Float valorHr = Float.valueOf(scanner.nextLine());
        System.out.println("Digite a quantidade de horas trabalhadas:");
        Float horaTrab = Float.valueOf(scanner.nextLine());
        salario(valorHr,horaTrab,nome);

    }

    private static void salario(Float valorHr, Float horaTrab,String nome) {
        System.out.println("O pagamento para "+ nome +" deve ser " + (valorHr * horaTrab));
    }
}

/**
 * Problema "pagamento"
 * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a
 * quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com
 * uma mensagem explicativa, conforme exemplo.
 * O pagamento para Joao Silva deve ser 3000.00
 */