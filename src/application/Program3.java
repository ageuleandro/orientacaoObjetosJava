package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee empregado = new Employee();
		
		System.out.print("Nome: ");
		empregado.name = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		empregado.grossSalary = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Imposto: ");
		empregado.tax = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Funcionário: "+empregado);

		System.out.print("Qual a porcentagem para aumentar o salário? ");
		empregado.increaseSalary(sc.nextDouble());
		
		System.out.println("Dados atualizados: "+empregado);

		
		
		
		
		
		
		
		
		
	}

}
