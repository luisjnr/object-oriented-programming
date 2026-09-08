import java.util.Scanner;

public class InterfaceCarro {
	
	private int selecao(){
		System.out.println("1 - Carro Econômico\n" + 
		"2 - Carro Suv\n" + "3 - Carro de Luxo");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	private void metodos(Veiculo car){
		int dias, kmRodados; 
		boolean seguro;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de dias: ");
		dias = scan.nextInt();
		System.out.println("Digite a quantidade de quilômetros: ");
		kmRodados = scan.nextInt();
		System.out.println("Possui seguro?\n" + "1 - Sim\n" + "2 - Não");
		seguro = (scan.nextInt() == 1 ? true : false);
		System.out.println("\nDestalhes do Veículo: \n" 
		+ car.exibirDetalhes());
		System.out.println("Locação por dia: R$" 
		+ car.calcularLocacao(dias));
		System.out.println("Locação por dia e quilômetragem: R$" 
		+ car.calcularLocacao(dias, kmRodados));
		System.out.println("Locação por dia, quilômetragem e seguro: R$" 
		+ car.calcularLocacao(dias, kmRodados, seguro) + "\n");
	}
	
	public void menuCarro(Veiculo[] car){
		do{
			switch (selecao()){
				case 1: metodos(car[0]);
					
					break;
				case 2: metodos(car[1]);
					
					break;
				case 3: metodos(car[2]);
					
					break;
				default: System.out.println("Digite uma opção válida.");
			}
		} while (true);
	}
}
