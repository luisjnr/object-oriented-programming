import java.util.Scanner;

public class Pedido {

	public static void printFatura(Fatura[] fat, int m){
		if(m < 0) return;
		printFatura(fat, (m-1));
		System.out.println("Item: " + fat[m].numero + ", Descrição: " + fat[m].descricao + 
		", Valor da fatura: " + fat[m].getValorDaFatura());
	}
	
    public static void main(String[] args) {
		Fatura[] fat = new Fatura[2];
		fat[0] = new Fatura(1 ,2, "Bala", 2.0);
		fat[1] = new Fatura(2, 2, "Pirulito", 1.5);
		System.out.println("Faturas: ");
		printFatura(fat, (fat.length - 1));
    }

}
