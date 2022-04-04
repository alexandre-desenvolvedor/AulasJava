import java.util.Scanner;

public class VendaTop {

	public static void main(String[] args) {
		
		int prod1 = 4500;
		int prod2 = 4000;
		int prod3 = 2200;
		int prod4 = 3000;
		int totaltemp;
		int desconto;
		int totalfinal;
		
		String prod = "";
		double control = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Olá nobre cliente! Os produtos que temos disponíveis atualmente são:");
		System.out.println("PS5 = R$ 4500");
		System.out.println("XBOX Series X = R$ 4000");
		System.out.println("Steam = R$ 3000");
		System.out.println("Nintendo Switch = R$ 2200");
		
		System.out.println("Digite o produto escolhido: ");
		System.out.println("PS5 para PlayStation 5");
		System.out.println("XBOX para Xbox Series X");
		System.out.println("STEAM para Steam Deck");
		System.out.println("SWITCH para Nintendo Switch");
		prod = entrada.nextLine();
		
		if(prod.equals("PS5")) {
			totaltemp = prod1;
			desconto = totaltemp*10/100;
			totalfinal = totaltemp - desconto;
			System.out.println("OBA! Você achou  promoção de 10% de desconto!");
			System.out.println("Portanto o valor total é: " + totalfinal);
		}
		if(prod.equals("XBOX")) {
			System.out.println("O total é 4000");
		}
		if(prod.equals("SWITCH")) {
			System.out.println("O total é 2200");
		}
		if(prod.equals("STEAM")) {
			System.out.println("O total é 3000");
		}
		
	}

}
