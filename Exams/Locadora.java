import java.util.Scanner;

public class Locadora {

    public static void main(String[] args) {
		Veiculo car[] = new Veiculo[3];
		car[0] = new Veiculo("J3KZ-4E95", "FIAT UNO", "ECONOMICO");
		car[1] = new Veiculo("CJF8-FJ87", "HILUX", "SUV");
		car[2] = new Veiculo("L4KW-FJK4", "MUSTANG", "LUXO");
		InterfaceCarro menu = new InterfaceCarro();
		menu.menuCarro(car);	
    }
}
