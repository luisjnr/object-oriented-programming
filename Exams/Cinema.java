public class Cinema {
	
	public static void main (String[] args) {
		
		InterfaceCinema inter = new InterfaceCinema();
		
		System.out.println("CADASTRO SESSÃO");
		System.out.println("NÚMERO DA SALA: ");
		int numeroDaSala = inter.scan.nextInt();
		inter.scan.nextLine();
		System.out.println("FILME: ");
		String filme = inter.scan.nextLine();
		System.out.println("CAPACIDADE: ");
		int capacidade = inter.scan.nextInt();
		inter.scan.nextLine();
		System.out.println("INSERIR PREÇO? S/N");
		double precoIngresso;
		if(inter.scan.nextLine().equalsIgnoreCase("S")){
			System.out.println("PREÇO: ");
			precoIngresso = inter.scan.nextInt();
		}
		else
			precoIngresso = 25;
				
		SessaoCinema sessao = new SessaoCinema(numeroDaSala, filme, capacidade, precoIngresso);

		do{
			System.out.println("SESSÕES");
			switch (inter.menu(("1 - " + sessao.getFilme() + "\n2 - Encerrar"))){
				case 1: inter.metodos(sessao);
					
					break;
					
				case 2:	return;

				default: System.out.println("Digite uma opção válida.");
			}
			
		} while (true);
		
	}
}

