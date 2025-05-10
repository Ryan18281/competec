import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("os nomes sao diferentes?:");
		
	boolean andre = true;
	boolean matheus = false;
	boolean comparacao = andre != matheus;
		 System.out.println(andre != matheus);
		 

		 
	System.out.print("as idades sao iguais?:");
		
	int Andre= 15;
	int itu = 21;
	
	System.out.println(Andre == itu);
	
	System.out.print("a idade de golden e diferentes de felps?:");
	
	int golden = 16;
	int felps = 30;
	
	System.out.println(golden != felps);
	

	boolean estaChovendo = true;	
	boolean estaTrovejando = true;	
		
	if (estaChovendo&&estaTrovejando){	
		System.out.println("esta chovendo muito nao sai");
	}
	boolean macarrao = false;	
	boolean estrogonofe = false;	
		
	if (macarrao||estrogonofe){
		System.out.print("vou ficar feliz");
	
	
	}else {System.out.print("vou ficar triste");}
	
	
	
}}
