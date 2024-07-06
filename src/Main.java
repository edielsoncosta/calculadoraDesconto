import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        CalculadoraDesconto calculadoraDeDesconto = new CalculadoraDesconto();

        System.out.println("nome: ");
        calculadoraDeDesconto.nome = sc.next();
        System.out.println("Salario atual: ");
        calculadoraDeDesconto.salario = sc.nextDouble();
        System.out.println("qual a porcentagem de desconto: ");
        calculadoraDeDesconto.valorDesconto = sc.nextDouble();

        System.out.println(calculadoraDeDesconto);
    }
}