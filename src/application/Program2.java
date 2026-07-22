package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
//Comentario1
//Comentario2
//Comentario3
public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product p1 = new Product();
				
		System.out.println("Dados do Produto:");
		System.out.print("Nome: ");
		p1.name = sc.nextLine();
		
		System.out.print("Preço: ");
		p1.price = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Quantidade no Estoque: ");
		p1.quantity = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Dados do Produto cadastrado: ");	
		System.out.println(p1);
		
		System.out.print("Adicionar quantos ao estoque?");
		p1.addProducts(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Dados do Produto cadastrado ATUALIZADO: ");
		System.out.println(p1);
		
		System.out.print("Remover quantos do estoque?");
		p1.removeProducts(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Dados do Produto cadastrado ATUALIZADO: ");
		System.out.println(p1);		
		
		
		sc.close();
		

	}

}
