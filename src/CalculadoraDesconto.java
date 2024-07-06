public class CalculadoraDesconto {

    double salario, valorDesconto;
    String nome;

    double Desconto() {

        return valorDesconto = (salario * valorDesconto) / 100;
    }

    double NovoSalario() {

        return salario - Desconto();
    }

    public  String toString() {

        return "Salario atual: " +
        salario +
        "\nNovo salario: " + String.format("%.2f%n" , NovoSalario());

    }
}
