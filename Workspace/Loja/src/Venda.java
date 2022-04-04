
public class Venda {

	public static void main(String[] args) {
	
	/*VARIÁVEIS*/	
		double prod1 = 450;
		double prod2 = 300;
		double totaltemp;
		double desconto;
		double totalfinal;
	
	/*CONTAS*/
	totaltemp = prod1 + prod2;
	desconto = totaltemp*15/100;
	totalfinal = totaltemp - desconto;
	
	/*UI*/
	System.out.println("Valor do produto 1: R$" + prod1);
	System.out.println("Valor do produto 2: R$" + prod2);
	System.out.println("Desconto de: R$" + desconto);
	System.out.println("Valor sem desconto: R$" + totaltemp);
	System.out.println("O total a pagar com desconto é : R$" + totalfinal);
	}

}
