import java.util.Scanner;

public class FormaGeometrica {
	
	public static void printQuadrado(Quadrado[] quad, int m){
		if(m<0) return;
		printQuadrado(quad, (m-1));
		System.out.println("Área: " + quad[m].calculaArea() + " Perímetro: " + quad[m].calculaPerimetro());		
	}	

    public static void main(String[] args) {
		Quadrado[] quad = new Quadrado[2];
		quad[0] = new Quadrado(2.0);
		quad[1] = new Quadrado(3.0);
		
		System.out.println("Quadrados ");
		
		printQuadrado(quad, (quad.length-1));
    }

}
