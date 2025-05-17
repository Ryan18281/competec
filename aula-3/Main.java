import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("murrylo pode melhorar");
		
		
		Scanner entrada = new Scanner(System.in);
	System.out.println("selecione o que gostaria de pedir:");
	int pedido = entrada.nextInt();	
	double hot_dog = 19.99;
	double batata_frita_queijo = 29.99;	
	double nuggets_e_batata = 25.50;
	double sprit = 9;
	double coca = 10;
	
	int cupom_legal = 20;
	
	double cesta_do_andre = 50;
	cesta_do_andre += 3*hot_dog;
	cesta_do_andre += 1*nuggets_e_batata;
    cesta_do_andre += 1*coca;
    cesta_do_andre -= (cesta_do_andre*cupom_legal)/100;

    
    //System.out.println("total:"+ cesta_do_andre);
	}	
}	
