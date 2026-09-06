import java.util.Scanner;

public class Locadora {

	public static int menu(){
		System.out.println("1 - Carro Econômico\n" + 
		"2 - Carro Suv\n" + "3 - Carro de Luxo\n");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}
	
	public static void imput(int dias, int kmRodados, boolean seguro){
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de dias: ");
		dias = scan.nextInt();
		System.out.println("Digite a quantidade de quuilômetros: ");
		kmRodados = scan.nextInt();
		System.out.println("Possui seguro?\n" + "1 - Sim\n" + "2 - Não");
	}

    public static void main(String[] args) {
		Veiculo car[] = new Veiculo[3];
		Scanner scan = new Scanner(System.in);
		car[0] = new Veiculo("J3KZ-4E95", "FIAT UNO", "ECONOMICO");
		car[1] = new Veiculo("CJF8-FJ87", "HILUX", "SUV");
		car[2] = new Veiculo("L4KW-FJK4", "MUSTANG", "LUXO");
		
		int dias, kmRodados;
		boolean seguro;
		
		do{
			switch (menu()){
				case 1: imput();
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				default: System.out.println("Digite uma opção válida.");
			}
		} while (true);
		
    }
}
