import java.util.Scanner;

public class Loja {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static int menu(String frase){
		System.out.println(frase);
		int opc = scan.nextInt();
		scan.nextLine();
		return opc;
	}
	
	public static void funcoes(Produto prod){
		switch (menu(("1 - Vender Produto\n2 - Comprar Produto\n" + 
		"3 - Calcular Valor do Estoque\n4 - Exibir Detalhes\n5 - Encerrar"))){
			case 1: System.out.println("Com desconto? S/N"); 
				if(scan.nextLine().equalsIgnoreCase("S")){
					System.out.println("Digite a quantidade e o desconto em sequência:");
					System.out.println("Valor Total: " + prod.vender(scan.nextInt(), scan.nextDouble()));
				}
				else{
					System.out.println("Digite a quantidade:");
					System.out.println("Valor Total: " + prod.vender(scan.nextInt()));
				}
				break;
				
			case 2: System.out.println("Com frete? S/N"); 
				if(scan.nextLine().equalsIgnoreCase("S")){
					System.out.println("Digite a quantidade e o frete em sequência:");
					System.out.println("Valor Total: " + prod.comprar(scan.nextInt(), scan.nextDouble()));
				}
				else{
					System.out.println("Digite a quantidade:");
					System.out.println("Valor Total: " + prod.comprar(scan.nextInt()));
				}	
				break;
				
			case 3: System.out.println("Com imposto? S/N"); 
				if(scan.nextLine().equalsIgnoreCase("S")){
					System.out.println("Digite o imposto:");
					System.out.println("Valor Total: " + prod.calcularValorTotalEstoque(scan.nextDouble()));
				}
				else
					System.out.println("Valor Total: " + prod.calcularValorTotalEstoque());
				break;
				
			case 4: System.out.println("Com estoque? S/N"); 
				if(scan.nextLine().equalsIgnoreCase("S")){
					System.out.println(prod.exibirDetalhes(true) + "\n");
				}
				else
					System.out.println(prod.exibirDetalhes() + "\n");
				break;
				
			case 5: return;
			default: System.out.println("Digite uma opção válida.");
					
		}
	}

	public static void main (String[] args) {
		Produto[] prod = new Produto[3];
		
		prod[0] = new Produto("Bala", 0.5, 10, "Doces");
		prod[1] = new Produto("Pirulito", 1.5, 15, "Doces");
		prod[2] = new Produto("Fini", 5.5, 20, "Doces");
		
		do{
			switch (menu("1 - Bala\n2 - Pirulito\n3 - Fini\n4 - Encerrar")){
				case 1: funcoes(prod[0]);
					
					break;
				case 2: funcoes(prod[1]);
					
					break;
				case 3: funcoes(prod[2]);
					
					break;
				case 4: return;
				default: System.out.println("Digite uma opção válida.");
					
			}
			
		} while (true);
		
	}
}

