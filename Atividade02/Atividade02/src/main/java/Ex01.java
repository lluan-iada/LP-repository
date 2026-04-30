import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        final String ANSI_RED = "\u001b[31m";
        final String ANSI_RESET = "\u001B[0m";
        Scanner scanner = new Scanner(System.in);

        Empregado funcionario1 = new Empregado();
        funcionario1.TesteEmpregado();
        funcionario1.ReajustarIlario();

        System.out.println(ANSI_RED + "Informe um novo funcionário" + ANSI_RESET);

        Empregado funcionario2 = new Empregado();
        System.out.println("Informe seu nome: ");
        funcionario2.nome = scanner.nextLine();

        System.out.println("Informe seu cargo: ");
        funcionario2.cargo = scanner.nextLine();
        System.out.println("Informe seu salário: ");
        funcionario2.salario = scanner.nextDouble();

        funcionario2.TesteEmpregado();
        funcionario2.ReajustarIlario();
        }
    }

